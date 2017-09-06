package com.priti;

/**
 * Created by prguleri on 9/5/2017.
 */
public class BuilderExample {
    private String name;
    private int age;
    private String gender;
    private String favFood;
    private String favMovie;


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getFavFood() {
        return favFood;
    }

    public String getFavMovie() {
        return favMovie;
    }


   private BuilderExample (BuilderExampleHelper helper){
        this.name = helper.name;
        this.age =helper.age;
        this.favFood = helper.favFood;
        this.favMovie=helper.favMovie;



   }

    public static class BuilderExampleHelper{
        private String name;
        private int age;
        private String gender;
        private String favFood;
        private String favMovie;

         BuilderExampleHelper(String name,int age,String gender){
            this.name = name;
            this.age = age;
            this.gender =gender;
        }


        public BuilderExampleHelper setFavFood(String favFood) {
            this.favFood = favFood;
            return this;
        }

        public BuilderExampleHelper setFavMovie(String favMovie) {
            this.favMovie = favMovie;
            return this;
        }

        public BuilderExample build(){
            return  new BuilderExample(this);
        }
    }

}
