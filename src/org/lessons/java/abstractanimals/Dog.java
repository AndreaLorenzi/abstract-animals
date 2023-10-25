package org.lessons.java.abstractanimals;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("my verse is: Woof");
    }

    @Override
    public void eat() {
        System.out.println("I'm eating: kibble, meat");
    }
}
