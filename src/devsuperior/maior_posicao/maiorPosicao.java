package devsuperior.maior_posicao;

import java.util.Locale;
import java.util.Scanner;

public class maiorPosicao {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        double n, highestValue;
        int posLarger;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextDouble();
        double[] numbers = new double[(int) n];

        highestValue = 0;
        posLarger = 0;
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.print("Digite um numero: ");
            numbers[i] = sc.nextDouble();

            if (numbers[i]> highestValue){
                highestValue = (int) numbers[i];
                posLarger = i;
            }
        }

        System.out.println();
        System.out.printf("MAIOR VALOR = %.2f\n", highestValue);
        System.out.print("POSICAO DO MAIOR VALOR =  "+ posLarger);
        sc.close();
    }
}
