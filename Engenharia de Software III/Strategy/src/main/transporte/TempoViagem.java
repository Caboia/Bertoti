package transporte;

public class TempoViagem {
    private int minutos;

    public TempoViagem(int minutos) {
        this.minutos = minutos;
    }

    public int getMinutos() {
        return minutos;
    }

    @Override
    public String toString() {
        return "Tempo de viagem: " + minutos + " minutos";
    }
}
