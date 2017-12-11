package com.priti.builder;

/**
 * Created by prguleri on 9/5/2017.
 */
public class BuilderExample {
    private int age;
    private String name;
    private String lastName; //optional
    private String favFood; //optional

    BuilderExample(Builderhelper builderhelper){
        this.age =builderhelper.age;
        this.name =builderhelper.name;
        lastName =builderhelper.lastName;
        favFood = builderhelper.favFood;

    }


   static class Builderhelper{
       private int age;
       private String name;
       private String lastName; //optional
       private String favFood; //optional

       Builderhelper(int age, String name) {
           this.age = age;
           this.name = name;
       }


       public Builderhelper setLastName(String lastName) {
           this.lastName = lastName;
           return this;
       }

       public Builderhelper setFavFood(String favFood) {
           this.favFood = favFood;
           return this;
       }
       public BuilderExample build(){
          return new BuilderExample(this);
       }
   }

    public static void main(String[] args) {
        BuilderExample example =  new BuilderExample.Builderhelper(26,"Priti").setLastName("Guleria").build();
        System.out.println(example.lastName);
    }


}
