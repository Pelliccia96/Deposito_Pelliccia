import java.util.Scanner;

public class EsercizioCond2 {
    public static void main(String[] args) {
        // Crea un nuovo oggetto di tipo Scanner
        Scanner scanner = new Scanner(System.in);

        // COSTANTE Prezzo base dell'assicurazione
        final double PREZZO_BASE = 500.0;
        // Variabile per tenere traccia del prezzo finale
        double prezzoFinale = PREZZO_BASE;

        // Chiede l'età all'utente e assegna il valore letto int
        System.out.print("Inserisci la tua età: ");
        int eta = scanner.nextInt();

        // SE l'età è minore di 18 --> esci. ALTRIMENTI SE l'età è tra 18 e 25 --> +20%. ALTRIMENTI SE l'età è superiore a 50 --> -10%.
            // ALTRIMENTI (età 26-50) --> nessuna modifica
        if (eta < 18) {
            System.out.println("Non sei idoneo per l'assicurazione.");
            return;
        } else if (eta <= 25) {
            prezzoFinale += PREZZO_BASE * 0.20;
        } else if (eta > 50) {
            prezzoFinale -= PREZZO_BASE * 0.10;
        }

        // Chiede gli anni di guida all'utente e assegna il valore letto int
        System.out.print("Inserisci gli anni di esperienza alla guida: ");
        int esperienza = scanner.nextInt();

        // Se l'esperienza è minore di 2 --> +30%.
            // ALTRIMENTI --> nessuna modifica
        if (esperienza < 2) {
            prezzoFinale += PREZZO_BASE * 0.30;
        }

        // Chiede il numero di incidenti all'utente e assegna il valore letto int
        System.out.print("Quanti incidenti hai avuto negli ultimi 5 anni? ");
        int incidenti = scanner.nextInt();

        // SE incidenti maggiori di 4 --> non idoneo. ALTRIMENTI SE incidenti uguale 1 --> +15%. ALTRIMENTI SE incidenti maggiore/uguale a 2 --> +30%.
            // ALTRIMENTI 0 incidenti --> nessuna modifica
        if (incidenti > 4) {
            System.out.println("Non sei idoneo per l'assicurazione.");
            return;
        } else if (incidenti == 1) {
            prezzoFinale += PREZZO_BASE * 0.15;
        } else if (incidenti >= 2) {
            prezzoFinale += PREZZO_BASE * 0.30;
        }

        // Chiede la scelta del pacchetto assicurativo all'utente
            // Legge la Stringa e la converte in minuscolo
        System.out.print("Scegli il pacchetto (base, intermedio, premium): ");
        scanner.nextLine();
        String pacchetto = scanner.nextLine().toLowerCase();

        // Scelta: intermedio --> +20%. premium --> +50%. base --> nessuna modifica.
        switch (pacchetto) {
            case "intermedio":
                prezzoFinale += PREZZO_BASE * 0.20;
                break;
            case "premium":
                prezzoFinale += PREZZO_BASE * 0.50;
                break;
            case "base":
                break;
            default:
                System.out.println("Pacchetto non valido.");
                break;
        }

        // OUTPUT RISULTATO
        System.out.println("Il preventivo della tua assicurazione è: euro " + prezzoFinale);


        scanner.close();
    }
}
