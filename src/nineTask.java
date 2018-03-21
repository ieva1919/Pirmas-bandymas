import java.util.Scanner;

public class nineTask {
    public static void main(String[] args) {
        /*Parašyti programą funkcijos f(x) reikšmei surasti: jei x teigiamas, tai f(x)=2x+8,
        jei x neteigiamas, tai f(x)=21-7x*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite x reiksme:");
        int x = scanner.nextInt();

        System.out.println(f(x));

    }
    private static int f (int x) {
        if (x > 0) {
            return 2 * x + 8;
        } else {
            return 21 - 7 * x;
        }
    }


}
