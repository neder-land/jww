package com.github.neder_land.jww.packet.content;

import com.github.neder_land.jww.packet.PacketContent;
import com.google.gson.annotations.Expose;

public class DetailedRoomContent extends PacketContent {

    @Expose
    private DetailedRoom room;

    public DetailedRoomContent(String action, DetailedRoom room) {
        super(action);
        this.room = room;
    }

    public DetailedRoom getRoom() {
        return room;
    }

    public void setRoom(DetailedRoom room) {
        this.room = room;
    }
}
