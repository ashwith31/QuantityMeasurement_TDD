package com.quantitymeasurement;

public class QuantityMeasurement {

   public Inch convertFeetToInch(double feet){
       return new Inch(feet*12);
   }
}
