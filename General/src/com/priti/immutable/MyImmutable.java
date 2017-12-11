package com.priti.immutable;

import java.util.Date;

/**
 * Created by prguleri on 12/5/2017.
 */
public final class MyImmutable {

    private  final String name;
    private final int age;
    private final MutableMember member;

    public MyImmutable(String name, int age, MutableMember member) {
        this.name = name;
        this.age = age;
        MutableMember member1 = new MutableMember();
        member1.setFavFood(member.getFavFood());
        this.member = member1;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public MutableMember getDetails() {
        MutableMember memb = new MutableMember();
        memb.setFavFood(this.member.getFavFood());
        return memb;
    }
}
