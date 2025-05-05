/*Implementare i seguenti metodi
- perimetroRettangolo che accetta la lunghezza decimale dei due lati di un rettangolo e ne calcola il perimetro
- pariDispari che accetta un numero intero e restituisce 0 se il numero è pari e 1 se è dispari
- perimetroTriangolo che accetta le lunghezze decimali dei lati di un triangolo e ne restituisca l'area (è possibile
usare la formula di Erone)
Scrivere un main che utilizzi in sequenza i tre metodi chiedendo l'input dei dati all'utente*/

import java.util.Scanner;

public class Esercizio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Inserisci la base del rettangolo:");
        double base = scanner.nextDouble();
        System.out.println("Inserisci l'altezza del rettangolo:");
        double altezza = scanner.nextDouble();
        double perimetroRettangolo = perimetroRettangolo(base, altezza);
        System.out.println("Il perimetro del rettangolo è: " + perimetroRettangolo);


        System.out.println("Inserisci un numero intero:");
        int numero = scanner.nextInt();
        int risultatoPariDispari = pariDispari(numero);
        System.out.println("Il numero è " + (risultatoPariDispari == 0 ? "pari" : "dispari"));


        System.out.println("Inserisci la lunghezza del primo lato del triangolo:");
        double latoA = scanner.nextDouble();
        System.out.println("Inserisci la lunghezza del secondo lato del triangolo:");
        double latoB = scanner.nextDouble();
        System.out.println("Inserisci la lunghezza del terzo lato del triangolo:");
        double latoC = scanner.nextDouble();
        double areaTriangolo = perimetroTriangolo(latoA, latoB, latoC);
        System.out.println("L'area del triangolo è: " + areaTriangolo);

        scanner.close();
    }


    public static double perimetroRettangolo(double lato1, double lato2) {
        return 2 * (lato1 + lato2);
    }


    public static int pariDispari(int numero) {
        return numero % 2 == 0 ? 0 : 1;
    }


    public static double perimetroTriangolo(double latoA, double latoB, double latoC) {
        double semiPerimetro = (latoA + latoB + latoC) / 2;
        return Math.sqrt(semiPerimetro * (semiPerimetro - latoA) * (semiPerimetro - latoB) * (semiPerimetro - latoC));
    }
}
