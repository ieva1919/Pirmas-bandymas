import java.util.Scanner;

public class tenTask {
    public static void main(String[] args) {
        /*Parašyti metodą kuris suskaičiuoja kiek per parametrus paduotame žodyje yra raidžių “a”.
        Prieš atliekant veiksmus patikrinti ar paduotas žodis yra tinkamas, jei ne, grąžinti 0.*?
         */

        String mas = "Bananas";
        int kiekis = kiek_a(mas);

        System.out.println("Zodyje yra tiek a raidziu: " + kiekis);

    }

    private static int kiek_a(String zodis) {
        if(zodis == null ) {
            return 0;
        }
        int kiekis = 0;

        for (int i = 0; i < zodis.length(); i++) {
            if (zodis.charAt(i) == 'a') {
                kiekis++;
            }
        }
        return kiekis;


    }
}
