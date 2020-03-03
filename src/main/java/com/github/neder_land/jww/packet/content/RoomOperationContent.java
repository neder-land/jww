package com.github.neder_land.jww.packet.content;

import com.github.neder_land.jww.packet.PacketContent;
import com.github.neder_land.jww.packet.content.enums.RoomOperation;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RoomOperationContent extends PacketContent {

    @SerializedName("intend_to")
    @Expose
    private RoomOperation roomOperation;

    public RoomOperationContent(String action, RoomOperation roomOperation) {
        super(action);
        this.roomOperation = roomOperation;
    }

    public RoomOperation getRoomOperation() {
        return roomOperation;
    }

    public void setRoomOperation(RoomOperation roomOperation) {
        this.roomOperation = roomOperation;
    }
}
