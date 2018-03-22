import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirdTask3 {

    private static  Scanner scanner = new Scanner(System.in); //nuskaito is consoles


    public static void main(String[] args) {
        /*Parašykite programą kuri padėtu moksleiviui atlikti matematikos darbus.
        Jam reikia apskaičiuoti figūrų plotus. Visi plotai skaičiuojami atskiruose metoduose.
         Moksleivis įveda rodmenys naudodamas konsolę (Scanner sc = new Scanner(System.in)).
         Moksleivis gali pasirinkti kokios figūros plotą skaičiuos. Po to sistema paprašo įvesti matmenys r
         eikalingus tos figūros ploto skaičiavimui.
a.   	Apskaičiuotu stačiojo trikampio plotą. Formulė rezultatas = (a*b)/2;
b.  	Stačiakampio plotas, formulė rezultatas =a*b.
c.   	Kvadrato plotas, rezultatas = a^2
d.  	Apskritimo plotas, Formulė rezultatas = pi*(a^2). Pi = 3.1415*/


        meniu();
        String selection = scanner.nextLine();

        switch (selection) {
            case "a":
                //staciojo trikampio plotas
                staciojoTrikampioPlotas();
                break;
            case "b":
                //staciakampio plota
                staciakampioPlotas();
                break;
            case "c":
                //kvadrato plotas
                kvadratoPloa();
                break;
            case "d":
                //apskritimo plotas
                apskritimoPlotas();
                break;
                default:
                    System.out.println("Nieko cia nera");
                    break;

        }

    }
    private static void meniu() {
        System.out.println("Pasirinkite ka norite daryti:\na. staciojo trikampio plotas \nb staciakampio plota\nc kvadrato plotas\nd apskritimo plotas");

    }
    private static void staciojoTrikampioPlotas () {
        System.out.println("Iveskite statini a: ");
        double a = getCorrectNumber();
        System.out.println("Iveskite statini b: ");
        double b = getCorrectNumber();
        double p = (a*b) / 2;
        System.out.println("Staciojo trikampio plotas: " + p);
    }
    private static void staciakampioPlotas() {
        System.out.println("Iveskite krastine ilgi a");
        double a = getCorrectNumber();
        System.out.println("Iveskite krastine ilgi b");
        double b = getCorrectNumber();
        double p = a *b;
    }
    private static void kvadratoPloa() {
        System.out.println("Iveskite kvadrato krastine a");
        double a = getCorrectNumber();
        double p = a * a;
    }
    private static void apskritimoPlotas() {
        System.out.println("Iveskite apskritimo ilgi a");
        double a = getCorrectNumber();
        double Pi = 3.1415;
        double p = Pi * (a * a);
    }

    private static double getCorrectNumber() {
        double result = 0.0;
        while(true){
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
