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

    @Test
    void givenFeetWithSameReference_WhenCompared_ShouldReturnTrue(){
        Feet feet = new Feet(0.0);
        boolean sameReference = feet == feet;
        Assertions.assertTrue(sameReference);
    }

    @Test
    void givenFeetWithDiffrentReference_WhenCompared_ShouldReturnFalse() {
        Feet feet = new Feet(0.0);
        Feet feet1 = new Feet(0.0);
        boolean differentReference = feet == feet1;
        Assertions.assertFalse(differentReference);
    }

    @Test
    void givenDifferentType_WhenCompared_ShouldReturnFalse() {
        Feet feet = new Feet(0.0);
        boolean feet1 = true;
        Assertions.assertNotEquals(feet, feet1);
    }

    @Test
    void given1FeetAnd1Feet_ShouldReturnEqual(){
        Feet feet1 = new Feet(1.0);
        Feet feet2 = new Feet(1.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    void given0InchAnd0Inch_ShouldReturnEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    public void given0InchAndNull_ShouldReturnNotEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = null;
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenInchFromDifferentReference_ShouldReturnFalse() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0.0);
        boolean result = inch1 == inch2;
        Assertions.assertFalse(result);
    }

    @Test
    void givenInchandDifferentType_ShouldReturnNotEqual() {
        Inch inch = new Inch(0.0);
        boolean newInch = true;
        Assertions.assertNotEquals(inch, newInch);
    }

    @Test
    void given1InchAnd1Inch_ShouldReturnEqual() {
        Inch inch1 = new Inch(1.0);
        Inch inch2 = new Inch(1.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    void given1Feet_WhenConvertedToInches_ShouldReturn12Inches() {
        QuantityMeasurement qm = new QuantityMeasurement();
        Feet feet = new Feet(1);
        Inch result =  qm.convertFeetToInch(feet.getValue());
        double expectedValue = 12;
        Assertions.assertEquals(expectedValue, result.getValue());
    }
}
