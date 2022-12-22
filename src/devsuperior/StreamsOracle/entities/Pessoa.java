package devsuperior.StreamsOracle.entities;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    String id;
    String name;
    String nationality;
    Integer age;

    public Pessoa() {
    }

    public Pessoa(String id, String name, String nationality, Integer age) {
        this.id = id;
        this.name = name;
        this.nationality = nationality;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Pessoa> populacePerson(){
        Pessoa pessoa1 = new Pessoa("p1","Matheus Henrique","Brasil", 18);
        Pessoa pessoa2 = new Pessoa("p2","Hernandez Roja","Mexico", 21);
        Pessoa pessoa3 = new Pessoa("p3","Mario Fernandes","Canada", 22);
        Pessoa pessoa4 = new Pessoa("p4","Neymar Junior","Brasil", 22);
        List<Pessoa> list = new ArrayList<>();
        list.add(pessoa1);
        list.add(pessoa2);
        list.add(pessoa3);
        list.add(pessoa4);
        return list;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "name='" + name + '\'' +
                '}';
    }
}
