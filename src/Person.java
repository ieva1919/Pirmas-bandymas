import java.util.Objects;

public class Person {
    private String name;    //klases kintamieji
    private String surname;


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Person(String name, String surname) {    //konstruktorius
        this.name = name;
        this.surname = surname;
    }
    //this parodo, kad ti klases kintamasis


    @Override //reikalina, kad saugotu tik unikalius dokumentus
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, surname);
    }
}
