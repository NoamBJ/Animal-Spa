// Ca marche pas

// import java.util.*;

// public class CentreSPAPi {

// private int capaMax;
// private Animal[] cage;

// public CentreSPAPi(int capaMax) {
// this.capaMax = capaMax;
// cage = new Animal[capaMax];
// }

// public void entrer(Animal a) {
// for (int i = 0; i < capaMax; i++) {
// if (cage[i] == a) {
// return;
// }
// }
// for (int i = 0; i < capaMax; i++) {
// if (cage[i] == null) {
// cage[i] = a;
// return;
// }
// }
// }

// public String toString() {

// StringBuilder sb = new StringBuilder();
// for (int i = 0; i < capaMax; i++) {
// if (cage[i] != null) {
// String a = "case #" + i + " Animal " + cage[i].getEspece() + " Numéros de
// Puce : "
// + cage[i].getNumPuce() + "\n";
// sb.append(a);
// }
// }
// return sb.toString();
// }

// public boolean sortir(Animal a) {
// for (int i = 0; i < capaMax; i++) {
// if (cage[i] == a) {
// cage[i] = null;
// return true;
// }
// }
// return false;
// }

// public boolean sortir(int a) {
// boolean b = false;
// for (int i = 0; i < capaMax; i++) {
// if (cage[i].getNumPuce() == a) {
// cage[i] = null;
// int temp = i;
// b = true;
// for (int j = temp; j < capaMax - 1; j++) {
// cage[j] = cage[j + 1];
// }
// }

// }
// return b;
// }
// }
