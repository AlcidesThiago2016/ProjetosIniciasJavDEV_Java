package devsuperior.abaixo_da_media;

import java.util.Locale;
import java.util.Scanner;

public class abaixoDaMedia {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        double n, averageVector, sumVector = 0;

        System.out.print("Quantos elementos vai ter o vetor? ");
        n = sc.nextDouble();
        double[] numbers = new double[(int) n];

        for (int i = 0; i < n; i++){
            sc.nextLine();
            System.out.print("Digite um numero: ");
            numbers[i] = sc.nextDouble();
            sumVector += numbers[i];
        }

        averageVector = sumVector / n;

        System.out.print("\nMEDIA DO VETOR = "+ averageVector);
        System.out.println("\nELEMENTOS ABAIXO DA MEDIA: ");

        for (int i = 0; i < n; i++){
            if (numbers[i] < averageVector){
                System.out.printf("%.1f\n", numbers[i]);
            }
        }
        sc.close();
    }

}
