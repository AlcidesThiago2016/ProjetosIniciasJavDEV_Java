package devsuperior.lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class listaExemplo01 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2,"Marco");

        System.out.println("Quantidade de elementos na lista: "+ list.size());
        System.out.println("---Lista Inicial---");
        for ( String x : list) {
            System.out.println(x);
        }
        System.out.println("---LISTA COM NOMES COM A LETRA M REMOVIDOS---");
        list.removeIf(x -> x.charAt(0) == 'M');
        for ( String x : list) {
            System.out.println(x);
        }
        System.out.println("---LISTA COM INDICE DOS NOMES---");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));
        System.out.println("---LISTA FILTRANDO SOMENTE NOMES COM A LETRA A---");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').toList();
        for ( String x : result) {
            System.out.println(x);
        }
        System.out.println("---LISTA COM NOME INICIADO PELA LETRA INDICADA---");
        String nome = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(nome);
    }
}
