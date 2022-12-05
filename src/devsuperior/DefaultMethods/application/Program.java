package devsuperior.DefaultMethods.application;

import devsuperior.DefaultMethods.services.InterestService;
import devsuperior.DefaultMethods.services.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Mouths: ");
        int mouths = sc.nextInt();

        InterestService is = new UsaInterestService(1.0);
        double payment = is.payment(amount, mouths);

        System.out.println("Payment after " + mouths + " months:");
        System.out.println(String.format("%.2f", payment));
    }
}
