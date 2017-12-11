package com.priti.factory;

/**
 * Created by prguleri on 9/8/2017.
 */
public abstract class AbstractFactoryExample {
    public abstract int getType();
}

class C extends  AbstractFactoryExample{
    private int type;

    C(int type) {
        this.type = type;
    }

    public int getType(){
        System.out.println("In class C ");
        return type;

    }
}
class  D extends AbstractFactoryExample{
    private int type;

    D(int type) {
        this.type = type;
    }

    public int getType(){
        System.out.println("In class D");
        return type;

    }
}

interface MainAbstractFactory{
    AbstractFactoryExample create();
}

class FactoryC implements MainAbstractFactory{

    int type;

    FactoryC(int type){
        this.type =type;
    }

    public AbstractFactoryExample create(){
       return new C(type);
    }

}


class FactoryD implements MainAbstractFactory{

    int type;

    FactoryD(int type){
        this.type =type;
    }

    public AbstractFactoryExample create(){
        return new D(type);
    }

}

class MainCreateFactory{
    public static AbstractFactoryExample getInstance(MainAbstractFactory factory){
        return factory.create();
    }

}


class ClientNew{
    public static void main(String[] args) {

        AbstractFactoryExample example = MainCreateFactory.getInstance(new FactoryC(56));

        example.getType();

    }
}


