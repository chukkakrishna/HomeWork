package com.krishna.exercises;
public class LcmOfTwoNumber {
    public static int lcmOfTwoNumbers(int n1, int n2) {
        int i = 1, LCM = n1>n2? n1:n2;
        while (LCM <= n1 * n2) {
            if ((LCM*i) % n1 == 0 && (LCM*i) % n2 == 0) {
                LCM=LCM*i;
                break;
            }
            else {
                i = i + 1;
            }
        }
        return LCM;
    }
    public static void main(String[] args) {
        int lcm = lcmOfTwoNumbers(3, 20);
        System.out.println("LCM is: " + lcm);

    }
}
