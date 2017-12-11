package com.priti.general;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by prguleri on 9/7/2017.
 */
public class HashCodeAndEquals {
    private  int salary;
    private String name;

    public HashCodeAndEquals(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    @Override
    public String toString() {
        return "HashCodeAndEquals{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        HashCodeAndEquals h = (HashCodeAndEquals)o;
      return ((this.salary == h.salary));

       };



    @Override
    public int hashCode() {

        return name.hashCode();

    }

    public static void main(String[] args) {
        HashCodeAndEquals e1 = new HashCodeAndEquals(15000,"Priti");
        HashCodeAndEquals e2 = new HashCodeAndEquals(10000,"Pallu");

        Map<HashCodeAndEquals,Integer> map = new HashMap<>();

        map.put(e1,1);
        map.put(e2,2);

        HashCodeAndEquals e3 = new HashCodeAndEquals(15000,"Priti");

        System.out.println(map.get(e3));

        Set<Map.Entry<HashCodeAndEquals,Integer>> set = map.entrySet();

        for(Map.Entry e : set){
            System.out.println(e.getKey()+ " "+e.getValue());
        }



    }
}
