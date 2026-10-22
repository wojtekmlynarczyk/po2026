package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) {

        ArrayList<Integer> mojeTypy = new ArrayList<>();
        for (int i = 0; i < args.length; i++) {
            mojeTypy.add(Integer.parseInt(args[i]));
        }

        System.out.println("Twoje typy: " + mojeTypy);


        ArrayList<Integer> wylosowane = new ArrayList<>();
        Random losowanie = new Random();

        while (wylosowane.size() < 6) {
            int los = losowanie.nextInt(49) + 1;

            if (!wylosowane.contains(los)) {
                wylosowane.add(los);
            }
        }

        System.out.println("Wylosowane liczby: " + wylosowane);


        mojeTypy.retainAll(wylosowane);
        System.out.println("Liczba trafień: " + mojeTypy.size());
    }
}