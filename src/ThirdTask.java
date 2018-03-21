import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {

       /* Parašyti programą, kuri paprašytų vesti skaičius tol, kol bus įvestas skaičius 0. Pabaigoje turi
        būti atvaizduojama
        įvestų skaičių suma.Skaičiavimas turi būti atliekamas kitame metode.
        Papildykite programą kuri neleistu įvesti ne skaičius, jei vartotojas įveda ne
        skaičių programa prašo pakartoti tol kol bus įvestas skaičius.
        */
        Scanner scanner = new Scanner(System.in);



        int sk = 0;
        int kiek = 0; //reikia indekso i kuri masyva deti
        int[] mas = {};

        do {

            System.out.println("Veskite tol, kol bus ivestas nulis");

            try {
                sk = scanner.nextInt();
            } catch(InputMismatchException e) {
                System.out.println("Blogai ivestas skaicius, programa baigia darba");
                scanner.nextLine();
            }



            if (mas.length <= kiek) {
                mas = Arrays.copyOf(mas,mas.length +1); //perkopijuoja ir praplecia masyva
            }

            mas[kiek++] = sk;

        } while (sk !=0);

        System.out.println("Suma yra: " + masSum(mas));

    }
    private static int masSum(int[] mas) {
        int sum = 0;
        for (Integer m : mas) {
            sum+= m; //sum = sum + m
        }

        return sum;
    }
}
