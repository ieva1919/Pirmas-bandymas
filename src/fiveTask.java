import java.util.Arrays;
import java.util.Scanner;

public class fiveTask {
    /*Parašyti programą kuri paprašytų vartotojo įvesti  5 žodžius.
    Po to kai bus įvesti visi žodžiai, jie turi būti atvaizduojami.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] mas = new String[5];


        for (int i = 0; i < 5; i++) {
            System.out.println("Iveskite 5 zodzius");

            mas[i] = scanner.nextLine();

        }

        System.out.println("Ivesti zodziai: " + Arrays.toString(mas)); //parodo masyve


    }
}


