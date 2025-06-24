public class ProvaOperatori {
    public static void main(String[] args) {

        // Assegnazione variabile int
        int x = 10;

        // Operatore di addizione
        x += 5;
        // stampa del valore totale
        System.out.println("L'addizione è: " + x);

        // Operatore di sottrazione
        x -= 1;
        // stampa del valore totale
        System.out.println("Il risulato della sottrazione è: " + x);

        // Operatore di moltiplicazione
        x *= 2;
        // stampa del valore totale
        System.out.println("Il risulato della moltiplicazione è: " + x);

        // Operatore di divisione
        x /= 4;
        // stampa del valore totale
        System.out.println("Il risulato della divisione è: " + x);


        // Assegnazione multipla variabili int
        int y,z;
        y = 10;
        z = 5;
        // Operatori di Confronto
        System.out.print("10 è maggione di 5? ");
        System.out.println(y > z);
        System.out.print("10 è minore di 5? ");
        System.out.println(y < z);

        // Operatori Logici
        System.out.print("10 è maggione di 50 e minore di 20? ");
        System.out.println(y > 50 && y < 20);
        System.out.print("10 è maggione di 50 o minore di 20? ");
        System.out.println(y > 50 || y < 20);
    }
}
