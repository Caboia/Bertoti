package transporte;

public class TransporteTrem implements TransporteStrategy {
    @Override
    public TempoViagem calcularTempoViagem(String origem, String destino) {
        return new TempoViagem(120); 
    }
}
