package com.github.neder_land.jww.packet.center.server;

import com.github.neder_land.jww.packet.Packet;
import com.github.neder_land.jww.packet.Packets;
import com.github.neder_land.jww.packet.content.RoomListContent;
import com.github.neder_land.jww.packet.content.RoughRoom;

import java.util.List;

public class ListRoomResponse extends Packet<RoomListContent> {
    public ListRoomResponse(List<RoughRoom> rooms) {
        super(new RoomListContent(Packets.LIST_ROOM_RESPONSE, rooms));
    }
}
