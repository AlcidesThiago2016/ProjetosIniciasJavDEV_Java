package devsuperior.Set;

import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

public class ProgramLinkedHashSet {
    //LinkedHashSet garante a ordem de inserção da lista.
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Set<String> set = new LinkedHashSet<>();

        //clausula add, adiciona o item no set.
        set.add("Tv");
        set.add("Notebook");
        set.add("Tablet");

        //clausula contains, verifica se existe o item no set.
        System.out.print("Item contem no set: ");
        System.out.println(set.contains("Notebook"));

        System.out.println("Lista de itens do set: ");
        for (String p : set) {
            System.out.println(p);
        }

        //clausula remove, remove o item no set.
        set.remove("Tablet");

        System.out.println("Lista de itens do set atualizada : ");
        for (String p : set) {
            System.out.println(p);
        }

        //clausula removeIf, remove o item no set de acordo com a regra especificada.
        //remove todos itens que tem 3 ou mais caracteres
        set.removeIf(x -> x.length() >= 3);

        System.out.println("Lista de itens do set atualizada : ");
        for (String p : set) {
            System.out.println(p);
        }
    }
}
