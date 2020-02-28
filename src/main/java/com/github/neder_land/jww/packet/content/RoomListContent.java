package com.github.neder_land.jww.packet.content;

import com.github.neder_land.jww.packet.PacketContent;

import java.util.List;

public class RoomListContent extends PacketContent {

    private List<RoughRoom> rooms;

    public RoomListContent(String action, List<RoughRoom> rooms) {
        super(action);
        this.rooms = rooms;
    }

    public List<RoughRoom> getRooms() {
        return rooms;
    }

    public void setRooms(List<RoughRoom> rooms) {
        this.rooms = rooms;
    }
}
