import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

public class DepartementHashSet implements IDepartement<Departement> {
    private Set<Departement> departements;

    public DepartementHashSet() {
        departements = new HashSet<>();
    }

    @Override
    public void ajouterDepartement(Departement d) {
        departements.add(d);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        return departements.stream().anyMatch(d -> d.getNom().equalsIgnoreCase(nom));
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return departements.contains(d);
    }

    @Override
    public void supprimerDepartement(Departement d) {
        departements.remove(d);
    }

    @Override
    public void displayDepartement() {
        departements.forEach(System.out::println);
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        TreeSet<Departement> sorted = new TreeSet<>(Comparator.comparingInt(Departement::getId));
        sorted.addAll(departements);
        return sorted;
    }
}
