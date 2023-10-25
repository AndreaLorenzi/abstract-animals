package org.lessons.java.abstractanimals;

public class Sparrow extends Animal {
    public Sparrow(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("My verse is: cip cip");
    }

    @Override
    public void eat() {
        System.out.println("I'm eating: worms, bees, ants");
    }
}
