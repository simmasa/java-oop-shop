package jana60.shop;

import java.util.Scanner;

public class Catalogo {

    public static void main(String[] args) {
        System.out.println("Aggiungi cinque prodotti al catalogo: ");

        Prodotto[] catalogo = new Prodotto[5];
        Scanner primo = new Scanner(System.in);

        for (int i=0; i<5; i++) {
            System.out.println("Inserisci la marca del prodotto n."+(i+1)+": ");
            String marca = primo.nextLine();
            System.out.println("Inserisci il nome del prodotto n."+(i+1)+": ");
            String nome = primo.nextLine();
            System.out.println("Inserisci il prezzo del prodotto n."+(i+1)+": (Usa la virgola per eventuali decimali)");
            double prezzo = primo.nextDouble();
            primo.nextLine();
            System.out.println("Inserisci l'iva del prodotto n."+(i+1)+": (senza %)");
            double iva = primo.nextDouble();
            primo.nextLine();

            catalogo[i] = new Prodotto(marca, nome, prezzo, iva);
        }
        primo.close();

        for (int i =0;i< catalogo.length;i++) {     //non mi ricordo se il for enhanced era stato spiegato
            System.out.printf("%15s%15s%15s%15s\n", catalogo[i].marca , catalogo[i].nome , String.format("%.2f", catalogo[i].prezzo)+"€" , catalogo[i].prezzoFormat());
        }

    }

}
