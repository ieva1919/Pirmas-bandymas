import java.util.InputMismatchException;
import java.util.Scanner;

public class fourTask4 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    /*Parašyti programą, kuri padėtu Jonukui apsiskaičiuoti savo kūno masės indeksą. Jonukas
    turi įvesti savo masę ir ūgį, pagal gautus duomenis paskaičiuotų ir atvaizduotų jo kūno masės indeksą.
    KMI = masė (kg) / (ūgis(m))^2. Jonuko duomenų nuskaitymas ir skaičiavimas vykdomi skirtinguose metoduose.
    Papildykite programa, kad jei Jonukas įvestu ne skaičių programa pasakytu, kad blogai įvestas skaičius ir
    leistu pakartoti. Programa baigtu darbą tik tada kai abu skaičiai įvesti gerai ir kmi apskaičiuotas.*/


        System.out.println("Iveskite kuno mase (kg)");
        double mase = getCorrectNumber();
        System.out.println("Iveskite savo ugi (cm)");
        double ugis = getCorrectNumber();

        System.out.println(KMI(mase, ugis));


    }

    private static double KMI(double mase, double ugis) {
        return mase / Math.pow(ugis / 100, 2);

    }

    private static double getCorrectNumber() {
        double result = 0.0;
        while (true) {
            try {
                result = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Buvo ivestas blogas skaicius. Iveskite dar karta");
                scanner.nextLine();
            }
        }
        return result;
    }
}



