public class ProvaCondizioni {

    public static void main(String[] args) {
        // Espressiioni Booleane, restituisce true o false
        int x = 10;
        int y = 9;
        System.out.println(x > y);
        System.out.println(x == 10);

        int myAge = 25;
        int votingAge = 18;
        System.out.println(myAge >= votingAge);

        // Strutture Condizionali - BLOCCO IF
        if (20 > 18) {
            System.out.println("20 è maggiore di 18");
        }

        if (x > y) {
            System.out.println("x è maggiore di y");
        }

        // BLOCCO ELSE
        int time = 20;
        if (time < 18) {
            System.out.println("Buongiorno.");
        } else {
            System.out.println("Buonasera.");
        }

        // BLOCCO IF ELSE
        if (time < 10) {
            System.out.println("Buongiorno.");
        } else if (time < 18) {
            System.out.println("Buonpomeriggio.");
        } else {
            System.out.println("Buonasera.");
        }

        // Operatore Ternario
        // IF (time maggiore di 18) => 'stampa' buongiorno ALTRIMENTI buonsera
        String result = (time < 18) ? "Buongiorno." : "Buonasera.";
        System.out.println(result);
    }
}