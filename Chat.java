public class Chat extends Animal {

    public Chat(String couleur, String nom) {
        super("Chat", couleur, nom, count);
    }

    public String crier() {
        return "Miaou !";
    }

    public String toString() {
        return super.toString() + " et j’avance à pas feutrés";
    }

}