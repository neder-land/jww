package com.github.neder_land.jww.packet.center.server;

import com.github.neder_land.jww.packet.Packet;
import com.github.neder_land.jww.packet.Packets;
import com.github.neder_land.jww.packet.content.GameTypeListContent;

import java.util.List;

public class ListTypeResponse extends Packet<GameTypeListContent> {
    public ListTypeResponse(List<String> games) {
        super(new GameTypeListContent(Packets.LIST_TYPE_RESPONSE, games));
    }
}
