package com.github.neder_land.jww.packet.content;

import com.github.neder_land.jww.packet.PacketContent;
import com.github.neder_land.jww.packet.content.enums.UserStatus;

public class UserStatusContent extends PacketContent {

    private UserStatus what;
    private String who;

    public UserStatusContent(String action, UserStatus status, String target) {
        super(action);
        this.what = status;
        this.who = target;
    }

    public UserStatus getWhat() {
        return what;
    }

    public void setWhat(UserStatus what) {
        this.what = what;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }
}
