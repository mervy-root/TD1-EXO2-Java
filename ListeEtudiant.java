import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListeEtudiant {
    private List<Etudiant> listeEtudiants;
    private String nomListe;
    private int niveau;

    // nombre total d'etudiants de toutes les liste
    private static int nbTotalEtudiant = 0;

    // nombre de liste cree
    private static int nbListe = 0;
    public static List<ListeEtudiant> listListe = new ArrayList<ListeEtudiant>();

    static Scanner scanner = new Scanner(System.in);

    // Constructeur par defaut et surcharge et constructeur de copie
    public ListeEtudiant() {
        this.listeEtudiants = new ArrayList<Etudiant>();
        this.nomListe = "Liste " + (++nbListe);
        ListeEtudiant.listListe.add(this);
        niveau = 1;
    }

    public ListeEtudiant(String nomListe) {
        this.nomListe = nomListe;
        nbListe++;
        niveau = 1;
        this.listeEtudiants = new ArrayList<Etudiant>();
        ListeEtudiant.listListe.add(this);
    }

    public ListeEtudiant(String nomListe, int niveau) {
        this.nomListe = nomListe;
        nbListe++;
        this.niveau = niveau;
        this.listeEtudiants = new ArrayList<Etudiant>();
        ListeEtudiant.listListe.add(this);
    }

    public ListeEtudiant(ListeEtudiant listeEtudiants) {
        this.listeEtudiants = listeEtudiants.listeEtudiants;
        this.nomListe = listeEtudiants.nomListe;
        this.niveau = listeEtudiants.niveau;
        nbListe++;
        ListeEtudiant.listListe.add(this);
    }

    public ListeEtudiant(List<Etudiant> listeEtudiants) {
        this.listeEtudiants = listeEtudiants;
        this.niveau = 1;
        this.nomListe = "Liste " + (++nbListe);
        ListeEtudiant.listListe.add(this);
    }

    // Getters & Setters
    public List<Etudiant> getListeEtudiants() {
        return listeEtudiants;
    }

    public void setListeEtudiants(List<Etudiant> listeEtudiants) {
        this.listeEtudiants = listeEtudiants;
    }

    public String getNomListe() {
        return nomListe;
    }

    public void setNomListe(String nomListe) {
        this.nomListe = nomListe;
    }

    public int getNiveau() {
        return this.niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    // retourne le nombre total d'etudiants de toutes les listes
    public static int getNbTotalEtudiant() {
        return nbTotalEtudiant;
    }

    // methodes
    public void creerListe() {
        System.out.println("Entrez le nom de la liste: ");
        String str = scanner.nextLine();
        this.setNomListe(str);

        System.out.println("Entrez le niveau de la liste : ");
        this.setNiveau(scanner.nextInt());
        scanner.nextLine();
    }

    // Ajouter un etudiant dans un groupe
    public static void ajouterEtudiant() {
        ListeEtudiant tmp = ListeEtudiant.rechercheListe();

        if (tmp != null) {

            Etudiant etudiant = new Etudiant();
            etudiant.saisirEtudiant();
            etudiant.afficherEtudiant();

            tmp.listeEtudiants.add(etudiant);
            ListeEtudiant.nbTotalEtudiant++;
        }

        return;
    }

    public static void afficherEtudiantsListeStatic() {
        ListeEtudiant tmp = ListeEtudiant.rechercheListe();

        if (tmp != null) {
            tmp.afficherEtudiantsListe();
        }
    }

    // Afficher la liste des etudiants d'une liste
    public void afficherEtudiantsListe() {
        for (int i = 0; i < this.listeEtudiants.size(); i++) {
            System.out.println(listListe.get(i).toString());
        }
    }

    public void afficherEtudiantsMoyenneSup10() {
        for (int i = 0; i < this.listeEtudiants.size(); i++) {
            if (listeEtudiants.get(i).getMoyenne() > 10) {
                System.out.println(listeEtudiants.get(i).toString());
            }
        }
    }

    public static void afficherEtudiantsMoyenneSup10Static() {
        ListeEtudiant tmp = ListeEtudiant.rechercheListe();

        if (tmp != null) {
            tmp.afficherEtudiantsMoyenneSup10();
        }
    }

    // Rechercher un groupe d'etudiants
    public static ListeEtudiant rechercheListe() {
        System.out.println("Entrez le nom de la liste des etudiants: ");
        String nomListe = scanner.nextLine();

        for (ListeEtudiant tmp : ListeEtudiant.listListe) {
            if (tmp.nomListe.equals(nomListe)) {
                return tmp;
            }
        }

        System.out.println("Il y'a pas de liste avec pour nom : " + nomListe);
        return null;
    }

    public static void getNombreEtudiantsStatic() {
        for (ListeEtudiant tmp : listListe) {
            System.out.println("\"Nom Liste: " + tmp.getNomListe() + " Niveau : " + tmp.getNiveau()
                    + " Nombre d'etudiants : " + tmp.listeEtudiants.size());
        }
    }

    public static void getNombreTotalEtudiants() {
        System.out.println("Le systeme a: " + ListeEtudiant.getNbTotalEtudiant() + " etudiants de toutes les listes");
    }

    // Description de la liste
    public String toString() {
        return "Nom de la liste: " + nomListe + "\nNiveau de la liste: " + niveau + "\nNombre d'etudiants: "
                + this.listeEtudiants.size();
    }

    public void decrisToi() {
        System.out.println("Nom Liste: " + this.getNomListe() + " Niveau : " + this.getNiveau()
                + " Nombre d'etudiants : " + this.listeEtudiants.size());
    }

}

/*
 * liste.add(myObject);
 * liste.remove(x);
 * liste.get(x);
 * liste.size();
 * liste.clear();
 * liste.isEmpty();
 * liste.contains(myObject);
 * liste.indexOf(myObject);
 * liste.lastIndexOf(myObject);
 * liste.toArray();
 * liste.set(x,myObject);
 */
