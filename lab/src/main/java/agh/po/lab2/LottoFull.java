package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;

public class LottoFull {
    public static void main(String[] args) {

        ArrayList<Integer> kupon = new ArrayList<>();
        for (int k = 1; k <= 6; k++) {
            kupon.add(k);
        }

        long czasPoczatkowy = System.currentTimeMillis();
        long licznik = 0;
        Random maszyna = new Random();
        boolean mamySzostke = false;

        while (mamySzostke == false) {
            licznik++;

            ArrayList<Integer> wynikLosowania = new ArrayList<>();
            while (wynikLosowania.size() < 6) {
                int nowaLiczba = maszyna.nextInt(49) + 1;
                if (!wynikLosowania.contains(nowaLiczba)) {
                    wynikLosowania.add(nowaLiczba);
                }
            }

            ArrayList<Integer> wspolne = new ArrayList<>(kupon);
            wspolne.retainAll(wynikLosowania);

            if (wspolne.size() == 6) {
                mamySzostke = true;
            }
        }

        long czasKoncowy = System.currentTimeMillis();

        System.out.println("Udało się wygrać w lotto!");
        System.out.println("Ile prób potrzebowano: " + licznik);
        System.out.println("Zajęło to: " + (czasKoncowy - czasPoczatkowy) + " ms");
    }
}
