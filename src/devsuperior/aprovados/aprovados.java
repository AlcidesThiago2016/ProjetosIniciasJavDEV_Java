package devsuperior.aprovados;

import java.util.Locale;
import java.util.Scanner;

public class aprovados {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);


        int n;
        double averages;
        String[] names;
        double[] grade1, grade2;

        System.out.print("Quantas alunos serai digitados? ");
        n = sc.nextInt();

        names = new String[n];
        grade1 = new double[n];
        grade2 = new double[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.printf("Digite nome, primeira e segunda nota do %dª aluno:\n", i + 1);
            names[i] = sc.nextLine();
            grade1[i] = sc.nextDouble();
            grade2[i] = sc.nextDouble();
        }

        System.out.println("Alunos Aprovados: ");
        for (int i = 0; i < n; i++) {
            averages = (grade1[i] + grade2[i]) / 2;

            if (averages >= 6.0){
                System.out.printf("%s\n", names[i]);
            }
        }
        sc.close();
    }
}
