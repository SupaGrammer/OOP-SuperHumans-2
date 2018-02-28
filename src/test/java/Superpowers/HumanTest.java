package Superpowers;

import org.junit.Assert;
import org.junit.Test;


public class HumanTest {

    @Test
    public void setName() {
        // Given
        Human human = new Human();
        String expected = "Thor";

        // Act
        human.setName(expected);
        String actual = human.getName();

        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setAge() {
        // Given
        Human human = new Human();
        int expected = 1000;

        // Act
        human.setAge(expected);
        int actual = human.getAge();

        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setGender() {
        // Given
        Human human = new Human();
        String expected = "Male";

        // Act
        human.setGender(expected);

        // Assert
        Assert.assertEquals(human.getGender(), expected);
    }

    @Test
    public void setPhoneNumber() {
        // Given
        Human human = new Human();

        // Act
        human.setPhoneNumber("What phone???");

        // Assert
        Assert.assertTrue(human.getPhoneNumber() == "What phone???");
    }

    @Test
    public void setEmail() {
        // Given
        Human human = new Human();

        // Act
        human.setEmail("thor.shield@Marvel.gov");

        // Assert
        Assert.assertTrue(human.getEmail() == "thor.shield@Marvel.gov");
    }

    @Test
    public void setOccupation() {
        // Given
        Human human = new Human();

        // Act
        human.setOccupation("Thunder God");

        // Assert
        Assert.assertTrue(human.getOccupation() == "Thunder God");
    }

    @Test
    public void setAddress() {
        // Given
        Human human = new Human();

        // Act
        human.setAddress("Azgard");

        // Assert
        Assert.assertTrue(human.getAddress() == "Azgard");
    }
}