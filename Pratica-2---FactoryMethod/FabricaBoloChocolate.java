public class FabricaBoloChocolate extends FabricadoBolo {
    @Override
    protected Bolo criarBolo() {
        return new BolodeChocolate();
    }
}