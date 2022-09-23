package devsuperior.dentro_fora;

import java.util.Locale;
import java.util.Scanner;

public class dentro_fora {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        int n, valor, dentro = 0, fora = 0;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.print("Digite um número: ");
            valor = sc.nextInt();

            if ( valor >= 10 && valor <= 20){
                dentro = dentro + 1;
            } else {
                fora = fora + 1;
            }
        }

        System.out.println(dentro + " DENTRO");
        System.out.println(fora + " FORA");

        sc.close();
    }
}
