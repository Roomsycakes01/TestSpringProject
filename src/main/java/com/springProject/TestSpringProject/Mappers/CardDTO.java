/*
 * Copyright 2022 WANdisco
 */
package com.springProject.TestSpringProject.Mappers;


public class CardDTO
{
    private char rank = 'A';
    private String suit = "Clubs";
    private int numberRank = 1;
    private String colour = "Black";

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getNumberRank() {
        return numberRank;
    }

    public void setNumberRank(int numberRank) {
        this.numberRank = numberRank;
    }

    public char getRank() {
        return rank;
    }

    public void setRank(char rank) {
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String toString() {
        return "rank = " + rank + ", suit = " + suit + ", numberRank = " + numberRank + ", colour = " + colour;
    }
}
