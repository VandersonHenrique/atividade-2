public abstract class FabricadoBolo {
    
    public void fazerBolo() {
        Bolo bolo = criarBolo();
        bolo.preparar();
    }

    protected abstract Bolo criarBolo();
}