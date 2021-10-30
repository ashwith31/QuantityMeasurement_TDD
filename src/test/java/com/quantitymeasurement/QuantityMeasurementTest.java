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

    @Test
    void given0YardAnd0Yard_ShouldReturnEqual() {
        Yard yard1 = new Yard(0.0);
        Yard yard2 = new Yard(0.0);
        Assertions.assertEquals(yard1, yard2);
    }

    @Test
    public void given0YardAndNull_ShouldReturnNotEqual() {
        Yard yard1 = new Yard(0.0);
        Yard yard2 = null;
        Assertions.assertNotEquals(yard1, yard2);
    }

    @Test
    public void givenYardFromDifferentReference_ShouldReturnFalse() {
        Yard yard1 = new Yard(0.0);
        Yard yard2 = new Yard(0.0);
        boolean result = yard1 == yard2;
        Assertions.assertFalse(result);
    }

    @Test
    void givenYardandDifferentType_ShouldReturnNotEqual() {
        Yard yard = new Yard(0.0);
        boolean newYard = true;
        Assertions.assertNotEquals(yard, newYard);
    }

    @Test
    void given1YardAnd1Yard_ShouldReturnEqual() {
        Yard yard1 = new Yard(1.0);
        Yard yard2 = new Yard(1.0);
        Assertions.assertEquals(yard1, yard2);
    }

    @Test
    void given3Feet_WhenConvertedToYards_ShouldReturn1Yard() {
        QuantityMeasurement qm = new QuantityMeasurement();
        Feet feet = new Feet(3);
        Yard result =  qm.convertFeetToYard(feet.getValue());
        double expectedValue = 1;
        Assertions.assertEquals(expectedValue, result.getValue(),0.1);
    }

    @Test
    void given1Yard_WhenConvertedToInches_ShouldReturn36Yard() {
        QuantityMeasurement qm = new QuantityMeasurement();
        Yard feet = new Yard(1);
        Inch result =  qm.convertYardToInch(feet.getValue());
        double expectedValue = 36;
        Assertions.assertEquals(expectedValue, result.getValue(),0.1);
    }

    @Test
    void given1Feet_WhenConvertedToYards_ShouldNotReturn1Yard() {
        QuantityMeasurement qm = new QuantityMeasurement();
        Feet feet1 = new Feet(1.0);
        Yard yard1 = qm.convertFeetToYard(feet1.getValue());
        Assertions.assertNotEquals(1.0, yard1.getValue());
    }

    @Test
    void given36Inches_WhenConvertedToYards_ShouldReturn1Yard() {
        QuantityMeasurement qm = new QuantityMeasurement();
        Inch inch1 = new Inch(36.0);
        Yard yard1 = qm.convertInchToYard(inch1.getValue());
        Assertions.assertEquals(1.0, yard1.getValue());
    }

    @Test
    void given0CentimeterAnd0Centimeter_ShouldReturnEqual(){
       Centimeter centimeter = new Centimeter(0.0);
       Centimeter centimeter1 = new Centimeter(0.0);
       Assertions.assertEquals(centimeter, centimeter1);
    }

    @Test
    public void given0CentimeterAndNull_ShouldReturnNotEqual() {
        Centimeter centimeter = new Centimeter(0.0);
        Centimeter centimeter1 = null;
        Assertions.assertNotEquals(centimeter, centimeter1);
    }
}
