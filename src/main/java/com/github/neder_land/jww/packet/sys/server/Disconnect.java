package com.github.neder_land.jww.packet.sys.server;

import com.github.neder_land.jww.packet.Packet;
import com.github.neder_land.jww.packet.Packets;
import com.github.neder_land.jww.packet.content.EmptyPacketContent;

public class Disconnect extends Packet<EmptyPacketContent> {
    public Disconnect() {
        super(new EmptyPacketContent(Packets.DISCONNECT));
    }
}
