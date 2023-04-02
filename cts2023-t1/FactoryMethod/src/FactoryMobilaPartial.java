public class FactoryMobilaPartial implements Factory {
    @Override
    public PachetMobila createPachet() {
        return new MobilaPartial();
    }
}
