package com.krishna.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseAnArrayTest {

    @Test
    void reverse() {

        ReverseAnArray obj = new ReverseAnArray();
        assertArrayEquals(new int[]{5,7,9,6,5},obj.reverse(new int[]{5,6,9,7,5}));
        assertArrayEquals(new int[]{5,7,9},obj.reverse(new int[]{9,7,5}));
    }
}