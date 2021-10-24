public class CentreSPATab {

    private int capaMax;
    private Animal[] cage;

    public CentreSPATab(int capaMax) {
        this.capaMax = capaMax;
        cage = new Animal[capaMax];
    }

    // index out 0 of bound car tableau length 0
    public void entrer(Animal a) {
        for (int i = 0; i < capaMax; i++) {
            if (cage[i] == a) break;
            if (cage[i] == null) {
                cage[i] = a;
                break;
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
}
