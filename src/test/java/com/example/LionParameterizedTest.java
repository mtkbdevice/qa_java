package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

    private final String sex;
    private final Boolean expected;

    public LionParameterizedTest(String sex, Boolean expected){
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getSexData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void doesHaveManeReturnCorrectMane() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(sex, feline);
        Boolean actual = lion.hasMane;
        assertEquals(expected, actual);
    }
}
