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
        if(quantity1.getUnit().getQuantityUnit() == quantity2.getUnit().getQuantityUnit())
        return new Quantity(quantity2.getUnit(), quantity1.getValue() *
                (quantity1.getUnit().getBaseConversionValue() / quantity2.getUnit().getBaseConversionValue()));
        return new Quantity(Unit.ERROR, 0);
    }

    /**
     * This is a method which is used to add two quantities if they are same type.
     *
     * @param quantity1
     * @param quantity2
     * @return double - resultant of addition in inches.
     */
    public double addQuantities(Quantity quantity1, Quantity quantity2) {
        if(quantity1.getUnit().getQuantityUnit() ==  quantity2.getUnit().getQuantityUnit() )
        return (quantity1.getValue() * quantity1.getUnit().getBaseConversionValue() +
                quantity2.getValue() * quantity2.getUnit().getBaseConversionValue());
        return 0;
    }
}
