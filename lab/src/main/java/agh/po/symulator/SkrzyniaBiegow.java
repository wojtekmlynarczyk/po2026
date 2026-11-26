package agh.po.symulator;

public class SkrzyniaBiegow extends Komponent {
    private int aktualnyBieg;
    private int iloscBiegow;
    private double aktualnePrzelozenie;
    private Sprzeglo sprzeglo;

    public SkrzyniaBiegow(String marka, String model, double cena, int iloscBiegow, Sprzeglo sprzeglo) {
        super(marka, model, cena);
        this.iloscBiegow = iloscBiegow;
        this.sprzeglo = sprzeglo;
        this.aktualnyBieg = 0;
        this.aktualnePrzelozenie = 0;
    }

    public void zwiekszBieg() {
        if (!sprzeglo.isStanSprzegla()) {
            throw new IllegalStateException("Nie mozna zmienic biegu bez wcisnietego sprzegla");
        }
        if (aktualnyBieg < iloscBiegow) {
            aktualnyBieg++;
            aktualnePrzelozenie = aktualnyBieg * 0.5;
        }
    }

    public void zmniejszBieg() {
        if (!sprzeglo.isStanSprzegla()) {
            throw new IllegalStateException("Nie mozna zmienic biegu bez wcisnietego sprzegla");
        }
        if (aktualnyBieg > 0) {
            aktualnyBieg--;
            aktualnePrzelozenie = aktualnyBieg * 0.5;
        }
    }

    public void wyzerujBieg() {
        aktualnyBieg = 0;
        aktualnePrzelozenie = 0;
    }

    public int getAktBieg() {
        return aktualnyBieg;
    }

    public int getIloscBiegow() {
        return iloscBiegow;
    }

    public double getAktPrzelozenie() {
        return aktualnePrzelozenie;
    }

    public Sprzeglo getSprzeglo() {
        return sprzeglo;
    }
}