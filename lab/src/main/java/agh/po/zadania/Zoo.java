package zadania;

import agh.po.animals.*;
import java.util.Random;

public class Zoo {
    public static void main(String[] args) {
        Animal[] animals = new Animal[100];
        Random random = new Random();

        for (int i = 0; i < animals.length; i++) {
            int los = random.nextInt(3);

            if (los == 0) {
                animals[i] = new Dog("Burek_" + i);
            } else if (los == 1) {
                animals[i] = new Parrot("Polly_" + i);
            } else {
                animals[i] = new Snake("Kaa_" + i);
            }
        }

        int sumaNog = 0;

        for (Animal animal : animals) {
            sumaNog = sumaNog + animal.getLegs();

            animal.getDescription();
            animal.makeSound();
        }

        System.out.println("Laczna suma nog w Zoo wynosi: " + sumaNog);
    }
}
