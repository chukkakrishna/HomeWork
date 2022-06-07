package com.krishna.exercises;
public class HighestNumberInGivenArray {
    public static int secondHighest(int[] list){
        int firstMax=0,secondMax=0,temp=0;
        for(int i=0;i<list.length-1;i++){
            if(firstMax<list[i]){
                firstMax=list[i];
            }
        }
        return firstMax;
    }
    public static void main(String[] args) {
        System.out.println("value is: "+secondHighest(new int[]{5,4,3,2,1}));
        System.out.println("value is: "+secondHighest(new int[]{1,2,3,4,5}));
        System.out.println("value is: "+secondHighest(new int[]{1,2,6,4,5}));
        System.out.println("value is: "+secondHighest(new int[]{1,8,3,8,5}));
    }
}
