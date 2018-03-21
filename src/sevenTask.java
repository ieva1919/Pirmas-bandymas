public class sevenTask {
    /*Parašyti programą dvimačio masyvo (matricos)  teigiamų elementų kiekiui surasti.*/

    public static void main(String[] args) {

        int[][] mas = {{1,2,3}, {4,5,6}, {7,8,9}};

        int kiekis = 0;



        for(int i=0; i<mas.length; i++) {
            for(int j=0; j<mas[i].length; j++) {
                if(mas[i][j] > 0) {
                    kiekis++;
                }
            }
        }

        System.out.println("teigiamu elementu kiekis: " + kiekis);


    }
}
