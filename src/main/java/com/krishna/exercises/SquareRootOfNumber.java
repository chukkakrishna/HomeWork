package com.krishna.exercises;

public class SquareRootOfNumber {

    public static void squareRoot(int number) {
        int sqrt=0;
        boolean found=false;
        for (int i = 1; i < number / 2; i++)
        {
            if (i * i == number) {
                sqrt=i;
                found=true;
            }
        }
        if(found)
            System.out.println("sqrt found: "+ sqrt);
        else
            System.out.println("Not a perfect square");
    }

    public static void main(String[] args) { // here java starts its first step
        squareRoot(50);  // calls the logic method
    }
}
