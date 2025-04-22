import java.util.*;

public class AffectationHashMap {
    private Map<Employe, Departement> map;

    public AffectationHashMap() {
        map = new HashMap<>();
    }

    public void ajouterEmployeDepartement(Employe e, Departement d) {
        map.put(e, d);
    }

    public void afficherEmployesEtDepartements() {
        map.forEach((e, d) -> System.out.println(e + " => " + d));
    }

    public void supprimerEmploye(Employe e) {
        map.remove(e);
    }

    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        if (map.containsKey(e) && map.get(e).equals(d)) {
            map.remove(e);
        }
    }

    public void afficherEmployes() {
        map.keySet().forEach(System.out::println);
    }

    public void afficherDepartements() {
        map.values().stream().distinct().forEach(System.out::println);
    }

    public boolean rechercherEmploye(Employe e) {
        return map.containsKey(e);
    }

    public boolean rechercherDepartement(Departement d) {
        return map.containsValue(d);
    }

    public TreeMap<Employe, Departement> trierMap() {
        return new TreeMap<>(map);
    }
}
