package com.github.neder_land.jww.packet.content.enums;

import com.google.gson.annotations.SerializedName;

public enum UserAction {
    @SerializedName("leave")
    LEAVE,
    @SerializedName("ready")
    READY,
    @SerializedName("unready")
    UNREADY
}
