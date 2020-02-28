package com.github.neder_land.jww.packet.center.server;

import com.github.neder_land.jww.packet.Packet;
import com.github.neder_land.jww.packet.Packets;
import com.github.neder_land.jww.packet.content.ReasonContent;

public class CreateFail extends Packet<ReasonContent> {
    public CreateFail(String reason) {
        super(new ReasonContent(Packets.CREATE_FAIL, reason));
    }
}
