package devsuperior.composition.application;

import devsuperior.composition.entities.Department;
import devsuperior.composition.entities.HourContract;
import devsuperior.composition.entities.Worker;
import devsuperior.composition.enum1.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class application {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter departament's name: ");
        String departamentName = sc.nextLine();
        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel),baseSalary, new Department(departamentName));

        System.out.print("How many contracts t his worker?");
        int n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            System.out.println("Enter contract #" + i + " data:");
            System.out.print("Data (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextByte();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }
        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " +  String.format("%.2f",worker.income(year, month)));



        sc.close();

    }
}
