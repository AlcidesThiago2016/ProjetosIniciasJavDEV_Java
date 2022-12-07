package devsuperior.Set;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

public class ProgramTreeSet {
    //TreeSet garante a ordem de inserção da lista.
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Set<String> set = new TreeSet<>();

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
    }
}
