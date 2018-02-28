package Superpowers;

import org.junit.Assert;
import org.junit.Test;



public class ThorTest {

    @Test
    public void testCanFly() {
        // Given
        Thor thor = new Thor();

        // Act
        boolean actual = thor.canFly();

        // Assert
        Assert.assertTrue(actual);

    }

    @Test
    public void testHasInvulnerability() {
        // Given
        Thor thor = new Thor();

        // Act
        boolean actual = thor.hasInvulnerability();

        // Assert
        Assert.assertTrue(actual);

    }

    @Test
    public void testHasSuperStrength() {
        // Given
        Thor thor = new Thor();

        // Act
        boolean actual = thor.hasSuperStrength();

        // Assert
        Assert.assertTrue(actual);

    }

    @Test
    public void hasOccularPowers() {
        // Given
        Thor thor = new Thor();

        // Act
        boolean actual = thor.hasOccularPowers();

        // Assert
        Assert.assertFalse(actual);
    }

    @Test
    public void testWithAvengers() {
        // Given
        Thor thor = new Thor();

        // Act
        boolean actual = thor.withAvengers();

        // Assert
        Assert.assertTrue(actual);
    }

    @Test
    public void testWithIlluminati() {
        // Given
        Thor thor = new Thor();

        // Act
        boolean actual = thor.withIlluminati();

        // Assert
        Assert.assertFalse(actual);
    }

    @Test
    public void testWithXmen() {
        // Given
        Thor thor = new Thor();

        // Act
        boolean actual = thor.withXmen();

        // Assert
        Assert.assertFalse(actual);
    }

    @Test
    public void testUsesHammer() {
        // Given
        Thor thor = new Thor();

        // Act
        boolean actual = thor.usesHammer();

        // Assert
        Assert.assertTrue(actual);
    }

    @Test
    public void testUsesClaws() {
        // Given
        Thor thor = new Thor();

        // Act
        boolean actual = thor.usesClaws();

        // Assert
        Assert.assertFalse(actual);
    }

    @Test
    public void testSayCatchPhrase() {
        //Given
        Thor thor = new Thor();
        //When
        String expected = "Odins beard!";
        thor.sayCatchPhrase();
        //Then
        String actual = "Odins beard!";
        Assert.assertEquals(expected, actual);
    }
}