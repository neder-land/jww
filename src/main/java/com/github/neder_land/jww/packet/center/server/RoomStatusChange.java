package com.github.neder_land.jww.packet.center.server;

import com.github.neder_land.jww.packet.Packet;
import com.github.neder_land.jww.packet.Packets;
import com.github.neder_land.jww.packet.content.RoomStatusContent;
import com.github.neder_land.jww.packet.content.enums.RoomOperation;

public class RoomStatusChange extends Packet<RoomStatusContent> {
    public RoomStatusChange(RoomOperation event) {
        super(new RoomStatusContent(Packets.ROOM_STATUS_CHANGE, event));
    }
}
