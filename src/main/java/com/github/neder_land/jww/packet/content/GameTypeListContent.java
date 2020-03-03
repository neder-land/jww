package com.github.neder_land.jww.packet.content;

import com.github.neder_land.jww.packet.PacketContent;
import com.google.gson.annotations.Expose;

import java.util.List;

public class GameTypeListContent extends PacketContent {

    @Expose
    private List<String> game;

    public GameTypeListContent(String action, List<String> game) {
        super(action);
        this.game = game;
    }

    public List<String> getGame() {
        return game;
    }

    public void setGame(List<String> game) {
        this.game = game;
    }
}
