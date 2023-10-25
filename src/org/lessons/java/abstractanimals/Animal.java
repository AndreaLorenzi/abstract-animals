package org.lessons.java.abstractanimals;

public abstract class Animal {


    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sleep() {
        System.out.println("Zzz");
    }

    public abstract void makeNoise();


    public abstract void eat();


}
