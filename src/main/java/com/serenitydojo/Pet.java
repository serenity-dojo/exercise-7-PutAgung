package com.serenitydojo;

public class Pet {
    private final String name;
    public String getName(){
        return name;
    }

    private final int age;
    public int getAge(){
        return age;
    }
    public Pet (String name,int age){
        this.name=name;
        this.age=age;
    }
}
