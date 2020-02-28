package com.github.neder_land.jww.packet;

import com.google.gson.Gson;

public class Handshake {

    private int version;

    public Handshake(int version) {
        this.version = version;
    }

    public String serialize() {
        return new Gson().toJson(this);
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
