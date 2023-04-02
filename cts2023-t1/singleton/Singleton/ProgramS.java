public class ProgramS {
    public static void main(String[] args) {
        Mobila primaMobila = Mobila.getInstanta("Azur", 1500, 1000);
        Mobila alDoileaMobila = Mobila.getInstanta("Amelia", 2500, 1500);

        System.out.println(primaMobila.getdenumireModel());
        System.out.println(alDoileaMobila.getdenumireModel());
    }
}
