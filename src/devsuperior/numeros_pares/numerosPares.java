package devsuperior.numeros_pares;

import java.util.Locale;
import java.util.Scanner;

public class numerosPares {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        int n, nPairs = 0;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.print("Digite um numeor: ");
            numbers[i] = sc.nextInt();

            if (numbers[i] % 2 == 0) {
                nPairs++;
            }
        }
        System.out.println();
        System.out.println("Numeros Pares: ");
        for (int i = 0; i < n; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print("  " + numbers[i]);
            }
        }

        System.out.println();
        System.out.println();
        System.out.print("Quantidade de Pares = "+ nPairs);
        sc.close();
    }
}
