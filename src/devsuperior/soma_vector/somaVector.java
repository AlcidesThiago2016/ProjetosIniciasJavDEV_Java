package devsuperior.soma_vector;

import java.util.Locale;
import java.util.Scanner;

public class somaVector {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        double n = sc.nextDouble();
        double[] vect = new double[(int) n];
        double soma = 0.0;
        double media = 0.0;

        for(int i=0; i < vect.length; i++) {
            sc.nextLine();
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
            soma += vect[i];
        }

        System.out.print("VALORES: ");
        for(int i=0; i < vect.length; i++) {
            System.out.print(vect[i] + " , ");
        }
        System.out.println();
        media = soma / n;

        System.out.printf("SOMA: %.2f%n" , soma);
        System.out.printf("MEDIA: %.2f%n" , media);
    }
}
