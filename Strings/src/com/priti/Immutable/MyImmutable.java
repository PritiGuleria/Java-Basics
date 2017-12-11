package com.priti.Immutable;

/**
 * Created by prguleri on 9/7/2017.
 */
public  final class MyImmutable {
    private final int empId;
    private final ImmutableMember member;

    public MyImmutable(int empId,ImmutableMember member){
        this.empId = empId;
        this.member =   new ImmutableMember(member.getFood(),member.getAge());
    }


    public int getEmpId() {
        return empId;
    }

    public ImmutableMember getMember() {
        return new ImmutableMember(member.getFood(),member.getAge());
    }
}
