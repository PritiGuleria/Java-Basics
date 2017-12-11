package com.priti.immutable;

/**
 * Created by prguleri on 12/5/2017.
 */
public class MutableMember {
    private String favFood;
    private String favGame;

    public String getFavFood() {
        return favFood;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }

    public String getFavGame() {
        return favGame;
    }

    public void setFavGame(String favGame) {
        this.favGame = favGame;
    }
}
