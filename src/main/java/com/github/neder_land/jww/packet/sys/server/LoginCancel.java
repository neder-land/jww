package com.github.neder_land.jww.packet.sys.server;

import com.github.neder_land.jww.packet.Packet;
import com.github.neder_land.jww.packet.Packets;
import com.github.neder_land.jww.packet.content.ReasonContent;

public class LoginCancel extends Packet<ReasonContent> {
    public LoginCancel(String reason) {
        super(new ReasonContent(Packets.LOGIN_CANCEL, reason));
    }
}
