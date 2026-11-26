package agh.po.symulator;

import org.junit.Test;
import static org.junit.Assert.*;

public class PozycjaTest {

    @Test
    public void przemiesc() {
        Pozycja pozycja = new Pozycja(0, 0);
        Pozycja cel = new Pozycja(3, 4);

        pozycja.przemiesc(0.1, 10, cel);
        assertEquals(0.6, pozycja.getX(), 0.0001);
        assertEquals(0.8, pozycja.getY(), 0.0001);

        pozycja.przemiesc(1.0, 10, cel);
        assertEquals(3.0, pozycja.getX(), 0.0001);
        assertEquals(4.0, pozycja.getY(), 0.0001);

        pozycja.przemiesc(0.1, 10, cel);
        assertEquals(3.0, pozycja.getX(), 0.0001);
        assertEquals(4.0, pozycja.getY(), 0.0001);
    }

    @Test
    public void getPozycja() {
        Pozycja pozycja = new Pozycja(2.5, 4.0);
        assertEquals("(2.5, 4.0)", pozycja.getPozycja());
    }

    @Test
    public void getX() {
        Pozycja pozycja = new Pozycja(5.0, 10.0);
        assertEquals(5.0, pozycja.getX(), 0.0001);
    }

    @Test
    public void getY() {
        Pozycja pozycja = new Pozycja(5.0, 10.0);
        assertEquals(10.0, pozycja.getY(), 0.0001);
    }
}