package com.github.neder_land.jww.packet.center.client;

import com.github.neder_land.jww.packet.Packet;
import com.github.neder_land.jww.packet.Packets;
import com.github.neder_land.jww.packet.content.RoomOperationContent;
import com.github.neder_land.jww.packet.content.enums.RoomOperation;

public class RoomOperationPacket extends Packet<RoomOperationContent> {
    public RoomOperationPacket(RoomOperation operation) {
        super(new RoomOperationContent(Packets.ROOM_OPERATION, operation));
    }
}
