import transporte.*;

public class Main {
    public static void main(String[] args) {

        TransporteStrategy onibus = new TransporteOnibus();
        TransporteStrategy van = new TransporteVan();

        TransporteRodoviario transporte = new TransporteRodoviario();

        transporte.definirEstrategia(onibus);

        TempoViagem tempoViagemOnibus = transporte.calcularTempoViagem("Origem", "Destino");
        System.out.println("Tempo de viagem de ônibus: " + tempoViagemOnibus.getTempo() + " " + tempoViagemOnibus.getUnidadeTempo());

        transporte.definirEstrategia(van);

        TempoViagem tempoViagemVan = transporte.calcularTempoViagem("Origem", "Destino");
        System.out.println("Tempo de viagem de van: " + tempoViagemVan.getTempo() + " " + tempoViagemVan.getUnidadeTempo());
    }
}
