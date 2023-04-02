public class Program {
    private static void afisare(Factory fabrica){
        PachetMobila pachetMobila = fabrica.createPachet();
        pachetMobila.descriere();
    }

    public static void main(String[] args) {
        afisare(new FactoryMobilaAll());
    }
}
