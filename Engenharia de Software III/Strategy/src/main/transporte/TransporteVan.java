package transporte;

public class TransporteVan implements TransporteStrategy {
    @Override
    public TempoViagem calcularTempoViagem(String origem, String destino) {
        // Implementação do cálculo do tempo de viagem por van
        return new TempoViagem(3, "horas");
    }
}
