package devsuperior.media_pares;

import java.util.Locale;
import java.util.Scanner;

public class mediaPares {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        int n, sumPairs = 0, nPairs = 0;
        double average;
        String msg = null;

        System.out.print("Quantos elementos vai ter o vetor? ");
        n = sc.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.print("Digite um numero: ");
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (numbers[i] % 2 == 0){
                sumPairs += numbers[i];
                nPairs++;
            }
        }
        
        if (nPairs == 0){
            System.out.println("NENHUM NUMERO PAR");
        }else {
            average = (double)sumPairs / nPairs;
            System.out.printf("MEDIA DOS PARES = %.1f\n",average);
        }
        
        sc.close();
    }
}
