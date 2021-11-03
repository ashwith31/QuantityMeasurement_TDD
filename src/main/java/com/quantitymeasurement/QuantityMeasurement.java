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
     * @param length1
     * @param length2
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
     * @param volume1
     * @param volume2
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

    /**
     * This is a method which compares two weights.
     *
     * @param weight1
     * @param weight2
     * @return Weight object
     */
    public Weight convertWeights(Weight weight1, Weight weight2){
        return new Weight(weight2.getUnit(), weight1.getValue()*(weight1.getUnit().getBaseCoversionValue()/weight2.getUnit().getBaseCoversionValue()));
    }

    /**
     * This is a method which adds two weights in Kilograms.
     *
     * @param weight1
     * @param weight2
     * @return double - resultant of addition.
     */
    public double addWeightsInKilogram(Weight weight1, Weight weight2) {
        return (weight1.getValue() * weight1.getUnit().getBaseCoversionValue() + weight2.getValue() * weight2.getUnit().getBaseCoversionValue()) / Unit.KILOGRAM.getBaseCoversionValue();
    }

    public Temperature convertTemperature(Temperature temperature1, Temperature temperature2){
        return new Temperature(temperature2.getUnit(), temperature1.getValue()*(temperature2.getUnit().getBaseCoversionValue()/temperature1.getUnit().getBaseCoversionValue()));
    }
}
