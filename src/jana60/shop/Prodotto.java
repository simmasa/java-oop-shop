package jana60.shop;

import java.text.DecimalFormat;

public class Prodotto {

    String marca;
    String nome;
    double prezzo;
    double iva;

    //Costruttore
    Prodotto(String brand, String name, double price , double iva) {
    marca = brand;
    nome = name;
    prezzo = price;
    this.iva = iva;
    }
    //Methods
    double prezzoFinale() {
        return prezzo+((prezzo/100)*iva);
    }
    String prezzoFormat() {
        DecimalFormat df = new DecimalFormat("#.00\u00A4");
        String format = df.format(prezzoFinale());
        return format;
    }
}
