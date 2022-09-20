package devsuperior.senha_fixa;

import java.util.Locale;
import java.util.Scanner;

public class senha_fixa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        int senha ;

        System.out.println("Digite a senha: ");
        senha = sc.nextInt();

        while ( senha != 2002 ){
            System.out.print("Senha Inválida! Tente Novamente: ");
            senha = sc.nextInt();
        }
        System.out.println("Acesso Permitido!");

        sc.close();
    }
}
