import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class firstList {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(); //gali tureti papildomus metodus

        List<Integer> numbers = new ArrayList<>();

        names.add("Ieva");
        names.add("Agne");
        names.add("Ugnius");
        names.add("Agne");
        names.add("Ugnius");

        names.add(2, "Jonas");  //iterpiama i sarasa norimas pasirinkimas, tik Array Liste

        for(String name : names) {
            System.out.println(name);
        }
        System.out.println(names.size());
        System.out.println(names.isEmpty());
        System.out.println(names.get(0));


        numbers.add(12);
        numbers.add(11);
        numbers.add(10);
        numbers.add(9);

        Collections.sort(numbers);   //surusiuoja nuo maziausio iki didziausio

        numbers.forEach(System.out :: println);     //kitoks atspauzdinimas
    }
}
