// clasa concreta care extinde clasa abstracta si implementeaza etapele necesare
public class PrajituraCiocolata extends Prajitura
{
    @Override
    protected void pregatireAluat()
    {
        System.out.println("Pregatim aluatul pentru prajitura de ciocolata.");
    }

    @Override
    protected void adaugareIngrediente()
    {
        System.out.println("Adaugam ingrediente pentru prajitura de ciocolata: ciocolata, oua, zahar, unt, faina.");
    }

    @Override
    protected void coacere()
    {
        System.out.println("Coacem prajitura de ciocolata la 180 de grade timp de 30 de minute.");
    }

    @Override
    protected void decorare()
    {
        System.out.println("Decoram prajitura de ciocolata cu fulgi de ciocolata si zahar pudra.");
    }
}