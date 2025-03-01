
import java.util.Random;

// Product Class representing a product from the shop
public class Prodotto{
    private int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private double iva;

    // Constructor that generates random code
    public Prodotto(String nome, String descrizione, double prezzo, double iva) {
        this.codice = generaCodice();
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    // Method to generate a random code
    private int generaCodice() {
        Random random = new Random();
        // Generate a random number between 0 and 9999
        return random.nextInt(10000);
    }

    // Method to get the base price
    public double getPrezzoBase() {
        return this.prezzo;
    }

    // Method to obtain the price including VAT
    public double getPrezzoConIva() {
        return this.prezzo + (this.prezzo * this.iva / 100);
    }

    // Method to get the full product name
    public String getNomeEsteso() {
        return this.codice + "-" + this.nome;
    }

    // Method to view product information
        public void stampaDettagli() {
        System.out.println("Codice: " + codice);
        System.out.println("Nome: " + nome);
        System.out.println("Descrizione: " + descrizione);
        System.out.println("Prezzo base: " + prezzo + " euro");
        System.out.println("Prezzo con IVA: " + getPrezzoConIva() + " euro");
        System.out.println("Nome esteso: " + getNomeEsteso());
    }
}