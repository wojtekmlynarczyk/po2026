package agh.po.lab3;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

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
    @Test
    public void theEnd() {
        assertEquals("H", codingBat.theEnd("Hello", true));
        assertEquals("o", codingBat.theEnd("Hello", false));
        assertEquals("o", codingBat.theEnd("oh", true));
    }
    @Test
    public void mapAB2() {
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "aaa");
        map1.put("b", "aaa");
        map1.put("c", "cake");
        codingBat.mapAB2(map1);
        assertEquals(1, map1.size());

        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "aaa");
        map2.put("b", "bbb");
        codingBat.mapAB2(map2);
        assertEquals(2, map2.size());

        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "aaa");
        map3.put("b", "bbb");
        map3.put("c", "aaa");
        codingBat.mapAB2(map3);
        assertEquals(3, map3.size());
    }
    @Test
    public void wordCount() {
        Map<String, Integer> w1 = codingBat.wordCount(new String[]{"a", "b", "a", "c", "b"});
        assertEquals(3, w1.size());
        assertEquals(2, (int) w1.get("a"));

        Map<String, Integer> w2 = codingBat.wordCount(new String[]{"c", "b", "a"});
        assertEquals(3, w2.size());
        assertEquals(1, (int) w2.get("a"));

        Map<String, Integer> w3 = codingBat.wordCount(new String[]{"c", "c", "c", "c"});
        assertEquals(1, w3.size());
        assertEquals(4, (int) w3.get("c"));
    }
}