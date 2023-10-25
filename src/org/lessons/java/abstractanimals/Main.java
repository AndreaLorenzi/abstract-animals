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
        }
    }
}
