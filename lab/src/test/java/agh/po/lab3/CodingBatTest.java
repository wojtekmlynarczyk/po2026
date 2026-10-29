package agh.po.lab3;

import org.junit.Test;

import static org.junit.Assert.*;

public class CodingBatTest {
    CodingBat codingBat= new CodingBat();
    @Test
    public void monkeyTrouble() {
        assertEquals(false, codingBat.monkeyTrouble(true, false));
        assertEquals(true, codingBat.monkeyTrouble(true, true));
        assertEquals(true, codingBat.monkeyTrouble(false, false));
    }

    @org.junit.Test
    public void parrotTrouble() {
        assertEquals(true, codingBat.parrotTrouble(true, 6));
        assertEquals(false, codingBat.parrotTrouble(true, 7));
        assertEquals(false, codingBat.parrotTrouble(false, 6));
        assertEquals(true, codingBat.parrotTrouble(true, 21));
        assertEquals(false, codingBat.parrotTrouble(false, 21));
    }

    @Test
    public void sum67() {
        assertEquals(11, codingBat.sum67(new int[]{2, 2, 6, 7, 7}));
        assertEquals(22, codingBat.sum67(new int[]{11, 6, 7, 11}));
        assertEquals(18, codingBat.sum67(new int[]{2, 7, 6, 2, 6, 7, 2, 7}));
    }
}