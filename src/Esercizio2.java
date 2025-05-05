import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Inserisci la prima parola:");
        String prima = scanner.nextLine();

        System.out.println("Inserisci la seconda parola:");
        String seconda = scanner.nextLine();

        System.out.println("Inserisci la terza parola:");
        String terza = scanner.nextLine();


        String concatenazione = prima + seconda + terza;
        System.out.println("Concatenazione in ordine di inserimento: " + concatenazione);


        String concatenazioneInversa = terza + seconda + prima;
        System.out.println("Concatenazione in ordine inverso: " + concatenazioneInversa);

        scanner.close();
    }
}
