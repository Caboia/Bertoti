package transporte;

public class TransporteRodoviario {
    private TransporteStrategy estrategia;

    public void definirEstrategia(TransporteStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public TempoViagem calcularTempoViagem(String origem, String destino) {
        return estrategia.calcularTempoViagem(origem, destino);
    }
}
