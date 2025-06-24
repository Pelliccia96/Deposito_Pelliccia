public class ProveVariabili {
    public static void main(String[] args) {

        // assegnazione variabili
        int provaNumero = 12;
        String provaTesto = "Ciao Mondo";
        boolean provaBool = true;

        // dichiarazione e inizializzazione, senza assegnazione
        boolean provaBooll;
        provaBooll = false;

        /*
         * variabile costante
         *  final int provaNumero = 15;
         *  provaNumero = 20;
         */

        // variabili Stringhe
        String testo = "Prova";
        System.out.println(testo);

        // concatenazione di Stringhe
        testo = "Mondo";
        System.out.println("Ciao " + testo);

        // concatenazione di più Stringhe insieme
        String firstPart = "Ciao ";
        String lastPart = "Mondo";
        String fullPart = firstPart + lastPart;
        System.out.println(fullPart);


        // Stampa delle variabili con operatore matematico
        int x = 5;
        int y = 6;
        System.out.println(x + y);

        // dichiarazione di variaabili dello stesso tipo
        int x1 = 5, y1 =6, z1 = 50;
        System.out.println(x1 + y1 + z1);

        // assegnazione dello stesso valore a più variabili
        int x2, y2, z2;
        x2 = y2 = z2 = 50;
        System.out.println(x2 + y2 + z2);

    }
}