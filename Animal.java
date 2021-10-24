public class Animal {
    // Propriétés caractérisant un animal.
    private String espece;
    protected String couleur;
    private String nom;
    private int numPuce;
    public static int count = 1;

    // Constructeur
    public Animal(String esp, String couleur, String nom, int numPuce) {
        espece = esp;
        this.couleur = couleur;
        this.nom = nom;
        this.numPuce = numPuce;
        count++;
    }

    /* Accesseurs */
    public String getNom() {
        return nom;
    }

    public String getEspece() {
        return espece;
    }

    public int getNumPuce() {
        return numPuce;
    }

    /**
     * Cette méthode renvoie une chaine de caractères matérialisant le cri de
     * l'animal. Il n'y a pas de cri "générique". Dans le cas général, on renvoie la
     * constante "... J’suis muet :’( ...". Cette méthode sera spécialisée par
     * héritage.
     */
    public String crier() {
        return "... J’suis muet :’( ...";
    }

    /** Renvoie une description textuelle de l'animal. */
    public String toString() {
        return "Le " + espece + " " + couleur + " " + nom + " vous dit " + crier();
    }

    @Override
    public boolean equals(Object a) {
        if (this == a) {
            return true;
        }
        if (a == null || getClass() != a.getClass()) {
            return false;
        }
        Animal animal = (Animal) a;
        return this.getNumPuce() == animal.getNumPuce();
    }
}
