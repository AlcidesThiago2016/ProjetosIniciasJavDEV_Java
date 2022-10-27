package devsuperior.vetor;

import java.util.Locale;
import java.util.Scanner;

public class forEach {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Informe quantos nomes ira digitar: ");
        n = sc.nextInt();

        String[] names = new String[n];

        for (int i = 0; i < names.length; i++) {
            sc.nextLine();
            System.out.printf("Digite o %d nome: ", i + 1);
            names[i] = sc.nextLine();

        }
        for ( String search : names) {
            System.out.println(search);
        }
    }
}
