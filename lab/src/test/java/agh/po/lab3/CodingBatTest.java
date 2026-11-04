package agh.po.lab3;

import static org.junit.Assert.*;

public class CodingBatTest {

    @org.junit.Test
    public void monkeyTrouble() {
        CodingBat cb = new CodingBat();
        assertEquals(true,cb.monkeyTrouble(true,true));
        assertEquals(true,cb.monkeyTrouble(false,false));
        assertEquals(false,cb.monkeyTrouble(true,false));
    }

    @org.junit.Test
    public void intMax() {
        CodingBat cb = new CodingBat();
        assertEquals(3, cb.intMax(1, 2, 3));
        assertEquals(9, cb.intMax(9, 2, 1));
        assertEquals(5, cb.intMax(1, 5, 2));
    }

    @org.junit.Test
    public void sum13() {
        CodingBat cb = new CodingBat();
        assertEquals(6, cb.sum13(new int[]{1, 2, 3}));
        assertEquals(6, cb.sum13(new int[]{1, 2, 13, 2, 1, 13, 2, 2}));
        assertEquals(0, cb.sum13(new int[]{13, 1, 2, 13, 2, 1, 13, 2}));
    }

    @org.junit.Test
    public void minCat() {
        CodingBat cb = new CodingBat();
        // 3 przypadki testowe
        assertEquals("loHi", cb.minCat("Hello", "Hi"));
        assertEquals("ellojava", cb.minCat("Hello", "java"));
        assertEquals("javaello", cb.minCat("java", "Hello"));
    }

}