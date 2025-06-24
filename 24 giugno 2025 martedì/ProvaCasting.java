public class ProvaCasting {
    public static void main(String[] args) {

        int myInt = 9;

        // Casting automatico: int to double
        double myDouble = myInt;

        System.out.println(myInt);
        System.out.println(myDouble);


        // Conversione esplicita
        
        double myDouble2 = 9.78d;

        // Casting manuale: double to int
        int myInt2 = (int) myDouble2;

        System.out.println(myDouble2);
        System.out.println(myInt2);
    }
}
