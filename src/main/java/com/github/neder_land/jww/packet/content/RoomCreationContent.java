package com.github.neder_land.jww.packet.content;

import com.github.neder_land.jww.packet.PacketContent;
import com.google.gson.annotations.SerializedName;

public class RoomCreationContent extends PacketContent {

    @SerializedName("room_name")
    private String roomName;
    private String game;

    public RoomCreationContent(String action, String room, String game) {
        super(action);
        this.roomName = room;
        this.game = game;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }
}
