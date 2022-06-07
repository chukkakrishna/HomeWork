package com.krishna.exercises;

public class ReverseAnArray {
    public static int[] reverse(int[] numbers){
        for(int i=0,temp=0,j=numbers.length-1;i<j;i++,j--){
            temp=numbers[i];
            numbers[i]=numbers[j];
            numbers[j]=temp;
        }
        return numbers;
    }
    public static void main(String[] args) {
        int[] b= reverse(new int[]{5,3,8,9});
        for(int print:b){
            System.out.print(print+" ");
        }
    }
}
