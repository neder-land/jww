package com.github.neder_land.jww.packet.content;

import com.github.neder_land.jww.packet.PacketContent;

import java.util.List;

public class GameTypeListContent extends PacketContent {

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
