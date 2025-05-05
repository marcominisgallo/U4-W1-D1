public class Variabili {

    //main è il metodo che serve per eeguire una classe.
    public static void main(String[] args) {

        int x; //dichiarazione di una variabile senza un valore(così non può essere usata)
        x=8; //assegnazione della variabile. Ora x può essere usata perchè ha un valore

        System.out.println(x); //è come il console.log di js

        int y=4; //dichiarazione e assegnazione in contemporanea.
        System.out.println(y);

        y=3; //nuova assegnazione.

        boolean b = true; //valori booleani
        System.out.println(b);

        char c = 'm'; //un solo carattere. APICI SINGOLI
        System.out.println(c);

        String name = "Marco"; //stringhe. APICI DOPPI!
        System.out.println(name.length());

        final int j=8; //con final non si può più riassegnare il valore a questa variabile.(const)

        int[] numeri; //stai dichiarando un array destinato a contenere numeri.

        numeri = new int[4]; //stai dicendo che sarà un array destinato ad avere massimo 4 posizioni.
        System.out.println(numeri);

        numeri[0]= 1; //dichiarando la prima posizione delle 4 disponibili dell'array numeri.
        numeri[1]= 2;
        numeri[2]= 3;
        numeri[3]= 4;

        String[] parole = {"java", "sarà", "una", "condanna"};

        int i=3;
        System.out.println(i++); //post incremento
        System.out.println(++i); //pre incremento
        System.out.println(i);


        //public static VOID(void è il metodo che non restituisce nulla!
    }
}
