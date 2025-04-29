package dio.poo.classes_e_encapsulamento.criandoclasse;

public class Main {
    public static void main(String[] args) {
        var male = new Person();
        male.setName("Victor");
        male.setAge(20);

        var female = new Person();
        female.setName("Andressa");
        female.setAge(23);

        System.out.println("Male name: " + male.getName() + "\nMale Age: " + male.getAge());
        System.out.println("Female age: " + female.getName() + "\nFemale Age " + female.getAge());
    }
}
