public class Chien extends Animal {

    public Chien(String couleur, String nom) {
        super("Chien", couleur, nom);
    }

    public String crier() {
        return "ouaouaoua !";
    }

    public String getCouleur() {
        return this.couleur;
    }

    public void teindre(String s) {
        this.couleur = s;
    }

}
