public class Coyotte extends Animal {

    public Coyotte(String couleur, String nom) {
        super("Coyotte", couleur, nom);
    }

    public String crier() {
        return "Ahou !";
    }

    public String toString() {
        return super.toString() + " et j’avance à pas feutrés";
    }

}