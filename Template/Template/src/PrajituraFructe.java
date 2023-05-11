// clasa concreta care extinde clasa abstracta si implementeaza etapele necesare
public class PrajituraFructe extends Prajitura
{
    @Override
    protected void pregatireAluat()
    {
        System.out.println("Pregatim aluatul pentru prajitura cu fructe.");
    }

    @Override
    protected void adaugareIngrediente()
    {
        System.out.println("Adaugam ingrediente pentru prajitura cu fructe: fructe, oua, zahar, unt, faina.");
    }

    @Override
    protected void coacere()
    {
        System.out.println("Coacem prajitura cu fructe la 180 de grade timp de 40 de minute.");
    }

    @Override
    protected void decorare()
    {
        System.out.println("Decoram prajitura cu fructe cu fructe proaspete si zahar pudra.");
    }
}