import esercizio1.Dipartimento;
import esercizio1.Dipendente;

public class Main {
    public static void main(String[] args) {
        // Creazione di tre oggetti Dipendente
        Dipendente dip1 = new Dipendente("D001", 1500.00, Dipartimento.PRODUZIONE);
        Dipendente dip2 = new Dipendente("D002", 1800.00, Dipartimento.AMMINISTRAZIONE);
        Dipendente dip3 = new Dipendente("D003", 2000.00, Dipartimento.VENDITE);

        // Creazione di un array di Dipendenti
        Dipendente[] dipendenti = {dip1, dip2, dip3};

        // Iterazione sull'array e stampa della matricola di ogni dipendente
        for (Dipendente dipendente : dipendenti) {
            System.out.println(dipendente.getMatricola());
        }
    }
}
