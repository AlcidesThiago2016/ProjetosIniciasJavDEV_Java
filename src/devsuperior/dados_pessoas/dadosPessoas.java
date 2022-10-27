package devsuperior.dados_pessoas;

import java.util.Locale;
import java.util.Scanner;

public class dadosPessoas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        int n, contF = 0, contM = 0;
        double shorterHeigths, greatestHeigths, sumHeigths = 0;

        System.out.print("Quantas pessoas serao digitadas? ");
        n = sc.nextInt();

        double[] heights = new double[n];
        char[] genres = new char[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.printf("Altura da %dªa pessoa : ", i + 1);
            heights[i] = sc.nextDouble();
            System.out.printf("Genero da %dªa pessoa : ", i + 1);
            genres[i] = sc.next().charAt(0);
            if (genres[i] == 'F'){
                sumHeigths += heights[i];
                contF++;
            }else {
                contM++;
            }
        }

        shorterHeigths = heights[0];
        greatestHeigths = heights[0];

        for (int i = 0; i < n; i++) {
            if (heights[i] < shorterHeigths) {
                shorterHeigths = heights[i];
            } else if (heights[i] > greatestHeigths) {
                greatestHeigths = heights[i];
            }
        }

        double averageHeigths = sumHeigths / contF;

        System.out.println();
        System.out.printf("Menor altura = %.2f\n", shorterHeigths);
        System.out.printf("Maior altura = %.2f\n", greatestHeigths);
        System.out.printf("Media das alturas das mulheres = %.2f\n", averageHeigths);
        System.out.print("Numero de homens = "+ contM);
    }
}
