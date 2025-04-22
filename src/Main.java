public class Main {
    public static void main(String[] args) {
        DepartementHashSet dhs = new DepartementHashSet();

        Departement d1 = new Departement(1, "IT", 25);
        Departement d2 = new Departement(2, "HR", 15);
        Departement d3 = new Departement(3, "Finance", 10);

        dhs.ajouterDepartement(d1);
        dhs.ajouterDepartement(d2);
        dhs.ajouterDepartement(d3);

        System.out.println("Liste des départements :");
        dhs.displayDepartement();


        System.out.println("\nRecherche de 'HR' : " + dhs.rechercherDepartement("HR"));


        System.out.println("Recherche de d1 : " + dhs.rechercherDepartement(d1));


        dhs.supprimerDepartement(d2);
        System.out.println("\nAprès suppression de HR :");
        dhs.displayDepartement();

        System.out.println("\nTri par ID :");
        for (Departement d : dhs.trierDepartementById()) {
            System.out.println(d);
        }
    }
}
