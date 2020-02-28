package com.github.neder_land.jww.packet.center.server;

import com.github.neder_land.jww.packet.Packet;
import com.github.neder_land.jww.packet.Packets;
import com.github.neder_land.jww.packet.content.ReasonContent;

public class LeaveFail extends Packet<ReasonContent> {
    public LeaveFail(String reason) {
        super(new ReasonContent(Packets.LEAVE_FAIL, reason));
    }
}
