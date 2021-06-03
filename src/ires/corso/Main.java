package ires.corso;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner in;
	in = new Scanner(System.in);

	// chiedo inserimento di 3 numeri
        System.out.println("Inserisci un primo numero intero");
        int a = in.nextInt();
        System.out.println("Inserisci un secondo numero intero");
        int b = in.nextInt();
        System.out.println("Inserisci un terzo numero intero");
        int c = in.nextInt();
        System.out.println("Hai inserito: " + a + "; " + b + "; " + c);

        // confronto di 3 numeri per trovarne il maggiore
        int magg;

        if(a>b){
            magg = a;
        }
        else{
            magg = b;
        }

        if (c>magg){
            magg = c;
        }
        else{
        }
        System.out.println("Il numero maggiore è: " + magg);

        //in alternativa confronto con IF annidati e salvo il maggiore.
        /*
        if (a>b){
            if (a>c){
                magg = a;
            }
            else{
                magg = c;
            }
        }
        else{
            if (b>c){
                magg = b;
            }
            else{
                magg = c;
            }
        }
        System.out.println("Il numero maggiore è: " + magg);
        */
    }
}
