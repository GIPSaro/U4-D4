import esercizio1.Dipartimento;
import esercizio1.Dipendente;

public class Main {
    public static void main(String[] args) {

        Dipendente dip1 = new Dipendente("D0001", 1500.00, Dipartimento.PRODUZIONE);
        Dipendente dip2 = new Dipendente("D0002", 1800.00, Dipartimento.AMMINISTRAZIONE);
        Dipendente dip3 = new Dipendente("D0003", 2000.00, Dipartimento.VENDITE);


        Dipendente[] dipendenti = {dip1, dip2, dip3};


        for (Dipendente dipendente : dipendenti) {
            System.out.println(dipendente.getMatricola());
        }
    }
}
