public class Main {

    public static void main(String[] args) {
        Person person = new Person("Pedro", 67);   

        System.out.println(person);
        System.out.println(person.name());

        Person newPerson = new Person("Maria", 34);
        System.out.println(newPerson);
        System.out.println(newPerson.name());
    }
}
