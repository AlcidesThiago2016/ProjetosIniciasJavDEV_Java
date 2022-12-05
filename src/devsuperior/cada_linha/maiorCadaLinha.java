package devsuperior.cada_linha;

import java.util.Locale;
import java.util.Scanner;

public class maiorCadaLinha {

    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        int maior;

        System.out.print("Qual a ordem da matriz? ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];
        int [] maiorL = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "," + j + "]: ");
                mat[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            maior = mat[i][0];
            for (int j = 0; j < n; j++) {
                if (maior < mat[i][j]){
                    maior = mat[i][j];
                }
            }
            maiorL[i] = maior;
        }

        System.out.println("MAIOR ELEMENTO DE CADA LINHA: ");

        for (int i = 0; i < n; i++) {
            System.out.printf("%d\n", maiorL[i]);
        }

        sc.close();
    }
}
