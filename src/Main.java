import esercizio1.Checkable;
import esercizio1.Dipartimento;
import esercizio1.Dipendente;
import esercizio1.Volontario;

public class Main {
//    public static void main(String[] args) {
//
//        Dipendente dip1 = new Dipendente("D0001", 1500.00, Dipartimento.PRODUZIONE);
//        Dipendente dip2 = new Dipendente("D0002", 1800.00, Dipartimento.AMMINISTRAZIONE);
//        Dipendente dip3 = new Dipendente("D0003", 2000.00, Dipartimento.VENDITE);
//
//
//        Dipendente[] dipendenti = {dip1, dip2, dip3};
//
//
//        for (Dipendente dipendente : dipendenti) {
//            System.out.println(dipendente.getMatricola());
//        }
//    }}


    public static void main(String[] args) {
        // Creazione di varie istanze di dipendenti


        Dipendente dipendente1 = new Dipendente.DipendenteFullTime("FBI001", Dipartimento.PRODUZIONE, 2000.00);
        Dipendente dipendente2 = new Dipendente.DipendentePartTime("FBI002", Dipartimento.AMMINISTRAZIONE, 20.00, 80);
        Dipendente dirigente1 = new Dipendente.Dirigente("DIR001", Dipartimento.VENDITE, 120000.00, 5000.00);

        // Creazione di un array di Dipendenti


        Dipendente[] dipendenti = {dipendente1, dipendente2, dirigente1};

        // Iterazione sull'array e calcolo dello stipendio totale


        double stipendioTotale = 0;
        for (Dipendente dipendente : dipendenti) {

            //


            System.out.printf("Matricola: %s, Tipo: %s, Stipendio: %.2f\n",
                    dipendente.getMatricola(), dipendente.getTipo(), dipendente.calculateSalary());
            stipendioTotale += dipendente.calculateSalary();
        }

        System.out.printf("Stipendio totale: %.2f\n", stipendioTotale);

        // Creazione di varie istanze di volontari
        Volontario volontario1 = new Volontario("Franco Franchi", 30, "CV Franco");
        Volontario volontario2 = new Volontario("Pippo Pluto", 25, "CV Pippo");

        // Creazione di un array di Checkable (Dipendenti e Volontari)
        Checkable[] persone = {dipendente1, dipendente2, dirigente1, volontario1, volontario2};

        // Iterazione sull'array e chiamata del metodo checkIn
        for (Checkable persona : persone) {
            persona.checkIn();
        }
    }
}



