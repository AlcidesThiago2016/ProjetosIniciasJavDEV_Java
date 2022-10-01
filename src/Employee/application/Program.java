package Employee.application;

import Employee.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        Employee  employee = new Employee();
        System.out.print("Nome: ");
        employee.name = sc.nextLine();
        System.out.print("Salario Bruto : ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Imposto : ");
        employee.tax = sc.nextDouble();

        System.out.println("Funcionario: " + employee);

        System.out.print("Qual a porcentagem para aumentar o salario: ");
        double porcentage = sc.nextDouble();
        employee .increaseSalary(porcentage);

        System.out.println();
        System.out.println("Dados Atualizados " + employee);
        sc.close();
    }
}
