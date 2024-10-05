public class FabricaBoloAbacaxi extends FabricadoBolo {
    @Override
    protected Bolo criarBolo() {
        return new BolodeAbacaxi();
    }
}