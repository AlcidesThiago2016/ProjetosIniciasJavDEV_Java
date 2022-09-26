package devsuperior.funcoesStrings;

import java.util.Locale;

public class Funcoes_Strings {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);

        String original = "abcde FGHIJ ABC abc DEFG    ";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2,9);
        String s06 = original.replace('a', 'x');

        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring(2,9): -" + s05 + "-");
        System.out.println("replaxe(a,x): -" + s06 + "-");
    }
}
