package agh.po.lab3;

import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;

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
        assertEquals(3, cb.sum13(new int[]{13, 1, 2, 13, 2, 1, 13, 2}));
    }

    @org.junit.Test
    public void minCat() {
        CodingBat cb = new CodingBat();
        // 3 przypadki testowe
        assertEquals("loHi", cb.minCat("Hello", "Hi"));
        assertEquals("ellojava", cb.minCat("Hello", "java"));
        assertEquals("javaello", cb.minCat("java", "Hello"));
    }
    @org.junit.Test
    public void mapAB2(){
        CodingBat cb = new CodingBat();

        // a i b są równe, usuwamy oba klucze
        Map<String, String> input1 = new HashMap<>();
        input1.put("a", "aaa");
        input1.put("b", "aaa");
        input1.put("c", "cake");
        Map<String, String> expected1 = new HashMap<>();
        expected1.put("c", "cake");
        assertEquals(expected1, cb.mapAB2(input1));

        // a i b są różne, mapa bez zmian
        Map<String, String> input2 = new HashMap<>();
        input2.put("a", "aaa");
        input2.put("b", "bbb");
        Map<String, String> expected2 = new HashMap<>();
        expected2.put("a", "aaa");
        expected2.put("b", "bbb");
        assertEquals(expected2, cb.mapAB2(input2));

        // brak klucza b, mapa bez zmian)
        Map<String, String> input3 = new HashMap<>();
        input3.put("a", "aaa");
        input3.put("c", "cake");
        Map<String, String> expected3 = new HashMap<>();
        expected3.put("a", "aaa");
        expected3.put("c", "cake");
        assertEquals(expected3, cb.mapAB2(input3));



    }

    @org.junit.Test
    public void wordCount(){
        CodingBat cb = new CodingBat();

        String[] test1 = {"a", "b", "c", "b"};
        Map<String, Integer> expected1 = new HashMap<>();
        expected1.put("a",1);
        expected1.put("b",2);
        expected1.put("c",1);
        assertEquals(expected1,cb.wordCount(test1));

        String[] test2 = {"c","c","c","c"};
        Map<String, Integer> expected2 = new HashMap<>();
        expected2.put("c",4);
        assertEquals(expected2, cb.wordCount(test2));

        String[] test3 = {};
        Map<String, Integer> expected3 = new HashMap<>();
        assertEquals(expected3, cb.wordCount(test3));
    }



}