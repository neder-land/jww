package com.github.neder_land.jww.packet.content;

import com.github.neder_land.jww.packet.PacketContent;
import com.google.gson.annotations.Expose;

public class GameTypeContent extends PacketContent {

    @Expose
    private String game;

    public GameTypeContent(String action, String game) {
        super(action);
        this.game = game;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }
}
