import java.util.InputMismatchException;
import java.util.Scanner;

public class TestoUzduotis {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Iveskite pirmąjį skaičių");
        int sk1 = getCorrectNumber();

        System.out.println("Iveskite antrąjį skaičių");
        int sk2 = getCorrectNumber();

        scanner.nextLine();
        System.out.println("Pasirinkite aritmetinį ženklą(-,+), kad būtų atliktas norimąs matematinis veiksmas:");
        char aritmetinisZenklas = scanner.nextLine().charAt(0);

        if(aritmetinisZenklas == '+') {
            System.out.println("Jūsų rezulatats: " + sudetis(sk1, sk2));
        } else {
            System.out.println("Jūsų rezulatats: " + skirtumas(sk1, sk2));
        }

    }

    private static int getCorrectNumber() {
        int result = 0;
        while (true) {
            try {
                result = scanner.nextInt();
                if(result == 0) {
                    System.out.println("Antras ivestas skaičius yra 0. Blogai įvestas skaičius. Įveskite dar kartą.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Buvo ivestas blogas skaičius. Iveskite dar kartą");
                scanner.nextLine();
            }
        }
        return result;
    }

    public static int sudetis (int sk1, int sk2) {
        int sudetis = sk1 + sk2;
        return sudetis;
    }

    public static int skirtumas (int sk1, int sk2) {
        int skirtumas = sk1 - sk2;
        return skirtumas;
    }



}
