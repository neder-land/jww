package com.github.neder_land.jww.packet.center.client;

import com.github.neder_land.jww.packet.Packet;
import com.github.neder_land.jww.packet.Packets;
import com.github.neder_land.jww.packet.content.EmptyPacketContent;

public class ListTypes extends Packet<EmptyPacketContent> {
    public ListTypes() {
        super(new EmptyPacketContent(Packets.LIST_TYPES));
    }
}
