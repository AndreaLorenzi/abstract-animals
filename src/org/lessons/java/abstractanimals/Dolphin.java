package org.lessons.java.abstractanimals;

public class Dolphin extends Animal {
    public Dolphin(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("my verse is: frfrfrf");
    }

    @Override
    public void eat() {
        System.out.println("I'm eating: fish");
    }
}
