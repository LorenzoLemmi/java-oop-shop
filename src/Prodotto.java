
import java.util.Random;

// Classe Prodotto che rappresenta un prodotto dello shop
public class Prodotto{
    private int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private double iva;

    // Costruttore che genera un codice random
    public Prodotto(String nome, String descrizione, double prezzo, double iva) {
        this.codice = generaCodice();
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    // Metodo per generare un codice casuale
    private int generaCodice() {
        Random random = new Random();
        return random.nextInt(10000); // Genera un numero casuale tra 0 e 9999
    }

    // Metodo per ottenere il prezzo base
    public double getPrezzoBase() {
        return this.prezzo;
    }

    // Metodo per ottenere il prezzo comprensivo di IVA
    public double getPrezzoConIva() {
        return this.prezzo + (this.prezzo * this.iva / 100);
    }

    // Metodo per ottenere il nome esteso del prodotto
    public String getNomeEsteso() {
        return this.codice + "-" + this.nome;
    }

    // Metodo per visualizzare le informazioni del prodotto
    public void stampaDettagli() {
        System.out.println("Codice: " + codice);
        System.out.println("Nome: " + nome);
        System.out.println("Descrizione: " + descrizione);
        System.out.println("Prezzo base: " + prezzo + " euro");
        System.out.println("Prezzo con IVA: " + getPrezzoConIva() + " euro");
        System.out.println("Nome esteso: " + getNomeEsteso());
    }
}