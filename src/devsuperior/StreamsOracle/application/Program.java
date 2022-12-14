package devsuperior.StreamsOracle.application;

import devsuperior.StreamsOracle.entities.Pessoa;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        //Implementando um Stream com operações intermediárias utilizando o metodo filter, buscando todas as pessoas
        //que nasceram no Brasil
        List<Pessoa> pessoas = new Pessoa().populacePerson();
        Stream<Pessoa> stream = pessoas.stream().filter(pessoa -> pessoa.getNationality().equals("Brasil"));
        System.out.println("Nomes pessoas nascidas no Brasil: ");
        System.out.println(Arrays.toString(stream.toArray()));

        //Implementando um Stream com operações intermediárias utilizando o metodo map, realizado um mapeamento com
        //o intuito de obter apenas a idade das pessoas presentes no fluxo de dados.
        Stream<Integer> stream1 = pessoas.stream()
                .filter(pessoa -> pessoa.getNationality().equals("Brasil"))
                .map(Pessoa::getAge);
        System.out.println("Idades pessoas nascidas no Brasil: ");
        System.out.println(Arrays.toString(stream1.toArray()));

        //Implementando um Stream com operações intermediárias utilizando o metodo sorted, ordenando pelo nome da pessoa.
        Stream<Pessoa> stream2 = pessoas.stream()
                .filter(pessoa -> pessoa.getNationality().equals("Brasil"))
                .sorted(Comparator.comparing(Pessoa::getName));
        System.out.println("Pessoas nascidas no Brasil ordenadas pelo nome: ");
        System.out.println(Arrays.toString(stream2.toArray()));

        //Implementando um Stream com operações intermediárias utilizando o metodo distinct.
        Stream<Pessoa> stream3 = pessoas.stream().distinct();
        System.out.println("Exibe elementos que não se repetem na lista: ");
        System.out.println(Arrays.toString(stream3.toArray()));

        //Implementando um Stream com operações intermediárias utilizando o metodo limit.
        Stream<Pessoa> stream4 = pessoas.stream().limit(2);
        System.out.println("Exibe somente 2 pessooas da lista: ");
        System.out.println(Arrays.toString(stream4.toArray()));

        //Implementando um Stream com operações intermediárias utilizando o metodo ForEach.
        System.out.println("Exibe os elementos da lista com ForEach ");
        pessoas.forEach(pessoa -> System.out.println(pessoa.getName()));

        //Implementando um Stream com operações intermediárias utilizando o metodo average.
        double media;
        media = pessoas.stream()
                .filter(pessoa -> pessoa.getNationality().equals("Brasil"))
               .mapToInt(Pessoa::getAge)
                .average()
                .getAsDouble();
        System.out.println("A média das idades dos nascidos no Brasil é: " + media);

        //Implementando um Stream com operações intermediárias utilizando o metodo AllMatch.
        boolean todosMexicanos = pessoas.stream().allMatch(pessoa -> pessoa.getNationality().equals("Mexico"));
        if (todosMexicanos){
            System.out.println("Todas as pessoas tem nacionalidade mexicana");
        }else {
            System.out.println("Existe pessoas de outras nacionalidades alem do Mexico");
        }
    }
}
