package devsuperior.retangulo;

import java.util.Scanner;

public class retangulo {
    public static void main(String[] args) {

        double base, altura, area, perimetro, diagonal;

        Scanner sc= new Scanner(System.in);

        System.out.print("Base do retangulo:");
        base = sc.nextDouble();
        System.out.print("Altura do retangulo:");
        altura = sc.nextDouble();

        area = base * altura;
        perimetro = 2 * (base + altura);
        diagonal = Math.sqrt(base * base + altura * altura);

        System.out.printf("Area = %.4f\n", area);
        System.out.printf("Perimetro = %.4f\n", perimetro);
        System.out.printf("Diagonal = %.4f\n", diagonal);

        sc.close();
    }
}
