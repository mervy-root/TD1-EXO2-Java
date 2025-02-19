import java.util.ArrayList;
import java.util.List;

public class ListeEtudiant {
    private List<Etudiant> listeEtudiants;
    private String nomListe;

    // nombre total d'etudiants de toutes les liste
    private static int nbTotalEtudiant = 0;

    // nombre de liste cree
    private static int nbListe = 0;

    // Constructeur par defaut et surcharge et constructeur de copie
    public ListeEtudiant() {
        this.listeEtudiants = new ArrayList<Etudiant>();
        this.nomListe = "Liste " + (++nbListe);
    }

    public ListeEtudiant(String nomListe) {
        this.nomListe = nomListe;
        nbListe++;
        this.listeEtudiants = new ArrayList<Etudiant>();
    }

    public ListeEtudiant(ListeEtudiant listeEtudiants) {
        this.listeEtudiants = listeEtudiants.listeEtudiants;
        this.nomListe = listeEtudiants.nomListe;
        nbListe++;
    }

    public ListeEtudiant(List<Etudiant> listeEtudiants) {
        this.listeEtudiants = listeEtudiants;
        this.nomListe = "Liste " + (++nbListe);
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

    // retourne le nombre total d'etudiants de toutes les listes
    public static int getNbTotalEtudiant() {
        return nbTotalEtudiant;
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
