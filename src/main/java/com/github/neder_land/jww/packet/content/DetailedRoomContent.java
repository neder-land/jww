package com.github.neder_land.jww.packet.content;

import com.github.neder_land.jww.packet.PacketContent;

public class DetailedRoomContent extends PacketContent {

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
