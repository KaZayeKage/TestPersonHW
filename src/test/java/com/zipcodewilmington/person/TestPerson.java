package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "Isaiah";
        Integer expectedAge = 21;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testFingersVariable() {
        // Given
        String expectedFingers = "Middle";

        // When
        Person person = new Person();

        // Then
        String actualFingers = person.getFingers();

        Assert.assertEquals(expectedFingers, actualFingers);

    }

    @Test
    public void testEyesVariable() {
        // Given
        String expectedEyes = "Brown";
        // When
        Person person = new Person();
        // Then
        String actualEyes = person.getEyes();
        Assert.assertEquals(expectedEyes, actualEyes);
    }

    @Test
    public void testTattoosVariable() {
        // Given
        Integer expectedTattoos = 1;

        // When
        Person person = new Person();

        // Then
        Integer actualTattoos = person.getTattoos();

        Assert.assertEquals(expectedTattoos, actualTattoos);
    }

    @Test
    public void testHairVariable() {
        // Given
        String expectedHair = "Black";

        // When
        Person person = new Person();

        // Then
        String actualHair = person.getHair();

        Assert.assertEquals(expectedHair, actualHair);


    }

    @Test
    public void testPiercingsVariable(){
        // Given
        Integer expectedPiercings = 4;

        // When
        Person person = new Person();

        // Then
        Integer actualPiercings = person.getPiercings();

        Assert.assertEquals(expectedPiercings, actualPiercings);

    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }
}
