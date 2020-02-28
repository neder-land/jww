package com.github.neder_land.jww.packet.content;

import com.github.neder_land.jww.packet.PacketContent;

public class UsernameContent extends PacketContent {

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
