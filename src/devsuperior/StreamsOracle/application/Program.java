package devsuperior.StreamsOracle.application;

import devsuperior.StreamsOracle.entities.Pessoa;

import java.util.Arrays;
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
    }
}
