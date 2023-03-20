public class FabricaDeMasini {
    int id;
    String model;

    private static FabricaDeMasini instance;

    private FabricaDeMasini()
    {
        id = 0;
        model = null ;
    }
    public FabricaDeMasini(int id, String model){
        this.id = id;
        this.model = model;
    }

    public String showStatus()
    {
        return " Masina cu id-ul " + id + " are modelul " + model;
    }

    public static synchronized FabricaDeMasini getInstance(int id, String model)
    {
        if(instance==null)
            instance=new FabricaDeMasini(id, model);
        return instance;
    }
}
