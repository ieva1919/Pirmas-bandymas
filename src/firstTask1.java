import java.util.Scanner;

public class firstTask1 {
    public static void main(String[] args) {
        /*Parašyti programą kuri paprašytų vartotojo įvesti žodį ir jį iš karto atvaizduotų,
        tada vėl paprašytų įvesti kitą žodį, jį atvaizduotų, ir procesą kartotų tol, kol nebus
        įvestas žodis „pabaiga“. Patikrinkite ar įvestas žodžio ilgis yra lyginis ar ne tam panaudokite %
        operatoriu. Jei žodis yra lyginis atspausdinkite “Įvestas žodis  {įvestas_žodis} yra lyginis” ir
        šalia kokio ilgio yra žodis. Jei nelyginis “Įvestas žodis {įvestas_žodis} nelyginis” šalia jo ilgį.
        Taip suskaičiuokite kiek tame žodyje yra “a” raidžių.
        */

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Iveskite zodi, jei noite baigti, iveskite zodi pabaiga");
            String word = scanner.nextLine();

            if(word.length() % 2 == 0 ) {
                System.out.print("Ivestas zodis " + word + " yra lyginis jo ilgis " + word.length());
            } else {
                System.out.println("Zodis " + word + "nelyginis, jo ilgis " + word.length());
            }
            char letter = 'a';
            System.out.println("Radome " + letter + "radziu" + countHowLettersHaveWord(word, letter));

            if(word.toLowerCase().equals("pabaiga")) { //sumazin, palyginta r tai pabaiga
                break;
            }
        }
    }
    private static int countHowLettersHaveWord (String word, char letter) {
        int count = 0;

        for(int i=0; i < word.length(); i ++) {
            if (word.charAt(i) == letter) {
                count++;
            }
        }

        return count;
    }

}
