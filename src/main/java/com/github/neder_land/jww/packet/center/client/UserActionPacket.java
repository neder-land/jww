package com.github.neder_land.jww.packet.center.client;

import com.github.neder_land.jww.packet.Packet;
import com.github.neder_land.jww.packet.Packets;
import com.github.neder_land.jww.packet.content.UserActionContent;
import com.github.neder_land.jww.packet.content.enums.UserAction;

public class UserActionPacket extends Packet<UserActionContent> {
    public UserActionPacket(UserAction userAction) {
        super(new UserActionContent(Packets.USER_ACTION, userAction));
    }
}
