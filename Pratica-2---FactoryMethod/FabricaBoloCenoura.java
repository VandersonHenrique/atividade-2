
public class FabricaBoloCenoura extends FabricadoBolo {
    @Override
    protected Bolo criarBolo() {
        return new BolodeCenoura();
    }
}