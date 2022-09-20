package devsuperior.media_idades;

import java.util.Locale;
import java.util.Scanner;

public class media_idades {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        int idade, nPessoas;
        double soma, media;

        System.out.println("Digite as idades: ");
        idade = sc.nextInt();

        if (idade < 0) {
            System.out.println("IMPOSSIVEL CALCULAR");
        } else {
            soma = 0;
            nPessoas = 0;
            while (idade >= 0) {
                soma = soma + idade;
                nPessoas++;
                idade = sc.nextInt();
            }

            media = soma / nPessoas;

            System.out.printf("MEDIA = %.2f\n", media);
        }
        sc.close();
    }
}
