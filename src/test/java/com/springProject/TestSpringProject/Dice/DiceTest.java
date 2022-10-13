package com.springProject.TestSpringProject.Dice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.MockitoAnnotations;

class DiceTest
{

    private Dice classUnderTest;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        classUnderTest = new Dice();
    }

}
