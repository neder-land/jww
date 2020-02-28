package com.github.neder_land.jww.packet.center.client;

import com.github.neder_land.jww.packet.Packet;
import com.github.neder_land.jww.packet.Packets;
import com.github.neder_land.jww.packet.content.RoomCreationContent;

public class Create extends Packet<RoomCreationContent> {
    public Create(String room, String game) {
        super(new RoomCreationContent(Packets.CREATE, room, game));
    }
}
