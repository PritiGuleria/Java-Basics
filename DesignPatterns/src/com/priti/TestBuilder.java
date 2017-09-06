package com.priti;

/**
 * Created by prguleri on 9/5/2017.
 */
public class TestBuilder {
    public static void main(String[] args) {
        BuilderExample builderExample = new BuilderExample.BuilderExampleHelper("priti",27,"F").setFavFood("Chicken").build();

        System.out.println(builderExample.getFavFood());
    }
}
