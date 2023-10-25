package org.lessons.java.abstractanimals;

public class Main {
    public static void main(String[] args) {
        Dog Leonardo = new Dog("Leonardo");
        Eagles Bruno = new Eagles("Bruno");
        Dolphin Pino = new Dolphin("Pino");
        Sparrow Gino = new Sparrow("Gino");

        Animal[] animals = {
                Leonardo,
                Bruno,
                Pino,
                Gino
        };

        for (Animal animal : animals) {
            System.out.println("****************");
            System.out.println("I'm: " + animal.getName());
            animal.sleep();
            animal.eat();
            animal.makeNoise();
            if (animal instanceof CanSwim) {
                ((CanSwim) animal).swimmer();
            } else if (animal instanceof CanFly) {
                ((CanFly) animal).flyer();
            } else {
                System.out.println("I'm playing");
            }
        }
    }

    public static void Fly(CanFly iCanFly) {
        iCanFly.flyer();

    }

    public static void Swim(CanSwim iCanSwim) {
        iCanSwim.swimmer();
    }
}
