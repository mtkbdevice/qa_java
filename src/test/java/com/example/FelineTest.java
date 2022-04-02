package com.example;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.Arrays;


public class FelineTest {

    @Test
    public void getKittensWithoutArgumentReturnsOneKitten(){
        Feline feline = new Feline();
        int expected = 1;
        int actual = feline.getKittens();
        assertEquals(expected, actual);
    }


    @Test
    public void getFamilyReturnsFeelineString(){
        Feline feline = new Feline();
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        assertEquals(expected, actual);
    }

    @Test
    public void eatMeatReturnPredatorFoodList() throws Exception {
        Feline feline = new Feline();
        List<String>expected = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expected, feline.eatMeat());
    }
}
