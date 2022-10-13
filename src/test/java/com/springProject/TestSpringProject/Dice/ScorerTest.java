package com.springProject.TestSpringProject.Dice;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class ScorerTest
{

    @Test
    void testTotalSuccess() {
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();
        dice1.setValue(1);
        dice2.setValue(5);
        Dice[] diceArray = {dice1, dice2};
        assertThat(Scorer.total(diceArray), is(6));
    }

    @Test
    void testTotalNull() {
        assertThat(Scorer.total(null), is(0));
    }

    @Test
    void testTotalNullDiceValues() {
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();
        Dice[] diceArray = {dice1, dice2};
        assertThat(Scorer.total(diceArray), is(0));
    }

    @Test
    void testTotalEmptyArray() {
        Dice[] diceArray = {};
        assertThat(Scorer.total(diceArray), is(0));
    }

}
