// clasa abstracta care contine template-ul metodei de facut prajitura
public abstract class Prajitura
{
    // metoda de facut prajitura, care foloseste mai multe etape
    public final void facemPrajitura()
    {
        pregatireAluat();
        adaugareIngrediente();
        coacere();
        decorare();
    }

    // etapele facerii prajiturii, care trebuie implementate de clasele concrete
    protected abstract void pregatireAluat();
    protected abstract void adaugareIngrediente();
    protected abstract void coacere();
    protected abstract void decorare();
}
