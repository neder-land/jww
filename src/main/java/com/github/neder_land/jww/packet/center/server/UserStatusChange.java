package com.github.neder_land.jww.packet.center.server;

import com.github.neder_land.jww.packet.Packet;
import com.github.neder_land.jww.packet.Packets;
import com.github.neder_land.jww.packet.content.UserStatusContent;
import com.github.neder_land.jww.packet.content.enums.UserStatus;

public class UserStatusChange extends Packet<UserStatusContent> {
    public UserStatusChange(UserStatus status, String target) {
        super(new UserStatusContent(Packets.USER_STATUS_CHANGE, status, target));
    }
}
