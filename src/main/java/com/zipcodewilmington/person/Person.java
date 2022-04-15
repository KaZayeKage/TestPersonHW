package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private  String fingers;
    private String eyes;
    private Integer tattoos;
    private String hair;
    private Integer piercings;

    public Person() {
        name = "Isaiah";
        age = 21;
        fingers = "Middle";
        eyes = "Brown";
        tattoos = 1;
        hair = "Black";
        piercings = 4;

    }

    public String getFingers() {
        return fingers;
    }

    public void setFingers(String fingers) {
        this.fingers = fingers;
    }

    public String getEyes() {
        return eyes;
    }

    public void setEyes(String eyes) {
        this.eyes = eyes;
    }

    public int getTattoos() {
        return tattoos;
    }

    public void setTattoos(int tattoos) {
        this.tattoos = tattoos;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public int getPiercings() {
        return piercings;
    }

    public void setPiercings(int piercings) {
        this.piercings = piercings;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
