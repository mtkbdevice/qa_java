package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FeelineParameterizedTest {

    private final int kittensCount;
    private final int expected;

    public FeelineParameterizedTest(int kittensCount, int expected){
        this.kittensCount = kittensCount;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensCountData() {
        return new Object[][] {
                {-1,-1},
                { 0, 0},
                { 5, 5},
        };
    }

    @Test
    public void getKittensReturnsArgumentCountKittens(){
        Feline feline = new Feline();
        int actual = feline.getKittens(kittensCount);
        assertEquals(expected, actual);
    }
}
