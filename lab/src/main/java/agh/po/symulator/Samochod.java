package agh.po.symulator;

public class Samochod {
    private Silnik silnik;
    private SkrzyniaBiegow skrzynia;
    private Pozycja pozycja;

    public Samochod(Silnik silnik, SkrzyniaBiegow skrzynia, Pozycja pozycja) {
        this.silnik = silnik;
        this.skrzynia = skrzynia;
        this.pozycja = pozycja;
    }

    public void wlacz() {
        silnik.uruchom();
    }

    public void wylacz() {
        silnik.zatrzymaj();
        skrzynia.wyzerujBieg();
    }

    public void wyswietlStan() {
        System.out.println("Obroty: " + silnik.getObroty() + "/" + silnik.getMaxObroty());
        System.out.println("Bieg: " + skrzynia.getAktBieg() + "/" + skrzynia.getIloscBiegow());
        System.out.println("Sprzeglo wcisniete: " + skrzynia.getSprzeglo().isStanSprzegla());
        System.out.println("Pozycja: " + pozycja.getPozycja());
        System.out.println("---");
    }

    public static void main(String[] args) {
        Sprzeglo sprzeglo = new Sprzeglo("Sachs", "Sport", 500.0);
        SkrzyniaBiegow skrzynia = new SkrzyniaBiegow("ZF", "Manual 6", 2000.0, 6, sprzeglo);
        Silnik silnik = new Silnik("BMW", "V8", 15000.0, 7000);
        Pozycja pozycja = new Pozycja(0, 0);

        Samochod auto = new Samochod(silnik, skrzynia, pozycja);

        auto.wlacz();
        silnik.zwiekszObroty();
        sprzeglo.wcisnij();
        skrzynia.zwiekszBieg();
        skrzynia.zwiekszBieg();
        sprzeglo.zwolnij();
        auto.wyswietlStan();

        auto.wylacz();
        auto.wyswietlStan();
    }
}