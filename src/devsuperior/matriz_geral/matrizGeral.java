package devsuperior.matriz_geral;

import java.util.Locale;
import java.util.Scanner;

public class matrizGeral {

    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        int n, linha, coluna;
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
        System.out.println();

        System.out.print("Escolha uma linha: ");
        linha = sc.nextInt();

        System.out.print("LINHA ESCOLHIDA: ");

        for (int i = 0; i < n; i++) {
            System.out.printf("%.1f ", mat[linha][i]);
        }

        System.out.printf("\n\nEscolha uma coluna: ");
        coluna = sc.nextInt();

        System.out.print("COLUNA ESCOLHIDA: ");

        for (int i = 0; i < n; i++) {
            System.out.printf("%.1f ", mat[i][coluna]);
        }

        System.out.printf("\n\nDIAGONAL PRINCIPAL: ");

        for (int i = 0; i < n; i++) {
            System.out.printf("%.1f ", mat[i][i]);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] < 0){
                    mat[i][j] = Math.pow(mat[i][j], 2);
                }
            }
        }

        System.out.println("\n\nMATRIZ ALTERADA: ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%.1f ", mat[i][j]);
            }
            System.out.println();
        }



        sc.close();
    }
}
