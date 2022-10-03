package students.application;

import students.entities.Students;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        Students students = new Students();

        students.name = sc.nextLine();
        students.n1 = sc.nextDouble();
        students.n2 = sc.nextDouble();
        students.n3 = sc.nextDouble();
        System.out.println("NOTA FINAL = " + students.finalGrade());

        if (students.finalGrade() < 60.0){
            System.out.println("FAILED");
            System.out.println("FALTARAM " + students.missionPoints() + " PONTOS.");
        }
        System.out.println("PASS");
    }
}
