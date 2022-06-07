package com.krishna.exercises;

public class SquareRootOfNumberlogN {
    public static int squareRootOfNumber(int number) {
        System.out.println("This is the number: " + number);
        if (number == 0) {
            System.out.println("square root is: " + number);
        }
        int start = 1, end = number, mid = 0, answer = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            int sqr = mid * mid;
            if (sqr <= number) {
                answer = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("hellooooooo");
        System.out.println(squareRootOfNumber(121));
    }
}
