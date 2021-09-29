package com.dhirunand.constructorinjection;

public class Person {
    private String name;
    private int personId;
    private Certi certi;

    public Person(String name, int personId, Certi certi) {
        this.name = name;
        this.personId = personId;
        this.certi = certi;
    }


    // getter setter nhi banayenge hm, kynki setter use krke value nhi dalni h hmee yaha, hmee constructor use krke dalni h


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personId=" + personId +
                ", certi=" + certi.name +
                '}';
    }
}
