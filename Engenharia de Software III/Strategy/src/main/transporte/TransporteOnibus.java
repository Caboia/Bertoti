package transporte;

public class TransporteOnibus implements TransporteStrategy {
    @Override
    public TempoViagem calcularTempoViagem(String origem, String destino) {
        return new TempoViagem(180);
    }
}