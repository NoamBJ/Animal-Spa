import java.util.LinkedList;

public class CentreSPALinkedList {
    private LinkedList cage;

    public CentreSPALinkedList() {
        cage = new LinkedList<Animal>();
    }

    public LinkedList<Animal> getAnimaux() {

        for (int i = 0; i < cage.size(); i++) {
            if (cage.contains(null)) {
                cage.remove(i);
            }
        }
        return cage;
    }

    // utilise le tostring de la classe animale

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cage.size(); i++) {
            String a = "case #" + i + " Animal " + ((Animal) cage.get(i)).getEspece() + " Numéros de Puce : "
                    + ((Animal) cage.get(i)).getNumPuce() + "\n";
            sb.append(a);
        }
        return sb.toString();
    }

    public void addAnimal(Animal a) {
        cage.add(a);
    }

    public void removeAnimal(Animal a) {
        cage.remove(a);
    }
}