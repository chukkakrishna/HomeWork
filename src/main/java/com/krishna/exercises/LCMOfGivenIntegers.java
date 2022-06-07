package com.krishna.exercises;
public class LCMOfGivenIntegers {
    public static int lcmCaliculator(int[] a) {
        int LCM=1;
        for (int i = 0; i < a.length; i++) {
            LcmOfTwoNumber obj= new LcmOfTwoNumber();
            LCM=obj.lcmOfTwoNumbers(LCM,a[i]);
        }
        return LCM;
    }
    public static void main(String[] args) {
    int lcm=lcmCaliculator(new int[]{60,5,15,6});
        System.out.println("LCM is : "+lcm);

    }
}
