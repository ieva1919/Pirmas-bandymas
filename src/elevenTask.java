import java.util.Scanner;

public class elevenTask {
    public static void main(String[] args) {
        /*Parašyti metodą kuris patikrina ar per parametrus paduotame žodyje yra raidžių
         derinių “ab”. Prieš atliekant veiksmus patikrinti ar paduotas žodis yra tinkamas,
          jei ne, grąžinti 0. Užuomina: radus “a” raidę, tikrinti ar tai nėra paskutinė žodžio
          raidė, ir jeigu ne, tuomet tikrinti ar sekanti raidė (i + 1) yra “b”*/

        Scanner scanner = new Scanner(System.in);

        String mas = "namas";

        System.out.println(kiek_raidziu(mas));

    }
    public static boolean kiek_raidziu (String zodis) {

        for(int i=0; i<zodis.length()-1; i++) {
            if(zodis.charAt(i) == 'a' && zodis.charAt(i+1) == 'b'){
                return true;
            }
        }

        return false;
    }
}
