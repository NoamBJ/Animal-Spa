public class CentreSPATab {

    private int capaMax;
    private Animal[] cage;

    public CentreSPATab(int capaMax) {
        this.capaMax = capaMax;
        cage = new Animal[capaMax];
    }

    // ajoute les memes animaux
    public void entrer(Animal a) {
        for (int i = 0; i < capaMax; i++) {
            if (cage[i] == a) {
                return;
            }
        }
        for (int i = 0; i < capaMax; i++) {
            if (cage[i] == null) {
                cage[i] = a;
                return;
            }
        }
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < capaMax; i++) {
            if (cage[i] != null) {
                String a = "case #" + i + " Animal " + cage[i].getEspece() + " Numéros de Puce : "
                        + cage[i].getNumPuce() + "\n";
                sb.append(a);
            }
        }
        return sb.toString();
    }

    public boolean sortir(Animal a) {
        for (int i = 0; i < capaMax; i++) {
            if (cage[i] == a) {
                cage[i] = null;
                return true;
            }
        }
        return false;
    }

    public boolean sortir(int a) {
        for (int i = 0; i < capaMax; i++) {
            if (cage[i].getNumPuce() == a) {
                cage[i] = null;
                return true;
            }
        }
        return false;
    }

    // marche pas
    public void faireJouer() {
        for (int i = 0; i < capaMax; i++) {
            if (cage[i] instanceof Compagnon) {
                ((Compagnon) cage[i]).jouer();
            }
        }
    }

    public void getCompagnons() {
        for (int i = 0; i < capaMax; i++) {
            if (cage[i] instanceof Compagnon && cage[i] != null) {
                System.out.println(cage[i].getNom());
            }
        }
        System.out.println();
    }
}
