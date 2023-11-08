import java.util.Objects;

public class Person {
    int idnp;
    String name;
    int varsta;

    public Person(String name, int varsta) {
        this.name = name;
        this.varsta = varsta;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    @Override
    public boolean equals(Object o) {
        Person person = (Person) o;
        return this.varsta == person.varsta && this.name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(varsta, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}
