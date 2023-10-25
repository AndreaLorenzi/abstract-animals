package org.lessons.java.abstractanimals;

public class Eagles extends Animal implements CanFly {
    public Eagles(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("my verse is:arhhhhhh");
    }

    @Override
    public void eat() {
        System.out.println("I'm eating: rabbit, snake and everything that moves");
    }


    @Override
    public void flyer() {
        System.out.println("I'm flying");
    }
}
