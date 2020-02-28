package com.github.neder_land.jww.packet;

import com.google.common.reflect.TypeToken;
import com.google.gson.*;

import java.lang.reflect.Type;

public class Packet<T extends PacketContent> {

    public static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    private String action;
    private T content;

    /*
    Preserved for further usage
     */
    private Packet() {
    }

    protected Packet(T content) {
        this.action = content.getAction();
    }

    public static <E extends PacketContent> Packet<E> deserialize(String json) {
        return deserialize(JsonParser.parseString(json));
    }

    public static <E extends PacketContent> Packet<E> deserialize(JsonElement json) {
        JsonObject jsonObject = json.getAsJsonObject();
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
            //noinspection UnstableApiUsage
            return new TypeToken<E>(getClass()) {
            }.getType();
        }
    }
}
