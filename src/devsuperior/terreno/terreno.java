package devsuperior.terreno;

import java.util.Scanner;

public class terreno {
    public static void main(String[] args) {


        double largura, comprimento, metro, preco;
        Scanner sc= new Scanner(System.in);

        System.out.printf("Digite a largura do terreno:");
        largura = sc.nextDouble();
        System.out.printf("Digite o comprimento do terreno:");
        comprimento = sc.nextDouble();
        System.out.printf("Digite o valor do metro quadrado:");
        preco = sc.nextDouble();

        metro = largura * comprimento;
        preco = metro * preco;

        System.out.println("Area do terreno = " + metro);
        System.out.println("Preco do terreno = " + preco);


    }
}
