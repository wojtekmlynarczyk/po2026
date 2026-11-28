package agh.po.symulator;

import org.junit.Test;
import static org.junit.Assert.*;

public class SkrzyniaBiegowTest {

    @Test
    public void zmianaBiegowZeSprzeglem() {
        Sprzeglo sprzeglo = new Sprzeglo("Sachs", "Sport", 500.0);
        SkrzyniaBiegow skrzynia = new SkrzyniaBiegow("ZF", "Manual", 2000.0, 2, sprzeglo);

        assertEquals(0, skrzynia.getAktBieg());

        sprzeglo.wcisnij();
        skrzynia.zwiekszBieg();
        assertEquals(1, skrzynia.getAktBieg());
        assertEquals(0.5, skrzynia.getAktPrzelozenie(), 0.0001);

        skrzynia.zwiekszBieg();
        skrzynia.zwiekszBieg();
        assertEquals(2, skrzynia.getAktBieg());

        skrzynia.zmniejszBieg();
        assertEquals(1, skrzynia.getAktBieg());

        skrzynia.wyzerujBieg();
        skrzynia.zmniejszBieg();
        assertEquals(0, skrzynia.getAktBieg());
        assertEquals(0.0, skrzynia.getAktPrzelozenie(), 0.0001);
    }

    @Test(expected = IllegalStateException.class)
    public void zwiekszBiegBezSprzeglaRzucaWyjatek() {
        Sprzeglo sprzeglo = new Sprzeglo("Sachs", "Sport", 500.0);
        SkrzyniaBiegow skrzynia = new SkrzyniaBiegow("ZF", "Manual", 2000.0, 5, sprzeglo);

        skrzynia.zwiekszBieg();
    }

    @Test(expected = IllegalStateException.class)
    public void zmniejszBiegBezSprzeglaRzucaWyjatek() {
        Sprzeglo sprzeglo = new Sprzeglo("Sachs", "Sport", 500.0);
        SkrzyniaBiegow skrzynia = new SkrzyniaBiegow("ZF", "Manual", 2000.0, 5, sprzeglo);

        skrzynia.zmniejszBieg();
    }
}