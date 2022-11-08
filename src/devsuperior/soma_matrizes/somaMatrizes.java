package devsuperior.soma_matrizes;

import java.util.Locale;
import java.util.Scanner;

public class somaMatrizes {

    public static void main(String[] args) {


        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a quantidade de linhas da matriz? ");
        int m = sc.nextInt();
        System.out.print("Qual a quantidade de colunas da matriz? ");
        int n = sc.nextInt();

        int [][] matOne = new int[m][n];
        int [][] matTwo = new int[m][n];
        int [][] matSum = new int[m][n];

        System.out.println("Digite os valor da Matriz A: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "," + j + "]: ");
                matOne[i][j] = sc.nextInt();
            }
        }

        System.out.println("Digite os valor da Matriz B: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "," + j + "]: ");
                matTwo[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matSum[i][j] = matOne[i][j] + matTwo[i][j];
            }
        }

        System.out.println("MATRIZ SOMA:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", matSum[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
