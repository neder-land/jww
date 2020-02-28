package com.github.neder_land.jww.packet.center.client;

import com.github.neder_land.jww.packet.Packet;
import com.github.neder_land.jww.packet.Packets;
import com.github.neder_land.jww.packet.content.UserOperationContent;
import com.github.neder_land.jww.packet.content.enums.UserOperation;

public class UserOperationPacket extends Packet<UserOperationContent> {
    public UserOperationPacket(UserOperation operation, String target) {
        super(new UserOperationContent(Packets.USER_OPERATION, operation, target));
    }
}
