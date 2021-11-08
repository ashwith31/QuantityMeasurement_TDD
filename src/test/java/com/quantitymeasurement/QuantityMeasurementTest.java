package com.quantitymeasurement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityMeasurementTest {
    @Test
    void given0FeetAnd0Feet_ShouldReturnEqual() {
        Quantity feet1 = new Quantity(Unit.FEET,0.0);
        Quantity feet2 = new Quantity(Unit.FEET, 0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAndNull_ShouldReturnNotEqual() {
        Quantity feet1 = new Quantity(Unit.FEET, 0.0);
        Quantity feet2 = null;
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void givenFeetWithDifferentReference_WhenCompared_ShouldReturnFalse() {
        Quantity feet = new Quantity(Unit.FEET, 0.0);
        Quantity feet1 = new Quantity(Unit.FEET, 0.0);
        boolean differentReference = feet == feet1;
        Assertions.assertFalse(differentReference);
    }

    @Test
    void givenDifferentType_WhenCompared_ShouldReturnFalse() {
        Quantity feet = new Quantity(Unit.FEET, 0.0);
        boolean feet1 = true;
        Assertions.assertNotEquals(feet, feet1);
    }

    @Test
    void given1FeetAnd1Feet_ShouldReturnEqual(){
        Quantity feet1 = new Quantity(Unit.FEET, 1.0);
        Quantity feet2 = new Quantity(Unit.FEET, 1.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    void given0InchAnd0Inch_ShouldReturnEqual() {
        Quantity inch1 = new Quantity(Unit.INCH, 0.0);
        Quantity inch2 = new Quantity(Unit.INCH, 0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    public void given0InchAndNull_ShouldReturnNotEqual() {
        Quantity inch1 = new Quantity(Unit.INCH, 0.0);
        Quantity inch2 = null;
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenInchFromDifferentReference_ShouldReturnFalse() {
        Quantity inch1 = new Quantity(Unit.INCH, 0.0);
        Quantity inch2 = new Quantity(Unit.INCH, 0.0);
        boolean result = inch1 == inch2;
        Assertions.assertFalse(result);
    }

    @Test
    void givenInchandDifferentType_ShouldReturnNotEqual() {
        Quantity inch = new Quantity(Unit.INCH, 0.0);
        boolean newInch = true;
        Assertions.assertNotEquals(inch, newInch);
    }

    @Test
    void given1InchAnd1Inch_ShouldReturnEqual() {
        Quantity inch1 = new Quantity(Unit.INCH ,1.0);
        Quantity inch2 = new Quantity(Unit.INCH, 1.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    void given1Feet_WhenConvertedToInches_ShouldReturn12Inches() {
        QuantityMeasurement qm = new QuantityMeasurement();
        Quantity feet = new Quantity(Unit.FEET, 1);
        Quantity inch = new Quantity(Unit.INCH, 1);
        Quantity result =  qm.convertQuantities(feet, inch);
        double expectedValue = 12;
        Assertions.assertEquals(expectedValue, result.getValue());
    }

    @Test
    void given0YardAnd0Yard_ShouldReturnEqual() {
        Quantity quantity11 = new Quantity(Unit.YARD, 0.0);
        Quantity quantity12 = new Quantity(Unit.YARD, 0.0);
        Assertions.assertEquals(quantity11, quantity12);
    }

    @Test
    public void given0YardAndNull_ShouldReturnNotEqual() {
        Quantity quantity11 = new Quantity(Unit.YARD, 0.0);
        Quantity quantity12 = null;
        Assertions.assertNotEquals(quantity11, quantity12);
    }

    @Test
    public void givenYardFromDifferentReference_ShouldReturnFalse() {
        Quantity quantity11 = new Quantity(Unit.YARD, 0.0);
        Quantity quantity12 = new Quantity(Unit.YARD, 0.0);
        boolean result = quantity11 == quantity12;
        Assertions.assertFalse(result);
    }

    @Test
    void givenYardandDifferentType_ShouldReturnNotEqual() {
        Quantity quantity1 = new Quantity(Unit.YARD, 0.0);
        boolean newYard = true;
        Assertions.assertNotEquals(quantity1, newYard);
    }

    @Test
    void given1YardAnd1Yard_ShouldReturnEqual() {
        Quantity quantity11 = new Quantity(Unit.YARD, 1.0);
        Quantity quantity12 = new Quantity(Unit.YARD, 1.0);
        Assertions.assertEquals(quantity11, quantity12);
    }

    @Test
    void given3Feet_WhenConvertedToYards_ShouldReturn1Yard() {
        QuantityMeasurement qm = new QuantityMeasurement();
        Quantity feet = new Quantity(Unit.FEET, 3);
        Quantity yard = new Quantity(Unit.YARD, 1);
        Quantity result =  qm.convertQuantities(feet, yard);
        double expectedValue = 1;
        Assertions.assertEquals(expectedValue, result.getValue(),0.1);
    }

    @Test
    void given1Yard_WhenConvertedToInches_ShouldReturn36Yard() {
        QuantityMeasurement qm = new QuantityMeasurement();
        Quantity feet = new Quantity(Unit.YARD, 1);
        Quantity inches = new Quantity(Unit.INCH, 0);
        Quantity result =  qm.convertQuantities(feet, inches);
        double expectedValue = 36;
        Assertions.assertEquals(expectedValue, result.getValue(),0.1);
    }

    @Test
    void given1Feet_WhenConvertedToYards_ShouldNotReturn1Yard() {
        QuantityMeasurement qm = new QuantityMeasurement();
        Quantity feet1 = new Quantity(Unit.FEET, 1.0);
        Quantity yard1 = new Quantity(Unit.YARD,0.0);
        Quantity quantity11 = qm.convertQuantities(feet1, yard1);
        Assertions.assertNotEquals(1.0, quantity11.getValue());
    }

    @Test
    void given36Inches_WhenConvertedToYards_ShouldReturn1Yard() {
        QuantityMeasurement qm = new QuantityMeasurement();
        Quantity inch1 = new Quantity(Unit.INCH, 36.0);
        Quantity yard1 = new Quantity(Unit.YARD, 0.0);
        Quantity quantity11 = qm.convertQuantities(inch1, yard1);
        Assertions.assertEquals(1.0, quantity11.getValue());
    }

    @Test
    void given0CentimeterAnd0Centimeter_ShouldReturnEqual(){
       Quantity centimeter = new Quantity(Unit.CENTIMETER, 0.0);
       Quantity centimeter1 = new Quantity(Unit.CENTIMETER, 0.0);
       Assertions.assertEquals(centimeter, centimeter1);
    }

    @Test
    public void given0CentimeterAndNull_ShouldReturnNotEqual() {
        Quantity centimeter = new Quantity(Unit.CENTIMETER, 0.0);
        Quantity centimeter1 = null;
        Assertions.assertNotEquals(centimeter, centimeter1);
    }

    @Test
    public void givenCentimeterFromDifferentReference_ShouldReturnFalse() {
        Quantity centimeter = new Quantity(Unit.CENTIMETER, 0.0);
        Quantity centimeter1 = new Quantity(Unit.CENTIMETER, 0.0);
        boolean result = centimeter == centimeter1;
        Assertions.assertFalse(result);
    }

    @Test
    public void givenCentimeterFromDifferentType_ShouldReturnNotEqual() {
        Quantity centimeter = new Quantity(Unit.CENTIMETER, 0.0);
         boolean newBoolean = true;
        Assertions.assertNotEquals(centimeter, newBoolean);
    }

    @Test
    void given1CentimeterAnd1Centimeter_ShouldReturnEqual(){
        Quantity centimeter = new Quantity(Unit.CENTIMETER, 1.0);
        Quantity centimeter1 = new Quantity(Unit.CENTIMETER, 1.0);
        Assertions.assertEquals(centimeter, centimeter1);
    }

    @Test
    void given2Inches_WhenConvertedToCentimeters_ShouldReturn5Centimeters() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        Quantity inch = new Quantity(Unit.INCH, 2.0);
        Quantity centimeter = new Quantity(Unit.CENTIMETER, 0.0);
        Quantity centimeter1 = quantityMeasurement.convertQuantities(inch, centimeter);
        Assertions.assertEquals(5, centimeter1.getValue());
    }

    @Test
    void given1FeetAnd1Inch_ShouldReturnNotEqual() {
        Quantity feet = new Quantity(Unit.FEET, 1.0);
        Quantity inch = new Quantity(Unit.INCH, 1.0);
        Assertions.assertNotEquals(feet, inch);
    }

    @Test
    void given2InchsAnd2Inchs_WhenAdded_ShouldReturn4Inch() {
        QuantityMeasurement qm = new QuantityMeasurement();
        Quantity inch1 = new Quantity(Unit.INCH, 2.0);
        Quantity inch2 = new Quantity(Unit.INCH,2.0);
        double sum = qm.addLengthsInInches(inch1, inch2);
        Assertions.assertEquals(4.0, sum);
    }

    @Test
    void given1FeetAnd2Inchs_WhenAdded_ShouldReturn14Inch() {
        QuantityMeasurement qm = new QuantityMeasurement();
        Quantity inch1 = new Quantity(Unit.FEET, 1.0);
        Quantity inch2 = new Quantity(Unit.INCH,2.0);
        double sum = qm.addLengthsInInches(inch1, inch2);
        Assertions.assertEquals(14.0, sum);
    }

    @Test
    void given1FeetAnd1Feet_WhenAdded_ShouldReturn24Inch() {
        QuantityMeasurement qm = new QuantityMeasurement();
        Quantity feet1 = new Quantity(Unit.FEET, 1.0);
        Quantity feet2 = new Quantity(Unit.FEET,1.0);
        double sum = qm.addLengthsInInches(feet1, feet2);
        Assertions.assertEquals(24.0, sum);
    }

    @Test
    void given2InchAnd2Point5Centimeter_WhenAdded_ShouldReturn3Inch() {
        QuantityMeasurement qm = new QuantityMeasurement();
        Quantity inch1 = new Quantity(Unit.INCH, 2.0);
        Quantity centimeter1 = new Quantity(Unit.CENTIMETER,2.5);
        double sum = qm.addLengthsInInches(inch1, centimeter1);
        Assertions.assertEquals(3.0, sum);
    }

    @Test
    void given0GallonAnd0Gallon_ShouldReturnEqual() {
        Quantity gallon1 = new Quantity(Unit.LITERS, 0.0);
        Quantity gallon2 = new Quantity(Unit.LITERS, 0.0);
        Assertions.assertEquals(gallon1, gallon2);
    }
    @Test
    void given0GallonAndNull_ShouldReturnNotEqual() {
        Quantity gallon1 = new Quantity(Unit.LITERS, 0.0);
        Quantity gallon2 = null;
        Assertions.assertNotEquals(gallon1, gallon2);
    }
    @Test
    void givenGallonFromDifferentReferences_ShouldReturnFalse() {
        Quantity gallon1 = new Quantity(Unit.LITERS, 0.0);
        Quantity gallon2 = new Quantity(Unit.LITERS, 0.0);
        boolean result = gallon1 == gallon2;
        Assertions.assertFalse(result);
    }
    @Test
    void givenGallonAndDifferentType_ShouldReturnNotEqual() {
        Quantity gallon1 = new Quantity(Unit.LITERS, 0.0);
        boolean boolean1 = true;
        Assertions.assertNotEquals(gallon1, boolean1);
    }
    @Test
    void given1GallonAnd1Gallon_ShouldReturnEqual() {
        Quantity gallon1 = new Quantity(Unit.LITERS, 1.0);
        Quantity gallon2 = new Quantity(Unit.LITERS, 1.0);
        Assertions.assertEquals(gallon1,gallon2);
    }
    @Test
    void given0LitersAnd0Liters_ShouldReturnEqual() {
        Quantity liters1 = new Quantity(Unit.LITERS, 0.0);
        Quantity liters2 = new Quantity(Unit.LITERS, 0.0);
        Assertions.assertEquals(liters1, liters2);
    }
    @Test
    void given0LitersAndNull_ShouldReturnNotEqual() {
        Quantity liters1 = new Quantity(Unit.LITERS, 0.0);
        Quantity liters2 = null;
        Assertions.assertNotEquals(liters1, liters2);
    }
    @Test
    void givenLitersFromDifferentReferences_ShouldReturnFalse() {
        Quantity gallon1 = new Quantity(Unit.LITERS, 0.0);
        Quantity gallon2 = new Quantity(Unit.LITERS, 0.0);
        boolean result = gallon1 == gallon2;
        Assertions.assertFalse(result);
    }
    @Test
    void givenLitersAndDifferentType_ShouldReturnNotEqual() {
        Quantity gallon1 = new Quantity(Unit.LITERS, 0.0);
        boolean boolean1 = true;
        Assertions.assertNotEquals(gallon1, boolean1);
    }
    @Test
    void given1LiterAnd1Liter_ShouldReturnEqual() {
        Quantity gallon1 = new Quantity(Unit.LITERS, 1.0);
        Quantity gallon2 = new Quantity(Unit.LITERS, 1.0);
        Assertions.assertEquals(gallon1,gallon2);
    }
    @Test
    void given1Gallon_WhenConvertedToLiters_ShouldReturn3Ponit78Liters() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        Quantity gallon1 = new Quantity(Unit.GALLON, 1.0);
        Quantity liters1 = new Quantity(Unit.LITERS, 0.0);
        Quantity liters = quantityMeasurement.convertQuantities(gallon1, liters1);
        Assertions.assertEquals(3.78, liters.getValue());
    }
    @Test
    void given0MillilitersAnd0Milliliters_ShouldReturnEqual() {
        Quantity milliliters1 = new Quantity(Unit.MILLILITERS, 0.0);
        Quantity milliliters2 = new Quantity(Unit.MILLILITERS, 0.0);
        Assertions.assertEquals(milliliters1, milliliters2);
    }
    @Test
    void given0MillilitersAndNull_ShouldReturnNotEqual() {
        Quantity liters1 = new Quantity(Unit.MILLILITERS, 0.0);
        Quantity liters2 = null;
        Assertions.assertNotEquals(liters1, liters2);
    }
    @Test
    void givenMillilitersFromDifferentReferences_ShouldReturnFalse() {
        Quantity gallon1 = new Quantity(Unit.MILLILITERS, 0.0);
        Quantity gallon2 = new Quantity(Unit.MILLILITERS, 0.0);
        boolean result = gallon1 == gallon2;
        Assertions.assertFalse(result);
    }
    @Test
    void givenMilliitersAndDifferentType_ShouldReturnNotEqual() {
        Quantity milliliters1 = new Quantity(Unit.MILLILITERS, 0.0);
        boolean boolean1 = true;
        Assertions.assertNotEquals(milliliters1, boolean1);
    }
    @Test
    void given1MilliLiterAnd1MilliLiter_ShouldReturnEqual() {
        Quantity milliliters1 = new Quantity(Unit.MILLILITERS, 1.0);
        Quantity milliliters2 = new Quantity(Unit.MILLILITERS, 1.0);
        Assertions.assertEquals(milliliters1, milliliters2);
    }
    @Test
    void given1Liter_WhenComparedTOMilliliters_ShouldReturn1000Milliliters() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        Quantity liters1 = new Quantity(Unit.LITERS, 1);
        Quantity milliliters = new Quantity(Unit.MILLILITERS, 0.0);
        Quantity milliliters1 = quantityMeasurement.convertQuantities(liters1, milliliters);
        Assertions.assertEquals(1000, milliliters1.getValue());
    }
    @Test
    void given1GallonAnd3Ponit78Liters_WhenAdded_ShouldReturn7Point57Liters() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        Quantity gallon1 = new Quantity(Unit.GALLON, 1);
        Quantity liters1 = new Quantity(Unit.LITERS, 3.78);
        double result = quantityMeasurement.addVolumesInLiters(gallon1, liters1);
        Assertions.assertEquals(7.57, result,0.1);
    }

    @Test
    void given1LiterAnd1000MilliLiters_WhenAdded_ShouldReturn2Liters() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        Quantity milliliters1 = new Quantity(Unit.MILLILITERS, 1000);
        Quantity liters1 = new Quantity(Unit.LITERS, 1);
        double result = quantityMeasurement.addVolumesInLiters(milliliters1, liters1);
        Assertions.assertEquals(2.0, result,0.1);
    }
    @Test
    void given0KGAnd0KG_ShouldReturnEqual() {
        Quantity kilogram1 = new Quantity(Unit.KILOGRAM, 0.0);
        Quantity kilogram2 = new Quantity(Unit.KILOGRAM, 0.0);
        Assertions.assertEquals(kilogram1, kilogram2);
    }

    @Test
    void given0GramAnd0Gram_ShouldReturnEqual(){
        Quantity gram1 = new Quantity(Unit.GRAM, 0);
        Quantity gram2 = new Quantity(Unit.GRAM, 0);
        Assertions.assertEquals(gram1, gram2);
    }

    @Test
    void given1KG_WhenComparedWithGrams_ShouldReturn1000Grams() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        Quantity kilogram = new Quantity(Unit.KILOGRAM, 1);
        Quantity gram = new Quantity(Unit.GRAM, 0);
        Quantity result = quantityMeasurement.convertQuantities(kilogram, gram);
        Assertions.assertEquals(1000, result.getValue());
    }

    @Test
    void given0TonneAnd0Tonne_ShouldReturnEqual() {
        Quantity tonne1 = new Quantity(Unit.TONNE, 0.0);
        Quantity tonne2 = new Quantity(Unit.TONNE, 0.0);
        Assertions.assertEquals(tonne1, tonne2);
    }

    @Test
    void given1Tonne_WhenComparedWithKilogram_ShouldReturn1000Kilogram() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        Quantity tonne = new Quantity(Unit.TONNE, 1);
        Quantity kilogram = new Quantity(Unit.KILOGRAM, 0);
        Quantity result = quantityMeasurement.convertQuantities(tonne, kilogram);
        Assertions.assertEquals(1000, result.getValue());
    }

    @Test
    void given1TonneAnd1Kilogram_WhenAdded_ShouldReturn1001Kilogram() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        Quantity weight1 = new Quantity(Unit.TONNE,1);
        Quantity weight2 = new Quantity(Unit.KILOGRAM, 1);
        double result = quantityMeasurement.addWeightsInKilogram(weight1, weight2);
        Assertions.assertEquals(1001, result);
    }

    @Test
    void given0FarhenheitAnd0Farenheit_ShouldReturnEqual() {
        Quantity farenheit1 = new Quantity(Unit.FAHRENHEIT, 0.0);
        Quantity farenheit2 = new Quantity(Unit.FAHRENHEIT, 0);
        Assertions.assertEquals(farenheit1, farenheit2);
    }

    @Test
    void given0CelsiusAnd0Celsius_ShouldReturnEqual() {
        Quantity celsius1 = new Quantity(Unit.CELSIUS, 0.0);
        Quantity facelsius2 = new Quantity(Unit.CELSIUS, 0);
        Assertions.assertEquals(celsius1, facelsius2);
    }

    @Test
    void given212Farhenheit_WhenConvertedToCelsius_ShouldReturn100Celsius() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        Quantity farhenheit = new Quantity(Unit.FAHRENHEIT, 212);
        Quantity celsius = new Quantity(Unit.CELSIUS,0.0);
        Quantity result = quantityMeasurement.convertQuantities(farhenheit, celsius);
        Assertions.assertEquals(100, result.getValue());
    }
}
