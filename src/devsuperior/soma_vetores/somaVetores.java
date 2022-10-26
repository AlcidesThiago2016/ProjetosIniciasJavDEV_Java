package devsuperior.soma_vetores;

import java.util.Locale;
import java.util.Scanner;

public class somaVetores {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Quantos valores vai ter cada vetor? ");
        n = sc.nextInt();

        int[] num1 = new int[n];

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < n; i++){
            sc.nextLine();
            num1[i] = sc.nextInt();
        }

        int[] num2 = new int[n];

        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < n; i++){
            sc.nextLine();
            num2[i] = sc.nextInt();
        }

        int[] soma = new int[n];

        for (int i = 0; i < n; i++) {
            soma[i] = num1[i] + num2[i];
        }

        System.out.println("VETOR RESULTANTE: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\n",soma[i]);
        }
    }
}
