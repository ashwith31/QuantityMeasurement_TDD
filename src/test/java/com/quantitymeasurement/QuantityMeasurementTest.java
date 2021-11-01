package com.quantitymeasurement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityMeasurementTest {
    @Test
    void given0FeetAnd0Feet_ShouldReturnEqual() {
        Length feet1 = new Length(Unit.FEET,0.0);
        Length feet2 = new Length(Unit.FEET, 0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAndNull_ShouldReturnNotEqual() {
        Length feet1 = new Length(Unit.FEET, 0.0);
        Length feet2 = null;
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void givenFeetWithSameReference_WhenCompared_ShouldReturnTrue(){
        Length feet = new Length(Unit.FEET, 0.0);
        boolean sameReference = feet == feet;
        Assertions.assertTrue(sameReference);
    }

    @Test
    void givenFeetWithDiffrentReference_WhenCompared_ShouldReturnFalse() {
        Length feet = new Length(Unit.FEET, 0.0);
        Length feet1 = new Length(Unit.FEET, 0.0);
        boolean differentReference = feet == feet1;
        Assertions.assertFalse(differentReference);
    }

    @Test
    void givenDifferentType_WhenCompared_ShouldReturnFalse() {
        Length feet = new Length(Unit.FEET, 0.0);
        boolean feet1 = true;
        Assertions.assertNotEquals(feet, feet1);
    }

    @Test
    void given1FeetAnd1Feet_ShouldReturnEqual(){
        Length feet1 = new Length(Unit.FEET, 1.0);
        Length feet2 = new Length(Unit.FEET, 1.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    void given0InchAnd0Inch_ShouldReturnEqual() {
        Length inch1 = new Length(Unit.INCH, 0.0);
        Length inch2 = new Length(Unit.INCH, 0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    public void given0InchAndNull_ShouldReturnNotEqual() {
        Length inch1 = new Length(Unit.INCH, 0.0);
        Length inch2 = null;
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenInchFromDifferentReference_ShouldReturnFalse() {
        Length inch1 = new Length(Unit.INCH, 0.0);
        Length inch2 = new Length(Unit.INCH, 0.0);
        boolean result = inch1 == inch2;
        Assertions.assertFalse(result);
    }

    @Test
    void givenInchandDifferentType_ShouldReturnNotEqual() {
        Length inch = new Length(Unit.INCH, 0.0);
        boolean newInch = true;
        Assertions.assertNotEquals(inch, newInch);
    }

    @Test
    void given1InchAnd1Inch_ShouldReturnEqual() {
        Length inch1 = new Length(Unit.INCH ,1.0);
        Length inch2 = new Length(Unit.INCH, 1.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    void given1Feet_WhenConvertedToInches_ShouldReturn12Inches() {
        QuantityMeasurement qm = new QuantityMeasurement();
        Length feet = new Length(Unit.FEET, 1);
        Length result =  qm.convertFeetToInch(feet.getValue());
        double expectedValue = 12;
        Assertions.assertEquals(expectedValue, result.getValue());
    }

    @Test
    void given0YardAnd0Yard_ShouldReturnEqual() {
        Length length1 = new Length(Unit.YARD, 0.0);
        Length length2 = new Length(Unit.YARD, 0.0);
        Assertions.assertEquals(length1, length2);
    }

    @Test
    public void given0YardAndNull_ShouldReturnNotEqual() {
        Length length1 = new Length(Unit.YARD, 0.0);
        Length length2 = null;
        Assertions.assertNotEquals(length1, length2);
    }

    @Test
    public void givenYardFromDifferentReference_ShouldReturnFalse() {
        Length length1 = new Length(Unit.YARD, 0.0);
        Length length2 = new Length(Unit.YARD, 0.0);
        boolean result = length1 == length2;
        Assertions.assertFalse(result);
    }

    @Test
    void givenYardandDifferentType_ShouldReturnNotEqual() {
        Length length = new Length(Unit.YARD, 0.0);
        boolean newYard = true;
        Assertions.assertNotEquals(length, newYard);
    }

    @Test
    void given1YardAnd1Yard_ShouldReturnEqual() {
        Length length1 = new Length(Unit.YARD, 1.0);
        Length length2 = new Length(Unit.YARD, 1.0);
        Assertions.assertEquals(length1, length2);
    }

    @Test
    void given3Feet_WhenConvertedToYards_ShouldReturn1Yard() {
        QuantityMeasurement qm = new QuantityMeasurement();
        Length feet = new Length(Unit.FEET, 3);
        Length result =  qm.convertFeetToYard(feet.getValue());
        double expectedValue = 1;
        Assertions.assertEquals(expectedValue, result.getValue(),0.1);
    }

    @Test
    void given1Yard_WhenConvertedToInches_ShouldReturn36Yard() {
        QuantityMeasurement qm = new QuantityMeasurement();
        Length feet = new Length(Unit.YARD, 1);
        Length result =  qm.convertYardToInch(feet.getValue());
        double expectedValue = 36;
        Assertions.assertEquals(expectedValue, result.getValue(),0.1);
    }

    @Test
    void given1Feet_WhenConvertedToYards_ShouldNotReturn1Yard() {
        QuantityMeasurement qm = new QuantityMeasurement();
        Length feet1 = new Length(Unit.FEET, 1.0);
        Length length1 = qm.convertFeetToYard(feet1.getValue());
        Assertions.assertNotEquals(1.0, length1.getValue());
    }

    @Test
    void given36Inches_WhenConvertedToYards_ShouldReturn1Yard() {
        QuantityMeasurement qm = new QuantityMeasurement();
        Length inch1 = new Length(Unit.INCH, 36.0);
        Length length1 = qm.convertInchToYard(inch1.getValue());
        Assertions.assertEquals(1.0, length1.getValue());
    }

    @Test
    void given0CentimeterAnd0Centimeter_ShouldReturnEqual(){
       Length centimeter = new Length(Unit.CENTIMETER, 0.0);
       Length centimeter1 = new Length(Unit.CENTIMETER, 0.0);
       Assertions.assertEquals(centimeter, centimeter1);
    }

    @Test
    public void given0CentimeterAndNull_ShouldReturnNotEqual() {
        Length centimeter = new Length(Unit.CENTIMETER, 0.0);
        Length centimeter1 = null;
        Assertions.assertNotEquals(centimeter, centimeter1);
    }

    @Test
    public void givenCentimeterFromDifferentReference_ShouldReturnFalse() {
        Length centimeter = new Length(Unit.CENTIMETER, 0.0);
        Length centimeter1 = new Length(Unit.CENTIMETER, 0.0);
        boolean result = centimeter == centimeter1;
        Assertions.assertFalse(result);
    }

    @Test
    public void givenCentimeterFromDifferentType_ShouldReturnNotEqual() {
        Length centimeter = new Length(Unit.CENTIMETER, 0.0);
         boolean newBoolean = true;
        Assertions.assertNotEquals(centimeter, newBoolean);
    }

    @Test
    void given1CentimeterAnd1Centimeter_ShouldReturnEqual(){
        Length centimeter = new Length(Unit.CENTIMETER, 1.0);
        Length centimeter1 = new Length(Unit.CENTIMETER, 1.0);
        Assertions.assertEquals(centimeter, centimeter1);
    }

    @Test
    void given2Inches_WhenConvertedToCentimeters_ShouldReturn5Centimeters() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        Length inch = new Length(Unit.INCH, 2.0);
        Length centimeter = quantityMeasurement.convertInchToCentimeter(inch.getValue());
        Assertions.assertEquals(5, centimeter.getValue());
    }

    @Test
    void given1FeetAnd1Inch_ShouldReturnNotEqual() {
        Length feet = new Length(Unit.FEET, 1.0);
        Length inch = new Length(Unit.INCH, 1.0);
        Assertions.assertNotEquals(feet, inch);
    }

    @Test
    void given2InchsAnd2Inchs_WhenAdded_ShouldReturn4Inch() {
        QuantityMeasurement qm = new QuantityMeasurement();
        Length inch1 = new Length(Unit.INCH, 2.0);
        Length inch2 = new Length(Unit.INCH,2.0);
        double sum = qm.addLengthsInInchs(inch1, inch2);
        Assertions.assertEquals(4.0, sum);
    }

    @Test
    void given1FeetAnd2Inchs_WhenAdded_ShouldReturn14Inch() {
        QuantityMeasurement qm = new QuantityMeasurement();
        Length inch1 = new Length(Unit.FEET, 1.0);
        Length inch2 = new Length(Unit.INCH,2.0);
        double sum = qm.addLengthsInInchs(inch1, inch2);
        Assertions.assertEquals(14.0, sum);
    }

    @Test
    void given1FeetAnd1Feet_WhenAdded_ShouldReturn24Inch() {
        QuantityMeasurement qm = new QuantityMeasurement();
        Length feet1 = new Length(Unit.FEET, 1.0);
        Length feet2 = new Length(Unit.FEET,1.0);
        double sum = qm.addLengthsInInchs(feet1, feet2);
        Assertions.assertEquals(24.0, sum);
    }

    @Test
    void given2InchAnd2Point5Centimeter_WhenAdded_ShouldReturn3Inch() {
        QuantityMeasurement qm = new QuantityMeasurement();
        Length inch1 = new Length(Unit.INCH, 2.0);
        Length centimeter1 = new Length(Unit.CENTIMETER,2.5);
        double sum = qm.addLengthsInInchs(inch1, centimeter1);
        Assertions.assertEquals(3.0, sum);
    }

    @Test
    void given0GallonAnd0Gallon_ShouldReturnEqual() {
        Volume gallon1 = new Volume(Unit.LITERS, 0.0);
        Volume gallon2 = new Volume(Unit.LITERS, 0.0);
        Assertions.assertEquals(gallon1, gallon2);
    }

    @Test
    void given0GallonAndNull_ShouldReturnNotEqual() {
        Volume gallon1 = new Volume(Unit.LITERS, 0.0);
        Volume gallon2 = null;
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    void givenGallonFromDifferentReferences_ShouldReturnFalse() {
        Volume gallon1 = new Volume(Unit.LITERS, 0.0);
        Volume gallon2 = new Volume(Unit.LITERS, 0.0);
        boolean result = gallon1 == gallon2;
        Assertions.assertFalse(result);
    }

    @Test
    void givenGallonAndDifferentType_ShouldReturnNotEqual() {
        Volume gallon1 = new Volume(Unit.LITERS, 0.0);
        boolean boolean1 = true;
        Assertions.assertNotEquals(gallon1, boolean1);
    }

    @Test
    void given1GallonAnd1Gallon_ShouldReturnEqual() {
        Volume gallon1 = new Volume(Unit.LITERS, 1.0);
        Volume gallon2 = new Volume(Unit.LITERS, 1.0);
        Assertions.assertEquals(gallon1,gallon2);
    }

    @Test
    void given0LitersAnd0Liters_ShouldReturnEqual() {
        Volume liters1 = new Volume(Unit.LITERS, 0.0);
        Volume liters2 = new Volume(Unit.LITERS, 0.0);
        Assertions.assertEquals(liters1, liters2);
    }

    @Test
    void given0LitersAndNull_ShouldReturnNotEqual() {
        Volume liters1 = new Volume(Unit.LITERS, 0.0);
        Volume liters2 = null;
        Assertions.assertNotEquals(liters1, liters2);
    }

    @Test
    void givenLitersFromDifferentReferences_ShouldReturnFalse() {
        Volume gallon1 = new Volume(Unit.LITERS, 0.0);
        Volume gallon2 = new Volume(Unit.LITERS, 0.0);
        boolean result = gallon1 == gallon2;
        Assertions.assertFalse(result);
    }

    @Test
    void givenLitersAndDifferentType_ShouldReturnNotEqual() {
        Volume gallon1 = new Volume(Unit.LITERS, 0.0);
        boolean boolean1 = true;
        Assertions.assertNotEquals(gallon1, boolean1);
    }

    @Test
    void given1LiterAnd1Liter_ShouldReturnEqual() {
        Volume gallon1 = new Volume(Unit.LITERS, 1.0);
        Volume gallon2 = new Volume(Unit.LITERS, 1.0);
        Assertions.assertEquals(gallon1,gallon2);
    }

    @Test
    void given1Gallon_WhenConvertedToLiters_ShouldReturn3Ponit78Liters() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        Volume gallon1 = new Volume(Unit.LITERS, 1.0);
        Volume liters1 = quantityMeasurement.convertGallonToLiters(gallon1.getValue());
        Assertions.assertEquals(3.78, liters1.getValue());
    }

    @Test
    void given0MillilitersAnd0Milliliters_ShouldReturnEqual() {
        Volume milliliters1 = new Volume(Unit.MILLILITERS, 0.0);
        Volume milliliters2 = new Volume(Unit.MILLILITERS, 0.0);
        Assertions.assertEquals(milliliters1, milliliters2);
    }

    @Test
    void given0MillilitersAndNull_ShouldReturnNotEqual() {
        Volume liters1 = new Volume(Unit.MILLILITERS, 0.0);
        Volume liters2 = null;
        Assertions.assertNotEquals(liters1, liters2);
    }

    @Test
    void givenMillilitersFromDifferentReferences_ShouldReturnFalse() {
        Volume gallon1 = new Volume(Unit.MILLILITERS, 0.0);
        Volume gallon2 = new Volume(Unit.MILLILITERS, 0.0);
        boolean result = gallon1 == gallon2;
        Assertions.assertFalse(result);
    }

    @Test
    void givenMilliitersAndDifferentType_ShouldReturnNotEqual() {
        Volume milliliters1 = new Volume(Unit.MILLILITERS, 0.0);
        boolean boolean1 = true;
        Assertions.assertNotEquals(milliliters1, boolean1);
    }

    @Test
    void given1MilliLiterAnd1MilliLiter_ShouldReturnEqual() {
        Volume milliliters1 = new Volume(Unit.MILLILITERS, 1.0);
        Volume milliliters2 = new Volume(Unit.MILLILITERS, 1.0);
        Assertions.assertEquals(milliliters1, milliliters2);
    }

    @Test
    void given1Liter_WhenComparedTOMilliliters_ShouldReturn1000Milliliters() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        Volume liters1 = new Volume(Unit.LITERS, 1);
        Volume milliliters1 = quantityMeasurement.convertLitersToMilliliters(liters1.getValue());
        Assertions.assertEquals(1000, milliliters1.getValue());
    }

    @Test
    void given1GallonAnd3Ponit78Liters_WhenAdded_ShouldReturn7Point57Liters() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        Volume gallon1 = new Volume(Unit.GALLON, 1);
        Volume liters1 = new Volume(Unit.LITERS, 3.78);
        double result = quantityMeasurement.addVolumesInLiters(gallon1, liters1);
        Assertions.assertEquals(7.57, result,0.1);
    }
}
