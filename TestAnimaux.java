public class TestAnimaux {
    public static void main(String[] args) {
        Chien c1 = new Chien("crème", "Medor");
        Chat c2 = new Chat("noir", "baba");
        Chat c3 = new Chat("blanc", "jojo");
        CentreSPATab spa = new CentreSPATab(2);

        System.out.println(c2.equals(c3));

        spa.entrer(c1);
        spa.entrer(c2);
        spa.sortir(1);
        spa.entrer(c3);
        System.out.println(spa.toString());

        System.out.println(spa.toString());

    }

}