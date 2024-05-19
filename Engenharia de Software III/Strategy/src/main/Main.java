import transporte.*;

public class Main {
    public static void main(String[] args) {
        TransporteRodoviario transporte = new TransporteRodoviario();

        transporte.definirEstrategia(new TransporteTrem());
        System.out.println(transporte.calcularTempoViagem("São Paulo", "Rio de Janeiro"));

        transporte.definirEstrategia(new TransporteOnibus());
        System.out.println(transporte.calcularTempoViagem("São Paulo", "Rio de Janeiro"));

        transporte.definirEstrategia(new TransporteVan());
        System.out.println(transporte.calcularTempoViagem("São Paulo", "Rio de Janeiro"));
    }
}
