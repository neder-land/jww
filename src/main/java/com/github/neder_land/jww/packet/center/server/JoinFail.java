package com.github.neder_land.jww.packet.center.server;

import com.github.neder_land.jww.packet.Packet;
import com.github.neder_land.jww.packet.Packets;
import com.github.neder_land.jww.packet.content.ReasonContent;

public class JoinFail extends Packet<ReasonContent> {
    public JoinFail(String reason) {
        super(new ReasonContent(Packets.JOIN_FAIL, reason));
    }
}
