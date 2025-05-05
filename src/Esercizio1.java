public class Esercizio1 {
    public static void main(String[] args) {

        int area = moltiplica(3, 4);
        System.out.println("l'area è: " + area);

        String concatenazione = concatena("Numero:", 5);
        System.out.println("concatenazione " + concatenazione);

        String[] array = {"uno", "due", "tre", "quattro", "cinque"};
        String[] arrayModificato = inseriscilnArray(array, "newString");

        for (String elemento : arrayModificato) {
            System.out.println(elemento);
        }
    }

    public static int moltiplica(int a, int b) {
        return a * b;
    }

    public static String concatena(String str, int num) {
        return str + num;
    }

    public static String[] inseriscilnArray(String[] array, String str) {


        String[] nuovoArray = new String[6];
        nuovoArray[0] = array[0];
        nuovoArray[1] = array[1];
        nuovoArray[2] = str; // Inserimento della stringa al terzo posto
        nuovoArray[3] = array[2];
        nuovoArray[4] = array[3];
        nuovoArray[5] = array[4];

        return nuovoArray;
    }

}
