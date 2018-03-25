import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class twelfthTask {
    public static void main(String[] args) throws IOException {
        /*Namo administratorius prašo Jūsų pagalbos, Laiptinėje yra n būstų. Pateikiamas kiekvieno būsto
         gyventojų skaičius. Būstas moka už bendrą laiptinės apšvietimą pagal gyventojų skaičių. Sudarykite
         sąrašą, kiek mokės kiekvienas būstas, jei iš viso už apšvietimą visai laiptinei reikia surinkti 1500 Eurų.
          Kuris būstas mokės brangiausiai? Paskaičiuokite kiek mokėtų kiekvienas butas jei apšvietimas būtų skaičiuojamas pagal
          buto plotą. Palyginkite kuriam butui labiau apsimokėtu mokėti už plotą o kuriam už gyventojų skaičių.
          Būtų skaičius ir gyventojų bute pateikta žemiau lentelėje, perkelkite lentelę į tekstinį failą.*/

        BufferedReader in = new BufferedReader(new FileReader("./src/10uzduotis.txt"));
        String line;
        List<Butas> butai = new ArrayList<>();

        while ((line = in.readLine()) != null) {
            System.out.println(line);
            Butas butas = new Butas();
            butai.add(butas);
            String[] skaiciai = line.split(" "); //isskaidome eilute per tarpa
            butas.butoNr = Integer.parseInt(skaiciai[0]);
            butas.plotas = Integer.parseInt(skaiciai[1]);
            butas.gyventojuSkaicius = Integer.parseInt(skaiciai[2]);
        }
        in.close();
        int gyventojuSkaicius = 0;
        int plotas = 0;

        for (Butas butas : butai) {
            gyventojuSkaicius += butas.gyventojuSkaicius;
            plotas += butas.plotas;
        }
        System.out.println("Jusu rezultatas: " + gyventojuSkaicius + " " + plotas);
        int bendraSuma = 1500;

        for (Butas butas : butai) {
            butas.mokestisPagalGyventojuSkaiciu = 1500 / gyventojuSkaicius * butas.gyventojuSkaicius;
            butas.mokestisPagalPlota = 1500 / plotas * butas.plotas;

            System.out.println("Bute, kurio numeris yra " + butas.butoNr + " mokestis pagal gyventoju skaiciu: " + butas.mokestisPagalGyventojuSkaiciu + ", o mokestis pagal plota: " + butas.mokestisPagalPlota);

            if(butas.mokestisPagalGyventojuSkaiciu > butas.mokestisPagalPlota) {
                System.out.println("Butui, kurio Buto Nr." + butas.butoNr + " labiau aspimoka mokesti uz apsvietima moketi pagal plota " + butas.mokestisPagalPlota);
            } else {
                System.out.println("Butui, kurio Buto Nr." + butas.butoNr + " labiau aspimoka mokesti uz apsvietim moketi pagal gyventoju skaiciu " + butas.mokestisPagalGyventojuSkaiciu);
            }


        }
    }

}

class Butas {
    int butoNr;
    int plotas;
    int gyventojuSkaicius;
    double mokestisPagalGyventojuSkaiciu;
    double mokestisPagalPlota;

}
