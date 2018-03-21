import java.util.Arrays;
import java.util.Scanner;

public class sestaTask {
    public static void main(String[] args) {
        /*Parašykite metodą kuris per parametrus paimtu du masyvus [1,2,3,4] ir [a,b,c,d]
        ir kaip rezultatą grąžintu [1,a,2,b,3,c,4,d] kaip rezultatą.*/

        Scanner scanner = new Scanner(System.in);

        char[] mas = {'1','2','3','4'};
        char[] mas1 = {'a','b','c','d'};

        char[] rezultatas = masyvuSujungimas(mas, mas1);
        System.out.println("Rezultatas " + Arrays.toString(rezultatas));


    }
    private static char[] masyvuSujungimas(char[] mas1, char[] mas2) {
        char[] sujungtas = new char[8];

        for(int i=0; i<sujungtas.length; i++ ) {
            if(i % 2 == 0) {
                sujungtas[i] = mas1[i / 2];
            } else {
                sujungtas[i] = mas2[i / 2];
            }
        }
        return sujungtas;

    }
}
