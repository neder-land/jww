package com.github.neder_land.jww.packet.content.enums;

import com.google.gson.annotations.SerializedName;

public enum UserStatus {
    @SerializedName("kick")
    KICK,
    @SerializedName("mute")
    MUTE,
    @SerializedName("set_master")
    TRANSFER,
    @SerializedName("leave")
    LEAVE,
    @SerializedName("join")
    JOIN,
    @SerializedName("ready")
    READY,
    @SerializedName("unready")
    UNREADY
}
