package com.quantitymeasurement;

/*************************************************************************************************
 * Purpose: This is a QuantityMeasurement Class where we convert different entities.
 *
 * @author Ashwith
 * @since 30/10/21
 *************************************************************************************************/

public class QuantityMeasurement {

    /**
     * This is a method which converts Lengths.
     *
     * @param
     * @return Length object
     */
    public Length convertLengths(Length length1, Length length2) {
        return new Length(length2.getUnit(), length1.getValue()*(length1.getUnit().getBaseCoversionValue()/length2.getUnit().getBaseCoversionValue()));
    }


    /**
     * This is a method which is used to add two length values in inches.
     *
     * @param length1
     * @param length2
     * @return double - resultant of addition in inches.
     */
    public double addLengthsInInchs(Length length1, Length length2) {
        return (length1.getValue() * length1.getUnit().getBaseCoversionValue() + length2.getValue() * length2.getUnit().getBaseCoversionValue()) / Unit.INCH.getBaseCoversionValue();
    }

    /**
     * This method is used to convert Volumes.
     *
     * @param
     * @return Volume object
     */
    public Volume convertVolumes(Volume volume1, Volume volume2) {
        return new Volume(volume2.getUnit(), volume1.getValue()*(volume1.getUnit().getBaseCoversionValue()/volume2.getUnit().getBaseCoversionValue()));
    }

    /**
     * This is a method which adds two volumes in Liters.
     *
     * @param volume1
     * @param volume2
     * @return
     */
    public double addVolumesInLiters(Volume volume1, Volume volume2) {
        return (volume1.getValue() * volume1.getUnit().getBaseCoversionValue() + volume2.getValue() * volume2.getUnit().getBaseCoversionValue()) / Unit.LITERS.getBaseCoversionValue();
    }
}
