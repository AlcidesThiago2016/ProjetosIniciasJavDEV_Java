package devsuperior.vetor;

import java.util.Locale;
import java.util.Scanner;

public class Vetores {

    public static void main(String[] args) {


        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vector = new double[n];
        double sum = 0.0;

        for( int i = 0; i < n; i++){
           vector[i] = sc.nextDouble();
           sum += vector[i];
        }

        double avg = sum / n;

        System.out.printf("AVERAGE HEIGTH: %.2f%n", avg);

        sc.close();
    }
}
