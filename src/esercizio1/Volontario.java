package esercizio1;

public class Volontario implements Checkable {
    private String nome;
    private int eta;
    private String CV;

    public Volontario(String nome, int eta, String CV) {
        this.nome = nome;
        this.eta = eta;
        this.CV = CV;
    }

    @Override
    public void checkIn() {
        System.out.println(nome + " ha iniziato il suo servizio di volontariato.");
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getEta() {
        return eta;
    }

    public String getCV() {
        return CV;
    }
}
