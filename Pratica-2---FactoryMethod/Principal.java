public class Principal {
    public static void main(String[] args) {
        FabricadoBolo fabricaChocolate = new FabricaBoloChocolate();
        fabricaChocolate.fazerBolo();

        FabricadoBolo fabricaMorango = new FabricaBoloMorango();
        fabricaMorango.fazerBolo();

        FabricadoBolo fabricaCenoura = new FabricaBoloCenoura();
        fabricaCenoura.fazerBolo();

        FabricadoBolo fabricaAbacaxi = new FabricaBoloAbacaxi();
        fabricaAbacaxi.fazerBolo();
    }
}