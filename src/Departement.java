import java.util.Objects;

public class Departement {
    private int id;
    private String nom;
    private int nbEmployes;

    public Departement() {}
    public Departement(int id, String nom, int nbEmployes) {
        this.id = id;
        this.nom = nom;
        this.nbEmployes = nbEmployes;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public int getNbEmployes() { return nbEmployes; }
    public void setNbEmployes(int nbEmployes) { this.nbEmployes = nbEmployes; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Departement)) return false;
        Departement d = (Departement) o;
        return id == d.id && Objects.equals(nom, d.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom);
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nbEmployes=" + nbEmployes +
                '}';
    }
}
