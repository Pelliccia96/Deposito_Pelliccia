import java.util.Arrays;

public class ProvaString {
    public static void main(String[] args) {

        // Metodo .lenght sulla Stringa
        String txt = "Hello World";
        System.out.println("The length is: " + txt.length());

        // Metodo .toUpperCase sulla Stringa
        System.out.println(txt.toUpperCase());
        // Metodo .toLowerCase sulla Stringa
        System.out.println(txt.toLowerCase());

        // Metodo .indexOf sulla Stringa
        System.out.println(txt.indexOf("World"));


        // Concatenazione di Stringhe
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);

        // Concatenazione di Stringhe tramite metodo .concat
        System.out.println(firstName.concat(lastName));


        // Special Characters
        System.out.println("We are the so-called \"Vikings\" from the north.");
        // Logica di Formattazione
        System.out.println("Testo sulla prima riga.\nTesto sulla seconda riga.");
        System.out.println("Prima Stringa. \t Seconda Stringa.");


        // Metodo .split sulla Stringa
        String str = "Hello World this is me";
        String[] words = str.split("\\s");
        // Metodo .toString sull'Array words
        System.out.println(Arrays.toString(words));


        // Metodo .length (lunghezza di una Stringa)
        String descrizione = "Articolo sull stringhe ...";
        int length = descrizione.length();
        System.out.println("Lunghezza: " + length);

        // Metodo .length (lunghezza di una Stringa vuota)
        String descrizione2 = "";
        int length2 = descrizione2.length();
        System.out.println("Lunghezza: " + length2);


        // Metodo .equals (confronto tra Stringa e Oggetto)
        boolean equals = (descrizione.equals(descrizione2));
        System.out.println(equals);

    }
}
