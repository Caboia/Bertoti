package transporte;

public class TransporteOnibus implements TransporteStrategy {
    @Override
    public TempoViagem calcularTempoViagem(String origem, String destino) {
        // Implementação do cálculo do tempo de viagem por ônibus
        return new TempoViagem(5, "horas");
    }
}
