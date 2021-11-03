public class TestAnimaux {
    public static void main(String[] args) {
        Chien c1 = new Chien("crème", "Medor");
        Chat c2 = new Chat("noir", "baba");
        Coyotte c3 = new Coyotte("blanc", "jojo");
        CentreSPATab spa = new CentreSPATab(4);

        spa.entrer(c1);
        spa.entrer(c2);
        spa.entrer(c3);
        System.out.println(spa.toString());

        spa.sortir(2);
        spa.entrer(c3);
        spa.entrer(c3);
        spa.entrer(c3);

        System.out.println(spa.toString());

    }

}