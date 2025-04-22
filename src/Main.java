public class Main {
    public static void main(String[] args) {
        Employe e1 = new Employe(1, "Ali");
        Employe e2 = new Employe(2, "Sara");

        Departement d1 = new Departement(101, "Informatique", 5);
        Departement d2 = new Departement(102, "Finance", 3);

        AffectationHashMap affectations = new AffectationHashMap();

        affectations.ajouterEmployeDepartement(e1, d1);
        affectations.ajouterEmployeDepartement(e2, d2);

        System.out.println("== Affectations ==");
        affectations.afficherEmployesEtDepartements();

        affectations.ajouterEmployeDepartement(e1, d2);

        System.out.println("\n== Après modification ==");
        affectations.afficherEmployesEtDepartements();

        System.out.println("\n== Trier par ID employé ==");
        affectations.trierMap().forEach((e, d) -> System.out.println(e + " => " + d));
    }
}


