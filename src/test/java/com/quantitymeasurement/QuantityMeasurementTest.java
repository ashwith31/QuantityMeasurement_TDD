package com.quantitymeasurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityMeasurementTest {
    @Test
    void given0FeetAnd0Feet_ShouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAndNull_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = null;
        Assertions.assertNotEquals(feet1, feet2);
    }

}
