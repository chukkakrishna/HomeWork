package com.krishna.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LCMOfGivenIntegersTest {

    @Test
    void lcmCaliculator() {
        LCMOfGivenIntegers obj = new LCMOfGivenIntegers();
        assertEquals(10,obj.lcmCaliculator(new int[]{1,5,2,10}));
        assertEquals(100,obj.lcmCaliculator(new int[]{4,50,25,10}));
        assertEquals(36,obj.lcmCaliculator(new int[]{9,4,12,18}));

    }
}