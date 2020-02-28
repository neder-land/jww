package com.github.neder_land.jww.packet.center.server;

import com.github.neder_land.jww.packet.Packet;
import com.github.neder_land.jww.packet.Packets;
import com.github.neder_land.jww.packet.content.DetailedRoom;
import com.github.neder_land.jww.packet.content.DetailedRoomContent;

public class JoinSuccess extends Packet<DetailedRoomContent> {
    public JoinSuccess(DetailedRoom room) {
        super(new DetailedRoomContent(Packets.JOIN_SUCCESS, room));
    }
}
