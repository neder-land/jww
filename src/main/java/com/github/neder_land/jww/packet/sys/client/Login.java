package com.github.neder_land.jww.packet.sys.client;

import com.github.neder_land.jww.packet.Packet;
import com.github.neder_land.jww.packet.Packets;
import com.github.neder_land.jww.packet.content.UsernameContent;

public class Login extends Packet<UsernameContent> {
    public Login(String username) {
        super(new UsernameContent(Packets.LOGIN, username));
    }
}
