import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ion", 20);
        Person person2 = new Person("Ion", 20);
        Person person3 = new Person("Ion", 22);
        Person person4 = new Person("Ion", 23);
        Person person5 = new Person("Vasile", 22);
        System.out.println("Persoanele sunt identice? " + person.equals(person2));
        Set<Person> people = new HashSet<>();
        people.add(person);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        System.out.println(people);

        String s = "A"; //Thread Pool
        String y = "A";
        System.out.println(s==y);
    }
}