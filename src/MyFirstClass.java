public class MyFirstClass {
    //psvm greit sukurti main metoda
    public static void main(String[] args) {
        //sout atspauzdinimui
        System.out.println("Hello world");

        int a = 10;

        //sukurtas objektas
        MyFirstClass myFirstClass = new MyFirstClass();
        // ne statinis kvietimas statiniame per klases objekta
        myFirstClass.myNotStaticMethod(a);

        // tiesiog per varda sukurtas toje pacioje klaseje
        myStaticMethod();

        float b = 4.6f;
        double c = 2.5;
        boolean d = true; //false

        char e = 'a';
        String f = "This is string";
    }

    private void myNotStaticMethod(int numb) {
        System.out.println("Jusu skaicius" + numb);
    }

    private static void myStaticMethod() {
        System.out.println("Cia yra statinis metodas");
    }

}
