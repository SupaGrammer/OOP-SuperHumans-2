package Superpowers;

import org.junit.Test;
import org.junit.Assert;

public class SuperHumanTest {

    @Test
    public void isGoodOrBad() {
       //Given
        SuperHuman superhuman = new SuperHuman();
        //When
        superhuman.setGoodOrBad(true);
        //Then
        Assert.assertTrue(superhuman.getGoodOrBad());
    }

    @Test
    public void getHeroName() {
        //Given
        SuperHuman superhuman = new SuperHuman();
        //When
        String expected = "Thor";
        superhuman.setHeroName(expected);
        //Then
        String actual = superhuman.getHeroName();
        Assert.assertEquals(expected, actual);
    }
}