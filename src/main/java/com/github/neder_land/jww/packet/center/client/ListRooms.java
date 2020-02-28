package com.github.neder_land.jww.packet.center.client;

import com.github.neder_land.jww.packet.Packet;
import com.github.neder_land.jww.packet.Packets;
import com.github.neder_land.jww.packet.content.GameTypeContent;

public class ListRooms extends Packet<GameTypeContent> {
    public ListRooms(String game) {
        super(new GameTypeContent(Packets.LIST_ROOMS, game));
    }
}
