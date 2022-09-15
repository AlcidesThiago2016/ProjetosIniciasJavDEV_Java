import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Variaveis
        int y = 32;
        double x = 10.35784;
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;

        String product1 = "Computer";
        String product2 = "Office Desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        Scanner sc= new Scanner(System.in);
        String i;

        //Código
        System.out.print("Hello world!, ");
        System.out.println("Bom dia!");

        System.out.println(y);
        System.out.printf("%.2f%n",x);
        System.out.printf("%.4f%n",x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n",x);
        System.out.println("RESULTADO = " + x + " METROS");
        System.out.printf("RESULTADO = %.2f metros%n", x);
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
        System.out.println();
        System.out.println();
        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f\n", product1, price1);
        System.out.printf("%s, which price is $ %.2f\n", product2, price2);
        System.out.println();
        System.out.printf("Record: %d years old, code %d and is gender: %s\n", age, code, gender);
        System.out.println();
        System.out.printf("Measue with eight decimal places: %.8f\n",measure);
        System.out.printf("Rouded (three decimal places): %.3f\n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f\n", measure);

        System.out.print("Informe uma String: ");
        i = sc.next();
        System.out.println(i);
        sc.close();

        //Funções Matematicas

        System.out.println();

        double j = 3.0;
        double k = 4.0;
        double l = -5.0;
        double B, N, M;

        B = Math.sqrt(j);
        N = Math.sqrt(k);
        M = Math.sqrt(25.0);

        System.out.println("Raiz quadrada de " + j + " = " + B);
        System.out.println("Raiz quadrada de " + k + " = " + N);
        System.out.println("Raiz quadrada DE = " + M);

        B = Math.pow(j, k);
        N = Math.pow(j, 2.0);
        M = Math.pow(5.0, 2.0);
        System.out.println(j + " elevado a " + k + " = " + B);
        System.out.println(j + " elevado ao quadrado = " + N);
        System.out.println("5 elevado ao quadrado = " + M);

        B = Math.abs(k);
        N = Math.abs(l);

        System.out.println("VAlor absoluto de " + k + " = " + B);
        System.out.println("VAlor absoluto de " + l + " = " + N);



    }
}