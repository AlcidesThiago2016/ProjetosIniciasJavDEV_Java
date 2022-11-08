package devsuperior.matriz_geral;

import java.util.Locale;
import java.util.Scanner;

public class matrizGeral {

    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        int n;
        double sumPositive;

        System.out.print("Qual a ordem da matriz? ");
        n = sc.nextInt();

        double[][] mat = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "," + j + "] : ");
                mat[i][j] = sc.nextDouble();
            }
        }
        sumPositive = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] > 0) {
                    sumPositive += mat[i][j];
                }
            }
        }
        System.out.printf("SOMA POSITIVOS: %.2f\n", sumPositive);


        sc.close();
    }
}
