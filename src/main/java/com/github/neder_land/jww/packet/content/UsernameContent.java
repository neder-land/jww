package com.github.neder_land.jww.packet.content;

import com.github.neder_land.jww.packet.PacketContent;
import com.google.gson.annotations.Expose;

public class UsernameContent extends PacketContent {

    @Expose
    private String username;

    public UsernameContent(String action, String username) {
        super(action);
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
