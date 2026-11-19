package agh.po.symulator;

public abstract class Komponent {
    private String marka;
    private String model;
    private double cena;

    public Komponent(String marka, String model, double cena) {
        this.marka = marka;
        this.model = model;
        this.cena = cena;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public double getCena() {
        return cena;
    }
}
