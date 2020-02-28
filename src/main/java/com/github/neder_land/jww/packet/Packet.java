package com.github.neder_land.jww.packet;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.lang.reflect.Type;

public class Packet<T extends PacketContent> {

    public static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    private String action;
    private T content;

    /*
    We have this to fetch our generic type.
    */
    private Packet() {
    }

    protected Packet(T content) {
        this.action = content.getAction();
    }

    public static <E extends PacketContent> Packet<E> deserialize(String json) {
        JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();
        Packet<E> packet = new Packet<>();
        packet.action = jsonObject.get("action").getAsString();
        packet.content = GSON.fromJson(jsonObject.getAsJsonObject("content"), new TypeHolder<E>() {
        }.getGenericType());
        return packet;
    }
    
    public static Handshake deserializeHandshake(String json) {
        return new Handshake(JsonParser.parseString(json).getAsJsonObject().get("version").getAsInt());
    }

    public String serialize() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("action", action);
        jsonObject.add("content", content.serialize());
        return GSON.toJson(jsonObject);
    }

    public T getContent() {
        return content;
    }

    private static abstract class TypeHolder<E> {
        public Type getGenericType() {
            return new TypeToken<E>(getClass()) {
            }.getType();
        }
    }
}
