package jana60.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto primo = new Prodotto("nike","Scarpa", 90, 22);
        Prodotto secondo = new Prodotto("amazon","echo", 120, 22);
        Prodotto terzo = new Prodotto("ikea","libreria", 69, 22);
        Prodotto quarto = new Prodotto("chanel","Profumo", 200, 22);
        Prodotto quinto = new Prodotto("Mulino Bianco","Biscotti", 3.40, 10);

        System.out.println(quinto.prezzoFormat());

    }

}
