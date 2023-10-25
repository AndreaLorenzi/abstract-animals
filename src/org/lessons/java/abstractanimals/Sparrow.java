package org.lessons.java.abstractanimals;

public class Sparrow extends Animal implements CanFly {
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


    @Override
    public void flyer() {
        System.out.println("I'm fLying");
    }
}
