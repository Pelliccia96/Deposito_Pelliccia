import java.util.Scanner;

public class EsercizioCond1 {
    public static void main(String[] args) {

        // Crea un nuovo oggetto di tipo Scanner
        Scanner myScanner = new Scanner(System.in);

        // Chiede all'utente di scegliere il mezzo di trasporto e assegna il valore
        // letto String
        System.out.print("Scegli il mezzo (taxi o bus): ");
        String mezzo = myScanner.nextLine().toLowerCase();

        // SE il mezzo scelto è UGUALE a 'taxi' OPPURE UGUALE a 'bus' --> entra. ALTRIMENTI esce --> scegliere un mezzo valido
        if ((mezzo.equals("taxi") || mezzo.equals("bus"))) {
            // Chiede l'età all'utente e assegna il valore letto int
            System.out.print("Inserisci la tua età: ");
            int eta = myScanner.nextInt();

            // Chiede il biglietto valido all'utente e assegna il valore letto bool
            System.out.print("Hai un biglietto valido? (true/false): ");
            boolean bigliettoValido = myScanner.nextBoolean();

            // Chiede se l'utente è accompagnato e assegna il valore letto bool
            System.out.print("Sei accompagnato da un adulto? (true/false): ");
            boolean accompagnatoDaAdulto = myScanner.nextBoolean();

            // Chiede se l'utente ha l'opzione salta fila e assegna il valore letto bool
            System.out.print("Hai acquistato l'opzione 'Salta la fila'? (true/false): ");
            boolean saltaLaFila = myScanner.nextBoolean();

            // SE il biglietto NON è valido --> stop. ALTRIMENTI SE l'età è maggiore di 14 E
            // non è accompagnato da un adulto --> stop. ALTRIMENTI può passare.
            // SE ha l'opzione salta fila --> entra. ALTRIMENTI attendere.
            if (!bigliettoValido) {
                System.out.println("Non possiedi un biglietto valido.");
            } else if (eta < 14 && !accompagnatoDaAdulto) {
                System.out.println("i minori di 14 anni devono essere accompagnati da un adulto.");
            } else {
                System.out.println("Accesso consentito.");
                if (saltaLaFila) {
                    System.out.println("Puoi passare!");
                } else {
                    System.out.println("Attendi il tuo turno in fila.");
                }
            }

        } else {
            System.out.println("Mezzo non valido. Seleziona 'taxi' o 'bus'.");
        }

        myScanner.close();
    }
}
