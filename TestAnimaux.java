public class TestAnimaux {
    public static void main(String[] args) {
        Chien c1 = new Chien("crème", "Medor");
        Chat c2 = new Chat("noir", "baba");
        Coyotte c3 = new Coyotte("blanc", "jojo");
        ChienBergerBlanc c4 = new ChienBergerBlanc("Mike", 15);
        CentreSPATab spa = new CentreSPATab(4);

        spa.entrer(c1);
        spa.entrer(c2);
        spa.entrer(c3);
        spa.entrer(c4);
        System.out.println(spa.toString());

        spa.sortir(2);
        spa.entrer(c3);
        spa.entrer(c3);
        spa.entrer(c3);

        spa.getCompagnons();

        System.out.println(spa.toString());

        CentreSPALinkedList ll = new CentreSPALinkedList();
        ll.addAnimal(c1);
        ll.addAnimal(c2);
        ll.addAnimal(c3);
        ll.getAnimaux();
        System.out.println(ll.toString());
        ll.removeAnimal(c1);
        ll.getAnimaux();
        System.out.println(ll.toString());

    }

}