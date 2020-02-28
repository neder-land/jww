package com.github.neder_land.jww.packet;

import com.google.gson.JsonElement;
import com.google.gson.annotations.Expose;

import static com.github.neder_land.jww.packet.Packet.GSON;

public class PacketContent {

    @Expose(serialize = false, deserialize = false)
    private String action;

    protected PacketContent(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }

    public JsonElement serialize() {
        return GSON.toJsonTree(this);
    }
}
