package com.krishna.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LcmOfTwoNumberTest {

    @Test
    void lcmOfTwoNumbers() {
        LcmOfTwoNumber obj = new LcmOfTwoNumber();
        assertEquals(15,obj.lcmOfTwoNumbers(3,5));
        assertEquals(10,obj.lcmOfTwoNumbers(10,5));
        assertEquals(50,obj.lcmOfTwoNumbers(10,25));

    }

}