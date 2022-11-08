package devsuperior.acima_diagonal;

import java.util.Locale;
import java.util.Scanner;

public class acimaDiagonal {

    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        int sum;

        System.out.print("Qual a ordem da matriz? ");
        int n = sc.nextInt();
        int [][] matDown = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "," + j + "] : ");
                matDown[i][j] = sc.nextInt();
            }
        }

        sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ( i < j){
                    sum += matDown[i][j];
                }
            }
        }

        System.out.printf("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL= %d\n", sum);
        sc.close();
    }
}
