import java.util.ArrayList;

public class FirstTaskList {
    public static void main(String[] args) {
        /*Sukurti naują ArrayList kolekciją, pridėti 5 vartotojų vardus ir juos atspausdinti,
        jei vardo ilgis ilgesnis nei 6 simboliai. Rezultatus spausdinti ekrane naudojant for ciklą.
        Naudojant sukurtą kolekciją parašyti du metodus. Pirmas grąžina pirmą list`o elementą, o
        antras metodas paskutinį. Rezultatus spausdinti ekrane.*/

        ArrayList<String> names = new ArrayList<>();

        names.add("Ieva");
        names.add("Povilas");
        names.add("Rimvydas");
        names.add("Vaiva");


        for (String name : names) {
            if(name.length() > 6) {
                System.out.println(name);
            }
        }
        System.out.println("Pirmas kolekcijos elementas: " + pirmasElementas(names));
        System.out.println("Paskutinis kolekcijos elementas: " + paskutinisElementas(names));
    }
    private static String pirmasElementas (ArrayList<String>  names) {
        return names.get(0);
    }
    private static String paskutinisElementas (ArrayList<String>  names) {
        return names.get(names.size()-1);
    }
}
