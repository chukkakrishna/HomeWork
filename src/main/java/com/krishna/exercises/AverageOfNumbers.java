package com.krishna.exercises;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class AverageOfNumbers {
    public double average(List<Integer> list) {
           return  list.stream()
                    .mapToInt(Integer::intValue)
                    .average()
                    .orElse(0);

        }
}
