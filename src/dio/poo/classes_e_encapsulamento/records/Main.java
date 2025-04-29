package dio.poo.classes_e_encapsulamento.records;

public class Main {
    public static void main(String[] args) {
        var person = new Person("Victor", 20);
        System.out.println(person);
        System.out.println(person.name());
        System.out.println(person.age());

    }
}
