import java.util.Scanner;

public class Etudiant {
    private final int CNE;
    private String nom;
    private String prenom;
    private float moyenne;
    String adresse;

    private static int nbEtudiants = 0;

    // Constructeur par defaut, surcharge et par recopie
    public Etudiant() {
        CNE = ++nbEtudiants;
        nom = "";
        prenom = "";
        moyenne = 0.0f;
        adresse = "";
    }

    public Etudiant(String nom, String prenom, float moyenne, String adresse) {
        this.CNE = ++nbEtudiants;
        this.nom = nom;
        this.prenom = prenom;
        this.moyenne = moyenne;
        this.adresse = adresse;
    }

    public Etudiant(Etudiant etudiant) {
        this.CNE = etudiant.CNE;
        this.nom = etudiant.nom;
        this.prenom = etudiant.prenom;
        this.moyenne = etudiant.moyenne;
        this.adresse = etudiant.adresse;
    }

    // Getters
    public int getCNE() {
        return CNE;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public float getMoyenne() {
        return moyenne;
    }

    public String getAdresse() {
        return adresse;
    }

    // Methode pour calculer le nombre d'etudiants
    public static int getNbEtudiants() {
        return nbEtudiants;
    }

    // Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setMoyenne(float moyenne) {
        this.moyenne = moyenne;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    Scanner sc = new Scanner(System.in);

    // Affichage
    public void afficherEtudiant() {
        System.out.println("CNE: " + CNE);
        System.out.println("Nom: " + nom);
        System.out.println("Prenom: " + prenom);
        System.out.println("Moyenne: " + moyenne);
        System.out.println("Adresse: " + adresse);
    }

    // Entrer les informations d'un etudiant
    public void saisirEtudiant() {
        System.out.println("Inserer les informations de l'etudiant");
        System.out.println("Nom : ");
        this.setNom(sc.nextLine());
        System.out.println("Prenom : ");
        this.setPrenom(sc.nextLine());
        System.out.println("Moyenne : ");
        this.setMoyenne(sc.nextFloat());
        sc.nextLine();
        System.out.println("Adresse : ");
        this.setAdresse(sc.nextLine());
    }

    public String toString() {
        String str = "CNE: " + CNE + " Nom: " + nom + " Prenom: " + prenom + " Moyenne: " + moyenne + " Adresse: "
                + adresse;
        return str;
    }

}