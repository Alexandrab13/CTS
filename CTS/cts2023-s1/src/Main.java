
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //tipul de date nu tre sa fie string pentru expirare asa ca facem conversia, tipul tre sa fie Date

        OShop o = new OShop("Emag", "logo.jpg", new ArrayList<Produs>());

        Produs p1 = new Produs("Laptop", 3200.5, 1,1, 1123, "");
        Produs p2 = new Produs("Frigider", 207.95, 1,2, 1245, "");

        Produs p3 = new Produs(p1);

        p3.setQty(5);
        p3.setProdusName("Paine");

        o.modifyProductsList(1,p1);
        o.modifyProductsList(1,p2);

        o.modifyProductsList(2, p1);
        System.out.println(p1.equals(p2));
    }
}

class OShop {
    private String onlineShopName;
    private String i;
    private ArrayList<Produs> products;

    OShop(String name, String img, ArrayList<Produs> products)
    {
        this.products = new ArrayList<Produs>();
        this.i = img;
        this.onlineShopName = name;
    }

    public void modifyProductsList(int what, Produs p)
    {
        if(what == 1)
        {
            this.products.add(p);
        }
        else
            this.products.remove(p);
    }

    public String getOnlineShopName() {
        return onlineShopName;
    }

    public void setOnlineShopName(String onlineShopName) {
        this.onlineShopName = onlineShopName;
    }

    public String getI() {
        return i;
    }

    public void setImg(String img) {
        this.i = img;
    }
}

class Produs
{
    private int produsId;
    private String produsName;
    private double productPrice;

    private int productType;
    private int productCategory;
    private int qty;
    //nu e foarte explicita dar e corecta - qty
    private String exp; //expiry date - only for goods
    private String details; // ex.: processor, memory, power, volume (for refrigerators etc)

    public Produs(String n, double p, int pt, int pc, int id, String exp)
    {
        this.produsName = n;
        this.productPrice = p;
        this.productType = pt;
        this.productCategory = pc;
        this.produsId = id;
        this.exp = exp;
        //modificam denumirile la variabile si modific la parametrii numele si le pun lafel
        //specificam cu this peste tot, fie nu

    }

    public Produs(Produs p)
    {
        this.produsName = p.produsName;
        this.productPrice = p.productPrice;
        this.productType = p.productType;
        this.productCategory = p.productCategory;
        this.produsId = p.produsId;
        //mai modific si denumirea produsului
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProdusName() {
        return produsName;
    }

    public void setProdusName(String prodName) {
        this.produsName = produsName;
    }

    public int getProductType() {
        return productType;
    }

    public void setProductType(int productType) {
        this.productType = productType;
    }

    public boolean equals(Produs p)
    {
        if(p.produsId != this.produsId)
            return false;
        if(!p.produsName.equals(this.produsName))
            return false;
        if(p.productPrice != this.productPrice)
            return false;
        if(p.productType != p.productType)
            return false;
        if(p.productCategory != this.productCategory)
            return false;

        return true;
        //cate o metoda pentru fiecare comparare, fac metode separate si compar element cu element
        
    }

    public void modify(boolean flag, double val)
    {
        if(flag)
            this.productPrice+=this.productPrice*val;
        if(!flag)
            this.productPrice-=this.productPrice*val/100;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getProdId() {
        return produsId;
    }

    public void setProdId(int prodId) {
        this.produsId = prodId;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}

class User
{
    private String usn;
    private String userId;
    private ArrayList<Order> o;
    private ArrayList<Order> c;

    public User(String usn, String userId)
    {
        this.usn = usn;
        this.userId = userId;
        o=new ArrayList<Order>();
        c=new ArrayList<Order>();
    }

    public void addO1(Order o)
    {
        this.o.add(o);
    }

    public void addO2(Order o)
    {
        this.c.add(o);
    }
}

class Order
{
    private ArrayList<Produs> l;
    private String addr;

    public Order()
    {
        l = new ArrayList<Produs>();
    }
    public void add(Produs p)
    {
        if(l.size() > 99)
            return;

        l.add(p);
    }

    public void remove(Produs p)
    {
        l.remove(p);
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}

class InventoryP
{
    private Produs p;
    private int q;

    public InventoryP(Produs p, int q)
    {
        this.p = new Produs(p);
        this.q = q;
    }
    public Produs getP() {
        return p;
    }

    public void setP(Produs p) {
        this.p = p;
    }

    public int getQ() {
        return q;
    }

    public void setQ(int q) {
        this.q = q;
    }
}


