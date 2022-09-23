package devsuperior.sequencia_impares.sequencia;

import java.util.Locale;
import java.util.Scanner;

public class impares {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        int x;

        System.out.print("Digite o valor de X: ");
        x = sc.nextInt();

        for (int i = 1; i <= x; i++){
            if ( i % 2 != 0){
                System.out.println(i);
            }
        }

        sc.close();
    }
}
