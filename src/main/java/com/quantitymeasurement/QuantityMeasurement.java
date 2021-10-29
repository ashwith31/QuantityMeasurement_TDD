package com.quantitymeasurement;

public class QuantityMeasurement {

   public Inch convertFeetToInch(double feet){
       return new Inch(feet*12);
   }

   public Yard convertFeetToYard(double feet){
       return new Yard(feet*0.33);
   }
}
