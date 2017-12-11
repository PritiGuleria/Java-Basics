package com.priti.Immutable;

/**
 * Created by prguleri on 9/7/2017.
 */
public class ImmutableTest {
    public static void main(String[] args) {
        ImmutableMember member = new ImmutableMember("pizza",27);
        MyImmutable immutable = new MyImmutable(646209,member);

        System.out.println(immutable.getEmpId());
        System.out.println(immutable.getMember().getAge());
        System.out.println(immutable.getMember().getFood());


        System.out.println("======================");

    }
}
