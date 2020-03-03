package com.github.neder_land.jww.packet.content;

import com.github.neder_land.jww.packet.PacketContent;
import com.google.gson.annotations.Expose;

public class ReasonContent extends PacketContent {

    @Expose
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
