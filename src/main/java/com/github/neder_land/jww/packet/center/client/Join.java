package com.github.neder_land.jww.packet.center.client;

import com.github.neder_land.jww.packet.Packet;
import com.github.neder_land.jww.packet.Packets;
import com.github.neder_land.jww.packet.content.RoomNameContent;

public class Join extends Packet<RoomNameContent> {
    public Join(String room) {
        super(new RoomNameContent(Packets.JOIN, room));
    }
}
