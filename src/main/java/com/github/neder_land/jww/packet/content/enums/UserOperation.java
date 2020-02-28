package com.github.neder_land.jww.packet.content.enums;

import com.google.gson.annotations.SerializedName;

public enum UserOperation {
    @SerializedName("kick")
    KICK,
    @SerializedName("mute")
    MUTE,
    @SerializedName("set_master")
    TRANSFER
}
