import java.util.Scanner;

public class ProvaScanner {
    public static void main(String[] args) {

        // Crea un nuovo oggetto di tipo Scanner
        Scanner myObj = new Scanner(System.in);
        // Prendi input utente
        System.out.println("Enter username");

        // Leggi input utente
        String userName = myObj.nextLine();
        // Stampa input utente
        System.out.println("Username is: " + userName);

        // chiusura Scanner per non visualizzare il warn
        myObj.close();
    }
}
