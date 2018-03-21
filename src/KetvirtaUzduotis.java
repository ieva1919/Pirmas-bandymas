import java.util.Arrays;
import java.util.Scanner;

public class KetvirtaUzduotis {
    public static void main(String[] args) {
       /*Parašyti programą, kuri paprašytų įvesti 5 skaičius. Baigus skaičių
        įvedimą, turi būti atvaizduojama įvestų skaičių suma ir visi įvesti skaičiai.*/

        Scanner scanner = new Scanner(System.in);

        int[] mas = new int[5];

        for (int i = 0; i < mas.length; i++) {
            System.out.println("Iveskite skaiciu");
            mas[i] = scanner.nextInt();
        }


        System.out.println("Skaiciu suma " + sumMas(mas));
        System.out.println("Ivesti skaiciai: " + Arrays.toString(mas));

    }

    private static int sumMas(int[] mas) {
        int sum = 0;
        for (Integer m : mas) {
            sum += m;
        }
        return sum;
    }


}
