package com.github.neder_land.jww.packet;

import com.google.gson.*;

public class Packet<T extends PacketContent> {

    public static final Gson GSON = new GsonBuilder().setPrettyPrinting().excludeFieldsWithoutExposeAnnotation().create();

    private String action;
    private T content;

    /*
    Preserved for further usage
     */
    private Packet() {
    }

    protected Packet(T content) {
        this.action = content.getAction();
        this.content = content;
    }

    public static <E extends PacketContent> Packet<E> deserialize(String json, Class<E> clazz) {
        return deserialize(JsonParser.parseString(json), clazz);
    }

    public static <E extends PacketContent> Packet<E> deserialize(JsonElement json, Class<E> clazz) {
        JsonObject jsonObject = json.getAsJsonObject();
        Packet<E> packet = new Packet<>();
        packet.action = jsonObject.get("action").getAsString();
        packet.content = GSON.fromJson(jsonObject.getAsJsonObject("content"), clazz);
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
}
