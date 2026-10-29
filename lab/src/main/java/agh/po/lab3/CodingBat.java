package agh.po.lab3;

public class CodingBat {

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            return true;
        }
        if (!aSmile && !bSmile) {
            return true;
        }
        return false;
    }
    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking && (hour < 7 || hour > 20)) {
            return true;
        }
            return false;
    }
    public int sum67(int[] liczby) {
        int sum = 0;
        boolean pomijam = false;

        for (int n : liczby) {
            if (n == 6) {
                pomijam = true;
            }

            if (pomijam == false) {
                sum = sum + n;
            }

            if (n == 7) {
                pomijam = false;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        CodingBat codingBat= new CodingBat();
        codingBat.monkeyTrouble(true, false);
        codingBat.parrotTrouble(true, 6);
    }

}