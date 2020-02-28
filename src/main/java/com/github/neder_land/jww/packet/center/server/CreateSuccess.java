package com.github.neder_land.jww.packet.center.server;

import com.github.neder_land.jww.packet.Packet;
import com.github.neder_land.jww.packet.Packets;
import com.github.neder_land.jww.packet.content.RoomCreationContent;

public class CreateSuccess extends Packet<RoomCreationContent> {
    public CreateSuccess(String name, String game) {
        super(new RoomCreationContent(Packets.CREATE_SUCCESS, name, game));
    }
}
