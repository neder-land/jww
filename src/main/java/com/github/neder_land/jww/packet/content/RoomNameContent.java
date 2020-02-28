package com.github.neder_land.jww.packet.content;

import com.github.neder_land.jww.packet.PacketContent;
import com.google.gson.annotations.SerializedName;

public class RoomNameContent extends PacketContent {

    @SerializedName("room_name")
    private String roomName;

    public RoomNameContent(String action, String room) {
        super(action);
        this.roomName = room;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }
}
