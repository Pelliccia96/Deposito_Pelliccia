import java.util.Scanner;

public class Esercizio1 {

    public static void main(String[] args) {

        // Crea un nuovo oggetto di tipo Scanner
        Scanner myScanner = new Scanner(System.in);

        // Prende input utente Stringa
        System.out.println("Inserisci una Stringa");
        // Legge e stampa input utente
        String userString = myScanner.nextLine();
        System.out.println("La stringa inserita è: " + userString);
        

        // Prende input utente Boolean
        System.out.println("Inserisci un Boolean");
        // Legge e stampa input utente
        boolean userBool = myScanner.nextBoolean();
        System.out.println("Il Boolean inserito è: " + userBool);


        // Prende input utente Int
        System.out.println("Inserisci un Numero Intero");
        // Legge e stampa input utente
        int userInt = myScanner.nextInt();
        System.out.println("Il Numero inserito è: " + userInt);
        // Casting automatico: int to double
        double myDouble = userInt;
        System.out.println("La conversione da Int a Double è: " + myDouble);
        


        // Prende input utente Double
        System.out.println("Inserisci un Numero Decimale");
        // Legge e stampa input utente
        double userDouble = myScanner.nextDouble();
        System.out.println("Il Decimale inserito è: " + userDouble);
        // Casting manuale: double to int
        int myInt = (int) userDouble;
        System.out.println("La conversione da Double a Int è: " + myInt);



        myScanner.close();

    }

}
