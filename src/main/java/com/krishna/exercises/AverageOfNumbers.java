package com.krishna.exercises;

import java.util.List;

public class AverageOfNumbers {
    public double average(List<Integer> list) {
        int length = list.size();
        if (length != 0) {
            int sum = list.stream()
                    .reduce(0, (a, b) -> Integer.sum(a, b));
            System.out.println("Average is: " + sum / length);
            return sum / length;
        } else {
            System.out.println("Empty List passed");
            return 0;
        }
    }
}
