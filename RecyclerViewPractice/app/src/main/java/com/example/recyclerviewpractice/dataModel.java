package com.example.recyclerviewpractice;


public class dataModel {
    int img;
    String playerName, playerID;

    public int getImg() {
        return img;
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getPlayerID() {
        return playerID;
    }

    dataModel(int img, String playerName, String playerID){
        this.img = img;
        this.playerName = playerName;
        this.playerID = playerID;
    }


}
