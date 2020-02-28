package com.github.neder_land.jww.packet.content;

import com.google.gson.annotations.SerializedName;

public class RoughRoom {

    private String name;
    private String owner;
    private int people;
    @SerializedName("in_game")
    private boolean inGame;
    private String game;

    public RoughRoom(String name, String owner, int people, boolean inGame, String game) {
        this.name = name;
        this.owner = owner;
        this.people = people;
        this.inGame = inGame;
        this.game = game;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public boolean isInGame() {
        return inGame;
    }

    public void setInGame(boolean inGame) {
        this.inGame = inGame;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}