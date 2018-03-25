import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetFirst {

    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();

        numbers.add(123);
        numbers.add(123);
        numbers.add(1);
        numbers.add(13);
        numbers.add(1);
        numbers.add(3);

        numbers.forEach(System.out :: println);

        Set<Person> persons = new LinkedHashSet<>();

        persons.add(new Person ("Ieva", "Sinkeviciute"));
        Person p = new Person("Ieva", "Sinkeviciute");
        persons.add(p);
        persons.add(new Person ("Ieva", "Sinkeviciute"));

        persons.forEach(pp-> {
            System.out.println("Vardas " + pp.getName() + " pavarde " + pp.getSurname());
        });
    }
}
// HashSet neturi aiskaus rykiavimo, pateikia kintamuosius atsitiktinai
//kaip sudejai taip ir grazins LinkedHashSet
//TreeSet isrykiuoja