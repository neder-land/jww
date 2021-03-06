package com.github.neder_land.jww.packet.content;

import com.github.neder_land.jww.packet.PacketContent;
import com.github.neder_land.jww.packet.content.enums.RoomOperation;
import com.google.gson.annotations.Expose;

public class RoomStatusContent extends PacketContent {

    @Expose
    private RoomOperation event;

    public RoomStatusContent(String action, RoomOperation event) {
        super(action);
        this.event = event;
    }

    public RoomOperation getEvent() {
        return event;
    }

    public void setEvent(RoomOperation event) {
        this.event = event;
    }
}
