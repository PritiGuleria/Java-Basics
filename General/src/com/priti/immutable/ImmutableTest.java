package com.priti.immutable;

/**
 * Created by prguleri on 12/5/2017.
 */
public class ImmutableTest {
    public static void main(String[] args) {

        MutableMember member = new MutableMember();

        member.setFavFood("dal");
        member.setFavGame("carrom");

        MyImmutable immutable = new MyImmutable("Priti",26,member);

        System.out.println(immutable.getAge());
        System.out.println(immutable.getName());
        System.out.println(immutable.getDetails().getFavFood());

        System.out.println("=================================");
        member.setFavFood("skdjk");

        System.out.println(immutable.getAge());
        System.out.println(immutable.getName());
        System.out.println(immutable.getDetails().getFavFood());

    }
}
