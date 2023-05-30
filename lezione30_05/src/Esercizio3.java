/*Esercizio3 : Convalida di un numero di telefono
        Scrivi un programma Java che chiede all'utente di inserire
         un numero di telefono e verifica se il numero inserito è valido.
        Utilizza un'espressione regolare per convalidare la struttura
        del numero di telefono, ad esempio, controllando il formato
        corretto,eventualmente con prefisso internazionale e
        separazione dei gruppi di numeri.
        Fai in modo che il programma stampi "Numero di telefono valido"
         o "Numero di telefono non valido" a seconda dell'esito della
         convalida.
*/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Esercizio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex1 = "^\\+[0-9]{2}-[0-9]{3}-[0-9]{4}-[0-9]{3}";
        System.out.println("inserisci il numero di telefono:");
        String numeroDaControllare = scanner.nextLine();


        Pattern pattern = Pattern.compile(regex1);
        Matcher matcher = pattern.matcher(numeroDaControllare);


        boolean valido = numeroDaControllare.matches(regex1);

        if (valido) {
            System.out.println("Valido");
        } else {
            System.out.println("Non valido");
        }


    }

}