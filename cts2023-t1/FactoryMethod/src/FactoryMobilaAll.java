public class FactoryMobilaAll implements Factory{
    public PachetMobila createPachet()
    {
        return new MobilaAll();
    }
}
