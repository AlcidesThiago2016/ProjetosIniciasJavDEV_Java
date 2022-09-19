package devsuperior.aulafor;

import java.util.Scanner;

public class aulaFor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe Quantidade de Numero:");
        int N = sc.nextInt();

        int soma = 0;
        System.out.println("Informe os " + N + " Numeros abaixo:" );
        for (int i = 0; i < N; i++){
            int x = sc.nextInt();
            soma += x;
        }
        System.out.println("A soma dos numeros informados é : " + soma);

        sc.close();
    }
}
