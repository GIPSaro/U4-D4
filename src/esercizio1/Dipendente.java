package esercizio1;

//public class Dipendente {
//    private String matricola;
//    private double stipendio;
//    private Dipartimento dipartimento;
//
//    // Costruttore
//    public Dipendente(String matricola, double stipendio, Dipartimento dipartimento) {
//        this.matricola = matricola;
//        this.stipendio = stipendio;
//        this.dipartimento = dipartimento;
//    }
//
//    // Getters
//    public String getMatricola() {
//        return matricola;
//    }
//
//    public double getStipendio() {
//        return stipendio;
//    }
//
//    public Dipartimento getDipartimento() {
//        return dipartimento;
//    }
//
//    // Setter per Dipartimento
//    public void setDipartimento(Dipartimento dipartimento) {
//        this.dipartimento = dipartimento;
//    }
//}

public abstract class Dipendente implements Checkable {
    private String matricola;
    private Dipartimento dipartimento;
    private TipoDipendente tipo;

    // Costruttore
    public Dipendente(String matricola, Dipartimento dipartimento, TipoDipendente tipo) {
        this.matricola = matricola;
        this.dipartimento = dipartimento;
        this.tipo = tipo;
    }

    @Override
    public void checkIn() {
        System.out.println("Il Dipendente con matricola " + matricola + " ha iniziato il turno di lavoro.");
    }

    // Getters
    public String getMatricola() {
        return matricola;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    // Setter per Dipartimento
    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public TipoDipendente getTipo() {
        return tipo;
    }


    public abstract double calculateSalary();


    public static class DipendenteFullTime extends Dipendente {
        private double stipendioMensile;

        public DipendenteFullTime(String matricola, Dipartimento dipartimento, double stipendioMensile) {
            super(matricola, dipartimento, TipoDipendente.FULL_TIME);
            this.stipendioMensile = stipendioMensile;
        }

        @Override
        public double calculateSalary() {
            return stipendioMensile;
        }
    }


    public static class DipendentePartTime extends Dipendente {
        private double tariffaOraria;
        private int oreLavorate;

        public DipendentePartTime(String matricola, Dipartimento dipartimento, double tariffaOraria, int oreLavorate) {
            super(matricola, dipartimento, TipoDipendente.PART_TIME);
            this.tariffaOraria = tariffaOraria;
            this.oreLavorate = oreLavorate;
        }

        @Override
        public double calculateSalary() {
            return tariffaOraria * oreLavorate;
        }
    }


    public static class Dirigente extends Dipendente {
        private double stipendioAnnuale;
        private double bonus;

        public Dirigente(String matricola, Dipartimento dipartimento, double stipendioAnnuale, double bonus) {
            super(matricola, dipartimento, TipoDipendente.DIRIGENTE);
            this.stipendioAnnuale = stipendioAnnuale;
            this.bonus = bonus;
        }

        @Override
        public double calculateSalary() {
            return (stipendioAnnuale / 12) + bonus;
        }
    }
}

