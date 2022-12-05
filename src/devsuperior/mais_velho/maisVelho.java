package devsuperior.mais_velho;

import java.util.Locale;
import java.util.Scanner;

public class maisVelho {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        int n, agesLarger, posLarger;
        String[] names;
        int[] ages;


        System.out.print("Quantas pessoas voce vai digitar? ");
        n = sc.nextInt();

        names = new String[n];
        ages = new int[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.printf("Dados da %dª pessoa:\n", i + 1);
            System.out.print("Nome: ");
            names[i] = sc.nextLine();
            System.out.print("Idade: ");
            ages[i] = sc.nextInt();
        }

        agesLarger = ages[0];
        posLarger = 0;

        for (int i = 0; i < n; i++) {
            if (ages[i] > agesLarger){
                agesLarger = ages[i];
                posLarger = i;
            }
        }
        System.out.printf("PESSOA MAIS VELHA: %S\n", names[posLarger]);
    }
}
