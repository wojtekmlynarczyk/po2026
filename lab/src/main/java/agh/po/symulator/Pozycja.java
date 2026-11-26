package agh.po.symulator;

public class Pozycja {
    private double x;
    private double y;

    public Pozycja(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void przemiesc(double dt, double v, Pozycja cel) {
        double odleglosc = Math.sqrt(Math.pow(cel.x - this.x, 2) + Math.pow(cel.y - this.y, 2));

        if (odleglosc == 0) {
            return;
        }

        double krok = v * dt;

        if (krok >= odleglosc) {
            this.x = cel.x;
            this.y = cel.y;
        } else {
            double dx = v * dt * (cel.x - this.x) / odleglosc;
            double dy = v * dt * (cel.y - this.y) / odleglosc;
            this.x += dx;
            this.y += dy;
        }
    }

    public String getPozycja() {
        return "(" + x + ", " + y + ")";
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
//    if (cel == null) {
//        return;
}