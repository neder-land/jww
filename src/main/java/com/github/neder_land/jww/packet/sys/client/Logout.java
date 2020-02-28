package com.github.neder_land.jww.packet.sys.client;

import com.github.neder_land.jww.packet.Packet;
import com.github.neder_land.jww.packet.PacketContent;
import com.github.neder_land.jww.packet.content.EmptyPacketContent;

public class Logout extends Packet<PacketContent> {
    public Logout() {
        super(new EmptyPacketContent("sys.logout"));
    }
}
