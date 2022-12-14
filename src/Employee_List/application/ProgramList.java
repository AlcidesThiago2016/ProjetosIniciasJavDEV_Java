package Employee_List.application;

import Employee_List.entities.EmployeeList;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramList {

    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        int n;

        List<EmployeeList> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Emplyoee #" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            EmployeeList emp = new EmployeeList(id, name,salary);

            list.add(emp);
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int idPerson = sc.nextInt();
        Integer pos = positionId(list,idPerson);
        if (pos == null){
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            list.get(pos).increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for (EmployeeList emp : list) {
            System.out.println(emp);
        }
        sc.close();
    }

    public static Integer positionId(List<EmployeeList> list,int id){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }
}
