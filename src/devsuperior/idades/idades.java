package devsuperior.idades;

import java.util.Scanner;

public class idades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome1, nome2;
        int idade1, idade2;
        double media;

        System.out.println("Dados da primeira pessoa:");
        System.out.print("Nome:");
        nome1 = sc.next();
        System.out.print("Idade:");
        idade1 = sc.nextInt();

        System.out.println("Dados da Segunda pessoa:");
        System.out.print("Nome:");
        nome2 = sc.next();
        System.out.print("Idade:");
        idade2 = sc.nextInt();
        media = (idade1 + idade2) / 2.0;

        System.out.printf("A idade média de %s e %s é de %.1f anos", nome1, nome2, media);

    }
}
