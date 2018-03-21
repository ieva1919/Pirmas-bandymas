import java.util.Scanner;

public class SecondTask {

    private static final  int MAX_NUMB = 100;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite, kiek norite skaiciu");

        int kiek = sc.nextInt(); //laukia kol bus ivesta

        int[] mas = new int[kiek];  //gauta rezultata priskiria

        for (int i=0; i < kiek; i++) {
            System.out.println("Iveskite " + i + "skaiciu");
            mas[i] = sc.nextInt();      //masyvo ivedimas
        }

        printMas(mas); //iskviaciamas metodas
    }

    //metodo kurymas
    private static void printMas(int[] skMas) {
        for (Integer sk : skMas) {      //naujas for budas
            if(sk >= MAX_NUMB) {        //konstanta
                System.out.println(sk);
            }
        }
    }


}
