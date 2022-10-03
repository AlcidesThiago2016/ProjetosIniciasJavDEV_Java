package Converter.application;

import Converter.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o valor do dolar? ");
        double dolarCurrent = sc.nextDouble();
        System.out.print("Quantos doalres serao comprados ? ");
        double dolarPurchase = sc.nextDouble();

        double currentValue = CurrencyConverter.converter(dolarCurrent, dolarPurchase);
        System.out.printf("Valor a ser pago em reais = %.2f%n ", currentValue);
        sc.close();
    }
}
