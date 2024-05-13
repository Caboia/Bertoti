package transporte;

public interface TransporteStrategy {
    TempoViagem calcularTempoViagem(String origem, String destino);
}
