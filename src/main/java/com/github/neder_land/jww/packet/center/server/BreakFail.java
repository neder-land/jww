package com.github.neder_land.jww.packet.center.server;

import com.github.neder_land.jww.packet.Packet;
import com.github.neder_land.jww.packet.Packets;
import com.github.neder_land.jww.packet.content.ReasonContent;

public class BreakFail extends Packet<ReasonContent> {
    public BreakFail(String reason) {
        super(new ReasonContent(Packets.BREAK_FAIL, reason));
    }
}
