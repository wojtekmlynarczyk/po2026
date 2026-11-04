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
    public String theEnd(String str, boolean front) {
        if (front) {
            return "" + str.charAt(0);
        } else {
            return "" + str.charAt(str.length() - 1);
        }
    }
    public static void main(String[] args) {
        CodingBat codingBat = new CodingBat();

        System.out.println(codingBat.monkeyTrouble(true, false));
        System.out.println(codingBat.parrotTrouble(true, 6));
        System.out.println(codingBat.sum67(new int[]{1, 1, 6, 7, 2}));
        System.out.println(codingBat.theEnd("Hello", true));
    }

}