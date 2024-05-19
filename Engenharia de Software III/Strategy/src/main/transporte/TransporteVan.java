package transporte;

public class TransporteVan implements TransporteStrategy {
    @Override
    public TempoViagem calcularTempoViagem(String origem, String destino) {
        return new TempoViagem(150); 
    }
}