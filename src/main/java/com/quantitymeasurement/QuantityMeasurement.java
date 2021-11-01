package com.quantitymeasurement;

/*************************************************************************************************
 * Purpose: This is a QunatityMeasurement Class where we convert different entities.
 *
 * @author Ashwith
 * @since 30/10/21
 *************************************************************************************************/

public class QuantityMeasurement {

    /**
     * This is a method which converts Feet to Inches
     *
     * @param feet
     * @return Length object
     */
    public Length convertFeetToInch(double feet) {
        return new Length(Unit.INCH, feet * 12);
    }

    /**
     * This is a method which converts Feet to Yard
     *
     * @param feet
     * @return Length Object
     */
    public Length convertFeetToYard(double feet) {
        return new Length(Unit.YARD, feet * 0.33);
    }

    /**
     * This is a method which converts Yard to Inches
     *
     * @param yard
     * @return Length Object
     */
    public Length convertYardToInch(double yard) {
        return new Length(Unit.INCH, yard * 36);
    }

    /**
     * This is a method which converts Inches to Yard.
     *
     * @param inch
     * @return Length Object
     */
    public Length convertInchToYard(double inch) {
        return new Length(Unit.YARD, inch / 36);
    }

    /**
     * This is a method which converts Inches to Centimeter.
     *
     * @param inch
     * @return Length Object
     */
    public Length convertInchToCentimeter(double inch) {
        return new Length(Unit.CENTIMETER, inch * 2.5);
    }

    /**
     * This is a method which is used to add two length values in inches.
     *
     * @param length1
     * @param length2
     * @return double - resultant of addition in inches.
     */
    public double addLengthsInInchs(Length length1, Length length2){
        return (length1.getValue() * length1.getUnit().getBaseCoversionValue() + length2.getValue() * length2.getUnit().getBaseCoversionValue())/2.5;
    }

    /**
     * This method is used to convert Gallons to Liters.
     *
     * @param gallon1
     * @return Volume object
     */
    public Volume convertGallonToLiters(double gallon1) {
        return new Volume(Unit.LITERS, gallon1 * 3.78);
    }
}
