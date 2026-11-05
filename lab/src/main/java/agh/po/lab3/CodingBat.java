package agh.po.lab3;

import java.util.HashMap;
import java.util.Map;

public class CodingBat {

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if((aSmile == true && bSmile == true) || (aSmile == false && bSmile == false)){
            return true;
        } else{
            return false;
        }
    }


    public int intMax(int a, int b, int c) {
        int max;
        if(a>b){
            max = a;
        }else{
            max = b;
        }

        if(c>max){
            return c;
        } else{
            return max;
        }
    }

    public int sum13(int[] nums) {
        int sum = 0;
        int i = 0;
        if(nums!=null){
            while(i<nums.length){
                if(nums[i]==13) {
                    i = i+2;

                } else{
                    sum = sum + nums[i];
                    i++;
                }

            }
            return sum;
        } else{
            return 0;
        }
    }




    public String minCat(String a, String b) {
        if(a.length() > b.length()){
            int ileUciac = a.length() - b.length();
            return a.substring(ileUciac) + b;
        } else if(b.length() > a.length()){
            int ileUciac = b.length() - a.length();
            return a + b.substring(ileUciac);
        } else{
            return a + b;
        }
    }


    public Map<String, String> mapAB2(Map<String, String> map) {


        if (map.containsKey("a") && map.containsKey("b")) {
            if (map.get("a").equals(map.get("b"))) {
                map.remove("a");
                map.remove("b");
            }
        }
        return map;
    }



    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String s : strings){
            if(map.containsKey(s)){
                int count = map.get(s);
                map.put(s,count + 1);
            } else {
                map.put(s, 1);
            }
        }
        return map;
    }



    public static void main(String[] args){
        CodingBat cb = new CodingBat();



        Map<String, String> map = new HashMap<>();
        map.put("a","aaa");
        map.put("b","aaa");
        map.put("c","cake");
        System.out.println("Test 1 wejście: " + map);
        System.out.println("Test 1 wynik: " + cb.mapAB2((map)));

        String[] test1 = {"a", "b", "a", "c", "b"};
        String[] test2 = {"c", "b", "a"};
        String[] test3 = {"c", "c", "c", "c"};


        System.out.println("Wynik 1: " + cb.wordCount(test1));
        System.out.println("Wynik 2: " + cb.wordCount(test2));
        System.out.println("Wynik 3: " + cb.wordCount(test3));



        System.out.println("monkeyTrouble: " +cb.monkeyTrouble(true,false));

        System.out.println("intMax: " +cb.intMax(1,2,3));

        int[] a = {1,2,3,4,5,13,2,5,13,1,13,1,2};
        System.out.println("sum13: " +cb.sum13(a));

        System.out.println("minCat: " +cb.minCat("Hello", "Java"));




    }
}

