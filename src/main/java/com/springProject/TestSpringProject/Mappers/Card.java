/*
 * Copyright 2022 WANdisco
 */
package com.springProject.TestSpringProject.Mappers;


public class Card
{
    private char rank;
    private String suit;
    private int numericalRank;

    public int getNumericalRank() {
        return numericalRank;
    }

    public void setNumericalRank(int numericalRank) {
        this.numericalRank = numericalRank;
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
}
