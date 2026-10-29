package agh.po.lab3;

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
        if(sum13)
    }




    public static void main(String[] args){
        CodingBat cb = new CodingBat();
        cb.monkeyTrouble(true,false);



    }
}

