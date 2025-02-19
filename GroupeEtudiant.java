import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GroupeEtudiant {
    private String nomGroupe;
    private int niveauGroupe;
    private int tailleMaxGroupe;
    private Etudiant[] etudiants;

    // Pour connaitre le nombre d'etudiants dans chaque groupe instanciee
    private int nbEtudiantsGroupe = 0;

    // Pour connaitre le nombre de groupe cree
    private static int nbGroupe = 0;
    public static List<GroupeEtudiant> listGroupe = new ArrayList<GroupeEtudiant>();

    // Pour connaitre le nombre total des etudiants de tous les groupes
    private static int nbTotalEtudiantGroupe = 0;

    Scanner scanner = new Scanner(System.in);

    // Constructeur par defaut et surcharge
    public GroupeEtudiant() {
        nomGroupe = "Groupe " + (++nbGroupe);
        niveauGroupe = 1;
        etudiants = new Etudiant[10];
        nbTotalEtudiantGroupe = 0;
        tailleMaxGroupe = 10;

        listGroupe.add(this);
        this.nbEtudiantsGroupe = 0;
    }

    public GroupeEtudiant(int taille) {
        this.nomGroupe = "Groupe " + (++nbGroupe);
        this.niveauGroupe = 1;
        etudiants = new Etudiant[taille];
        tailleMaxGroupe = taille;
        nbTotalEtudiantGroupe = 0;

        listGroupe.add(this);
        this.nbEtudiantsGroupe = 0;
    }

    public GroupeEtudiant(String nomGroupe, int niveauGroupe, int taille) {
        this.nomGroupe = nomGroupe;
        this.niveauGroupe = niveauGroupe;
        this.nbEtudiantsGroupe = 0;
        nbTotalEtudiantGroupe = 0;
        tailleMaxGroupe = taille;

        // listGroupe.add(this);
        etudiants = new Etudiant[taille];
    }

    // Getters & Setters
    public int getNiveauGroupe() {
        return niveauGroupe;
    }

    public String getNomGroupe() {
        return nomGroupe;
    }

    public int getTailleMaxGroupe() {
        return tailleMaxGroupe;
    }

    public void setNiveauGroupe(int niveauGroupe) {
        this.niveauGroupe = niveauGroupe;
    }

    public void setNomGroupe(String nomGroupe) {
        this.nomGroupe = nomGroupe;
    }

    public void setTailleMaxGroupe(int tailleMaxGroupe) {
        this.tailleMaxGroupe = tailleMaxGroupe;
    }

    Scanner sc = new Scanner(System.in);

    // Creer un groupe d'etudiants
    public void creerGroupe() {
        System.out.println("Entrez le nom du groupe: ");
        String str = scanner.nextLine();
        this.setNomGroupe(str);

        System.out.println("Entrez le niveau du groupe : ");
        this.setNiveauGroupe(scanner.nextInt());

        System.out.println("Entrez la taille maximale du groupe : ");
        this.setTailleMaxGroupe(scanner.nextInt());
    }

    // Ajouter un etudiant dans un groupe
    public static void ajouterEtudiant(Etudiant etudiant, String nomGroupe) {
        GroupeEtudiant tmp = GroupeEtudiant.rechercheGroupe(nomGroupe);

        if (tmp != null) {
            if (tmp.etudiants.length > tmp.nbEtudiantsGroupe) {
                tmp.etudiants[tmp.nbEtudiantsGroupe++] = etudiant;
                GroupeEtudiant.nbTotalEtudiantGroupe++;
            } else {
                System.out.println("Le groupe d'etudiants est plein");
            }
        }
        return;
    }

    // Afficher la liste des etudiants d'un groupe
    public void afficherEtudiantsGroupe() {
        for (int i = 0; i < nbEtudiantsGroupe; i++) {
            System.out.println(etudiants[i].toString());
        }
    }

    // Afficher les etudiants ayant une moyenne superieure a 10
    public void afficherEtudiantsMoyenneSup10() {
        for (int i = 0; i < nbEtudiantsGroupe; i++) {
            if (etudiants[i].getMoyenne() > 10) {
                System.out.println(etudiants[i].toString());
            }
        }
    }

    // Calculer le nombre d'etudiants de chaque groupe
    public int getNombreEtudiants() {
        return this.nbEtudiantsGroupe;
    }

    // Calculer le nombre total des etudiants
    public static int getNombreTotalEtudiants() {
        return nbTotalEtudiantGroupe;
    }

    // Rechercher un groupe d'etudiants
    public static GroupeEtudiant rechercheGroupe(String nomGroupe) {
        // GroupeEtudiant tmp;
        for (GroupeEtudiant tmp : GroupeEtudiant.listGroupe) {
            if (tmp.getNomGroupe() == nomGroupe) {
                return tmp;
            }
        }

        System.out.println("Il y'a pas de groupe avec pour nom : " + nomGroupe);
        return null;
    }

    // Description d'un groupe
    public String toString() {
        return "Nom du groupe: " + nomGroupe + "\nNiveau du groupe: " + niveauGroupe + "\nNombre d'etudiants: "
                + nbEtudiantsGroupe;
    }

    public void decrisToi() {
        System.out.println("Nom : " + this.getNomGroupe() + " Niveau : " + this.getNiveauGroupe()
                + " Nombre d'etudiants : " + this.getNombreEtudiants());
    }

    /*
     * public void supprimerEtudiant(int CNE) {
     * for (int i = 0; i < nbEtudiantsGroupe; i++) {
     * if (etudiants[i].getCNE() == CNE) {
     * for (int j = i; j < nbEtudiantsGroupe - 1; j++) {
     * etudiants[j] = etudiants[j + 1];
     * }
     * nbEtudiantsGroupe--;
     * break;
     * }
     * }
     * }
     * 
     * public void afficherEtudiants() {
     * for (int i = 0; i < nbEtudiantsGroupe; i++) {
     * System.out.println(etudiants[i]);
     * }
     * }
     * 
     * public Etudiant chercherEtudiant(int CNE) {
     * for (int i = 0; i < nbEtudiantsGroupe; i++) {
     * if (etudiants[i].getCNE() == CNE) {
     * return etudiants[i];
     * }
     * }
     * return null;
     * }
     * 
     * public float moyenneGroupe() {
     * float moyenne = 0;
     * for (int i = 0; i < nbEtudiantsGroupe; i++) {
     * moyenne += etudiants[i].getMoyenne();
     * }
     * return moyenne / nbEtudiantsGroupe;
     * }
     * 
     * public int getNbEtudiants() {
     * return nbEtudiantsGroupe;
     * 
     * }
     */
}
