package com.github.neder_land.jww.packet.content;

import com.github.neder_land.jww.packet.PacketContent;

public class ReasonContent extends PacketContent {

    private String reason;

    public ReasonContent(String action, String reason) {
        super(action);
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
