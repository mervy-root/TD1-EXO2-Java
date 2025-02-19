import java.util.Scanner;

public class ProjectTest {
    static Scanner scanner = new Scanner(System.in);

    public static int menu() {

        int choix;
        separateur();
        do {
            System.out.println("----------------------MENU PRINCIPAL-----------------------");
            System.out.println("1. Creer un groupe d'etudiants");
            System.out.println("2. Ajouter un etudiant dans un groupe");
            System.out.println("3. Afficher la liste des etudiants d'un groupe");
            System.out.println("4. Afficher les étudiants ayant une moyenne >=10");
            System.out.println("5. Calculer le nombre des étudiants de chaque groupe");
            System.out.println("6. Calculer le nombre total des étudiants de tous les groupes");
            separateur();
            System.out.println("7. Creer une liste d'etudiants");
            System.out.println("8. Ajouter un etudiant dans une liste");
            System.out.println("9. Afficher la liste des etudiants d'une liste");
            System.out.println("10. Afficher les étudiants des listes ayant une moyenne >=10");
            System.out.println("11. Calculer le nombre des étudiants de chaque liste");
            System.out.println("12. Calculer le nombre total des étudiants de toutes les liste");
            System.out.println("0. Quitter");
            System.out.println(" Entrer votre choix : ");
            choix = scanner.nextInt();

            if (choix < 1 || choix > 12) {
                System.out.println("Choix invalide!!!");
                System.out.println("Veuillez entrer un choix valide");
            }

        } while (choix < 0 || choix > 12);

        return choix;
    }

    // private static GroupeEtudiant grp;

    public static void Application() {
        // ProjectTest.Hi

        int choix;
        choix = ProjectTest.menu();

        ProjectTest.choixOperations(choix);
    }

    public static void choixOperations(int choix) {

        switch (choix) {
            case 0:
                System.out.println("MERCI D'AVOIR UTILISER L'APPLICATION !!!");
                System.exit(0);
                break;
            case 1:
                separateur();
                System.out.println("1. Creer un groupe d'etudiants");
                GroupeEtudiant grp = new GroupeEtudiant();
                grp.creerGroupe();
                // System.out.println(grp);
                pause();
                break;

            case 2:
                separateur();
                System.out.println("2. Ajouter un etudiant dans un groupe");
                // scanner.nextLine();
                GroupeEtudiant.ajouterEtudiant();
                pause();
                break;
            case 3:
                separateur();
                System.out.println("3. Afficher la liste des étudiants d'un groupe");
                GroupeEtudiant.afficherEtudiantsGroupeStatic();
                pause();
                break;
            case 4:
                separateur();
                System.out.println("4. Afficher les étudiants ayant une moyenne >=10");
                GroupeEtudiant.afficherEtudiantsMoyenneSup10Static();
                pause();
                break;
            case 5:
                separateur();
                System.out.println("5. Calculer le nombre des étudiants de chaque groupe");
                GroupeEtudiant.getNombreEtudiantsStatic();
                pause();
                break;
            case 6:
                separateur();
                System.out.println("6. Calculer le nombre total des étudiants des groupes");
                System.out.println(
                        "Le systeme a: " + GroupeEtudiant.getNombreTotalEtudiants() + " etudiants de tous les groupes");

                // Implement afficherEtudiantsListe() method
                pause();
                break;
            case 7:
                separateur();
                System.out.println("7. Creer une liste d'etudiants");
                ListeEtudiant list = new ListeEtudiant();
                list.creerListe();
                // Implement aff() method
                pause();
                break;
            case 8:
                separateur();
                System.out.println("8. Ajouter un etudiant dans une liste");
                ListeEtudiant.ajouterEtudiant();
                pause();
                break;
            case 9:
                separateur();
                System.out.println("9. Afficher la liste des etudiants d'une liste");
                ListeEtudiant.afficherEtudiantsListeStatic();
                pause();
                break;
            case 10:
                separateur();
                System.out.println("10. Afficher les étudiants des listes ayant une moyenne >=10");
                ListeEtudiant.afficherEtudiantsMoyenneSup10Static();
                pause();
                break;
            case 11:
                separateur();
                System.out.println("11. Calculer le nombre des étudiants de chaque liste");

                ListeEtudiant.getNombreEtudiantsStatic();
                pause();
                break;
            case 12:
                separateur();
                System.out.println("12. Calculer le nombre total des étudiants de toutes les liste");
                ListeEtudiant.getNombreTotalEtudiants();
                pause();
                break;

            default:
                System.out.println("Choix invalide !!!");
                break;

        }
        int choix1 = 0;
        do {
            System.out.println("Voulez vous continuer (1=Oui 0=Non)...");
            choix1 = scanner.nextInt();
            scanner.nextLine();
        } while (choix1 != 1 && choix1 != 0);

        if (choix1 == 1) {
            Application();
        } else {
            System.exit(0);
        }
    }

    public static void separateur() {
        System.out.println("--------------------------------------------------------------------");
    }

    public static void effacerEcran() {

        for (int i = 0; i < 30; i++) {
            System.out.println();
        }

    }

    public static void pause() {
        System.out.println("Appuyez sur Entrée pour continuer...");
        scanner.nextLine(); // Attend que l'utilisateur appuie sur Entrée
        scanner.nextLine();
        // scanner.nextLine();
    }

    public static void goToMenu() {
    }

}
