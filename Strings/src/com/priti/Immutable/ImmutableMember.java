package com.priti.Immutable;

/**
 * Created by prguleri on 9/7/2017.
 */
public class ImmutableMember {
     private String food;
     private int age;

    public ImmutableMember(String food, int age) {
        this.food = food;
        this.age = age;
    }


    public String getFood() {
        return food;
    }

    public int getAge() {
        return age;
    }
}
