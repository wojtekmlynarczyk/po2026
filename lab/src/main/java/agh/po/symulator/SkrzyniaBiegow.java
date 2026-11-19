package agh.po.symulator;

public class SkrzyniaBiegow extends Komponent {
    private int aktualnyBieg;
    private int iloscBiegow;
    private Sprzeglo sprzeglo;

    public SkrzyniaBiegow(String marka, String model, double cena, int iloscBiegow, Sprzeglo sprzeglo) {
        super(marka, model, cena);
        this.iloscBiegow = iloscBiegow;
        this.sprzeglo = sprzeglo;
        this.aktualnyBieg = 0;
    }

    public void zwiekszBieg() {
        if (sprzeglo.isStanSprzegla() && aktualnyBieg < iloscBiegow) {
            aktualnyBieg++;
        }
    }

    public void zmniejszBieg() {
        if (sprzeglo.isStanSprzegla() && aktualnyBieg > 0) {
            aktualnyBieg--;
        }
    }

    public void wyzerujBieg() {
        aktualnyBieg = 0;
    }

    public int getAktBieg() {
        return aktualnyBieg;
    }

    public int getIloscBiegow() {
        return iloscBiegow;
    }

    public Sprzeglo getSprzeglo() {
        return sprzeglo;
    }
}
