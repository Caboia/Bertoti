package transporte;

public class TempoViagem {
    private int tempo;
    private String unidadeTempo;

    public TempoViagem(int tempo, String unidadeTempo) {
        this.tempo = tempo;
        this.unidadeTempo = unidadeTempo;
    }

    public int getTempo() {
        return tempo;
    }

    public String getUnidadeTempo() {
        return unidadeTempo;
    }
}
