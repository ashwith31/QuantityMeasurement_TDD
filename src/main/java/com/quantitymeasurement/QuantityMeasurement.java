package com.quantitymeasurement;

/*************************************************************************************************
 * Purpose: This is a QuantityMeasurement Class where we convert different entities.
 *
 * @author Ashwith
 * @since 30/10/21
 *************************************************************************************************/

public class QuantityMeasurement {

    /**
     * This is a method which converts Quantities.
     *
     * @param quantity1
     * @param quantity2
     * @return Quantity object
     */
    public Quantity convertQuantities(Quantity quantity1, Quantity quantity2) {
        if(quantity1.getUnit().getQUnit() == quantity2.getUnit().getQUnit())
        return new Quantity(quantity2.getUnit(), quantity1.getValue() *
                (quantity1.getUnit().getBaseCoversionValue() / quantity2.getUnit().getBaseCoversionValue()));
        return new Quantity(Unit.ERROR, 0);
    }

    /**
     * This is a method which is used to add two length values in inches.
     *
     * @param length1
     * @param length2
     * @return double - resultant of addition in inches.
     */
    public double addLengthsInInches(Quantity length1, Quantity length2) {
        return (length1.getValue() * length1.getUnit().getBaseCoversionValue() +
                length2.getValue() * length2.getUnit().getBaseCoversionValue()) / Unit.INCH.getBaseCoversionValue();
    }

    /**
     * This is a method which adds two volumes in Liters.
     *
     * @param volume1
     * @param volume2
     * @return double - resultant of addition
     */
    public double addVolumesInLiters(Quantity volume1, Quantity volume2) {
        return (volume1.getValue() * volume1.getUnit().getBaseCoversionValue()
                + volume2.getValue() * volume2.getUnit().getBaseCoversionValue()) / Unit.LITERS.getBaseCoversionValue();
    }

    /**
     * This is a method which adds two weights in Kilograms.
     *
     * @param weight1
     * @param weight2
     * @return double - resultant of addition.
     */
    public double addWeightsInKilogram(Quantity weight1, Quantity weight2) {
        return (weight1.getValue() * weight1.getUnit().getBaseCoversionValue() + weight2.getValue() * weight2.getUnit().getBaseCoversionValue()) / Unit.KILOGRAM.getBaseCoversionValue();
    }
}
