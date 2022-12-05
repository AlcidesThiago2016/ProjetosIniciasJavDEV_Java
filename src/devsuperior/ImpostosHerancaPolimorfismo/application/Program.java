package devsuperior.ImpostosHerancaPolimorfismo.application;

import devsuperior.ImpostosHerancaPolimorfismo.entities.Company;
import devsuperior.ImpostosHerancaPolimorfismo.entities.Individual;
import devsuperior.ImpostosHerancaPolimorfismo.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n  =  sc.nextInt();

        for (int i = 1; i <= n ; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or Company (i/c)? ");
            char opt = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            Double anualIncome = sc.nextDouble();
            if ( opt == 'i'){
                System.out.print("Health expenditures: ");
                Double health = sc.nextDouble();
                list.add(new Individual(name,anualIncome,health));
            }else {
                System.out.print("Numbers of employees: ");
                Integer numEmp = sc.nextInt();
                list.add(new Company(name,anualIncome,numEmp));
            }
        }

        double sum = 0.0;
        System.out.println();
        System.out.println("TAXES PAID");
        for (TaxPayer taxP : list) {
            double tax = taxP.tax();
            System.out.println(taxP.getName() + ": $ " + String.format("%.2f",tax));
            sum += tax;
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f",sum));

        sc.close();
    }
}
