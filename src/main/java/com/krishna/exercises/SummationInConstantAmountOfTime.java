package com.krishna.exercises;

public class SummationInConstantAmountOfTime {

    public static int sum(int upto) {
    int sum=0;
    sum=upto*(upto+1)/2;
    return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(10));
    }
}
