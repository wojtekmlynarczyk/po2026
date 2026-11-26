package agh.po.symulator;

import org.junit.Test;
import static org.junit.Assert.*;

public class SilnikTest {

    @Test
    public void uruchomIZatrzymaj() {
        Silnik silnik = new Silnik("BMW", "V8", 15000.0, 2000);
        assertEquals(0, silnik.getObroty());

        silnik.uruchom();
        assertEquals(800, silnik.getObroty());

        silnik.zatrzymaj();
        assertEquals(0, silnik.getObroty());
    }

    @Test
    public void kontrolaObrotow() {
        Silnik silnik = new Silnik("BMW", "V8", 15000.0, 1500);

        silnik.zwiekszObroty();
        assertEquals(0, silnik.getObroty());

        silnik.uruchom();
        silnik.zwiekszObroty();
        assertEquals(1300, silnik.getObroty());

        silnik.zwiekszObroty();
        assertEquals(1500, silnik.getObroty());

        silnik.zmniejszObroty();
        silnik.zmniejszObroty();
        assertEquals(500, silnik.getObroty());

        silnik.zmniejszObroty();
        silnik.zmniejszObroty();
        silnik.zmniejszObroty();
        assertEquals(0, silnik.getObroty());
    }
}