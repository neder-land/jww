package com.github.neder_land.jww.packet.content;

import com.github.neder_land.jww.packet.PacketContent;
import com.github.neder_land.jww.packet.content.enums.UserOperation;
import com.google.gson.annotations.SerializedName;

public class UserOperationContent extends PacketContent {

    @SerializedName("intend_to")
    private UserOperation userOperation;
    private String target;

    public UserOperationContent(String action, UserOperation operation, String target) {
        super(action);
        this.userOperation = operation;
        this.target = target;
    }

    public UserOperation getUserOperation() {
        return userOperation;
    }

    public void setUserOperation(UserOperation userOperation) {
        this.userOperation = userOperation;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }
}
