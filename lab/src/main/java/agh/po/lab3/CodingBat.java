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





    public static void main(String[] args){
        CodingBat cb = new CodingBat();
        cb.monkeyTrouble(true,false);
        int[] a = {1,2,3,4,5,13,2,5,13,1,13,1,2};



    }
}

