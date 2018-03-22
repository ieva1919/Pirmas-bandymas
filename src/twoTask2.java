import java.util.Scanner;

public class twoTask2 {
    public static void main(String[] args) {
        /*Jonukas mokykloje gavo užduotį patikrinti ar duoti terminai yra polindromai. Jam sunku pačiam
        tai padaryti todėl jis prašo Jūsų pagalbos. Parašykite metodą kuris patikrintų ar duotas žodis yra
        polindromas (žodis ar sakinys kurį skaitant nuo galo gaunamas tas pats žodis ar sakinys,
        pvz. “KOL EINU ŠUNIE LOK”, “ARGI TEN NE TIGRA” , “SĖDĖK UŽU KĖDĖS”). Užuomina: pašalinti tarpus ir
         tuomet keliauti per pusę žodžio iš abiejų pusių tikrinant ar sutampa raidės.*/

        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        a = a.replaceAll(" ", "");
        if(isPolindromas(a)) {
            System.out.println("Polindromas");
        }else {
            System.out.println("Ne polindromas");
        }

    }
    private static boolean isPolindromas (String word) {
        boolean result = true;

        for (int i=0; i<word.length(); i++) {
            if(word.charAt(i) != word.charAt(word.length() - 1 -i)); {
                result = false;
                break;
            }
        }

        return result;
    }
    /*
    private static void splitString() {
        String testas = "reikaligas teksats";
        String[] items = testas.split(" ");
        for (String t : items) {
            System.out.println(t);
        }
    }
      */
}
