package com.krishna.exercises;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SummationInConstantAmountOfTimeTest {
    @Test
    public void testsum() {
        SummationInConstantAmountOfTime obj = new SummationInConstantAmountOfTime();
        assertEquals(55,obj.sum(10));
        assertEquals(15,obj.sum(5));
        assertEquals(5050,obj.sum(100));
        assertEquals(0,obj.sum(0));

    }
}