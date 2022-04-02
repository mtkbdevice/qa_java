package com.example;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.Arrays;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feeline;

    @Test
    public void getSoundReturnsMyau(){
        Cat cat = new Cat(feeline);
        String expected = "Мяу";
        String actual = cat.getSound();
        assertEquals(expected, actual);
    }

    @Test
    public void getFoodReturnsPredatorFoodList() throws Exception {
        Cat cat = new Cat(feeline);
        Mockito.when(feeline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String>expected = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expected, cat.getFood());
    }

}
