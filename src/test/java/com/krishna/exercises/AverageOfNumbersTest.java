package com.krishna.exercises;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

class AverageOfNumbersTest {
    @Test
    public void testAverage() {
        AverageOfNumbers obj1 = new AverageOfNumbers();
        assertEquals(5, obj1.average(asList(9, 8, 7, 6, 5, 4, 3, 2, 1)));
        assertEquals(15, obj1.average(asList(19, 18, 17, 16, 15, 14, 13, 12, 11)));
        assertEquals(0, obj1.average(new ArrayList<>()));
    }
}