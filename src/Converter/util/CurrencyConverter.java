package Converter.util;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double converter(double dolarCurrent, double dolarPurchase){
        return  dolarPurchase * dolarCurrent * (1.0 + IOF);
    }
}
