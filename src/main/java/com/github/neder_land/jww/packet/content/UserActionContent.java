package com.github.neder_land.jww.packet.content;

import com.github.neder_land.jww.packet.PacketContent;
import com.github.neder_land.jww.packet.content.enums.UserAction;
import com.google.gson.annotations.SerializedName;

public class UserActionContent extends PacketContent {

    @SerializedName("intend_to")
    private UserAction userAction;

    public UserActionContent(String action, UserAction userAction) {
        super(action);
        this.userAction = userAction;
    }

    public UserAction getUserAction() {
        return userAction;
    }

    public void setUserAction(UserAction userAction) {
        this.userAction = userAction;
    }
}
