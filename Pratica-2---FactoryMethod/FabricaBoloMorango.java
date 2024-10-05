public class FabricaBoloMorango extends FabricadoBolo {
    @Override
    protected Bolo criarBolo() {
        return new BolodeMorango();
    }
}