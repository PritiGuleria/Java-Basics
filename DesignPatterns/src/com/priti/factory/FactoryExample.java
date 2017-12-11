package com.priti.factory;

/**
 * Created by prguleri on 9/6/2017.
 */
public abstract class FactoryExample {

    public abstract int getType();
}

class A extends  FactoryExample{
    private  int type;

    A(int type) {
        this.type = type;
    }

    public int getType(){
        System.out.println("In class A");
        return type;

    }
}
class  B extends FactoryExample{
    private int type;

    B(int type) {
        this.type = type;
    }

    public int getType(){
        System.out.println("In class B");
        return type;

    }
}

class MainFactory{
    public static FactoryExample create(String name,int type){
        if(name=="A"){
            return new A(type);
        }
        else if(name=="B"){
            return new B(type);
        }
        return null;
    }
}

class Client{
    public static void main(String[] args) {
        FactoryExample obj1 = MainFactory.create("A",67);
        obj1.getType();

        FactoryExample obj2 = MainFactory.create("B",89);
        obj2.getType();
    }
}