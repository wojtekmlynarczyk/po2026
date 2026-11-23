package agh.po.symulator;

public class Silnik extends Komponent {
    private int maxObroty;
    private int obroty;

    public Silnik(String marka, String model, double cena, int maxObroty) {
        super(marka, model, cena);
        this.maxObroty = maxObroty;
        this.obroty = 0;
    }

    public void uruchom() {
        this.obroty = 800;
    }

    public void zatrzymaj() {
        this.obroty = 0;
    }

    public void zwiekszObroty() {
        if (obroty > 0 && obroty + 500 <= maxObroty) {
            obroty += 500;
        }
    }

    public void zmniejszObroty() {
        if (obroty - 500 >= 800) {
            obroty -= 500;
        }
    }

    public int getObroty() {
        return obroty;
    }

    public int getMaxObroty() {
        return maxObroty;
    }
}