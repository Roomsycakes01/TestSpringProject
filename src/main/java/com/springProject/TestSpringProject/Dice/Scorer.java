/*
 * Copyright 2022 WANdisco
 */
package com.springProject.TestSpringProject.Dice;

public class Scorer
{
    public static int total(Dice[] diceArray){
        int sum = 0;
        if (diceArray != null) {
            for (Dice dice: diceArray) {
                sum = sum + dice.getValue();
            }
        }
        return sum;
    }
}
