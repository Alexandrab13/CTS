public class Mobila {
    private String denumireModel;
    private float pret;
    private int pretProductie;
    private static Mobila instanta = null;

    public Mobila(String denumireModel, float pret, int pretProductie) {
        this.denumireModel = denumireModel;
        this.pret = pret;
        this.pretProductie = pretProductie;
    }

    public String getdenumireModel() {
        return denumireModel;
    }

    public float getpret() {
        return pret;
    }

    public int getpretProductie() {
        return pretProductie;
    }

    public void setdenumireModel(String denumireModel) {
        this.denumireModel = denumireModel;
    }

    public void setpret(float pret) {
        this.pret = pret;
    }

    public void setpretProductie(int pretProductie) {
        this.pretProductie = pretProductie;
    }

    public static synchronized Mobila getInstanta ( String denumireModel, float Pret, int PretProductie){
        if(instanta == null)
            instanta = new Mobila( denumireModel, Pret, PretProductie);
        return instanta;
    }
}
// clasa + cosntrucor cu parametrii + get si set + getInstanta