import java.util.Scanner;

public class ProjectTest {
    static Scanner scanner = new Scanner(System.in);

    public static int menu() {

        int choix;
        effacerEcran();
        separateur();
        do {
            System.out.println("----------------------MENU PRINCIPAL-----------------------");
            System.out.println("1. Creer un groupe d'etudiants");
            System.out.println("2. Ajouter un etudiant dans un groupe");
            System.out.println("3. Afficher la liste des etudiants d'un groupe");
            System.out.println("4. Afficher les étudiants ayant une moyenne >=10");
            System.out.println("5. Calculer le nombre des étudiants de chaque groupe");
            System.out.println("6. Calculer le nombre total des étudiants");

            System.out.println("5. Ajouter un etudiant dans une liste");
            System.out.println("6. Afficher la liste des etudiants d'une liste");
            System.out.println("7. Afficher les etudiants ayant une moyenne superieure a 10");
            System.out.println("0. Quitter");
            System.out.println(" Entrer votre choix : ");
            choix = scanner.nextInt();

            if (choix < 1 || choix > 8) {
                System.out.println("Choix invalide!!!");
                System.out.println("Veuillez entrer un choix valide");
            }

        } while (choix < 1 || choix > 8);

        return choix;
    }

    // private static GroupeEtudiant grp;

    public static void Application() {
        ProjectTest.effacerEcran();

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
                effacerEcran();
                separateur();
                System.out.println("1. Creer un groupe d'etudiants");
                GroupeEtudiant grp = new GroupeEtudiant();
                grp.creerGroupe();
                System.out.println(grp);
                pause();
                break;

            case 2:
                effacerEcran();
                separateur();
                System.out.println("2. Ajouter un etudiant dans un groupe");
                Etudiant etudiant = new Etudiant();
                etudiant.saisirEtudiant();
                etudiant.afficherEtudiant();
                // grp.ajouterEtudiant(etudiant);
                // grp.afficherEtudiantsGroupe();
                pause();
                // ajouterEtudiantGroupe();
                break;
            case 3:
                effacerEcran();
                separateur();
                System.out.println("Afficher la liste des étudiants d’un groupe");
                grp.afficherEtudiantsGroupe();
                pause();
                break;
            case 4:
                effacerEcran();
                separateur();
                System.out.println("Afficher les étudiants ayant une moyenne >=10");
                grp.afficherEtudiantsMoyenneSup10();
                pause();
                break;
            case 5:
                effacerEcran();
                separateur();
                System.out.println("Calculer le nombre des étudiants de chaque groupe");
                System.out.println(grp.getNombreEtudiants());
                pause();
                break;
            case 6:
                effacerEcran();
                separateur();
                System.out.println("6. Calculer le nombre total des étudiants");
                System.out.println(GroupeEtudiant.getNombreTotalEtudiants());

                // Implement afficherEtudiantsListe() method
                pause();
                break;
            case 7:
                effacerEcran();
                separateur();
                // Implement aff() method
                pause();
                break;
            case 8:
                effacerEcran();
                separateur();
                // Implement afficherEtudiantsListe() method
                pause();
                break;
            case 9:
                effacerEcran();
                separateur();
                // Implement aff() method
                pause();
                break;
            case 10:
                effacerEcran();
                separateur();
                // Implement afficherEtudiantsListe() method
                pause();
                break;
            case 11:
                effacerEcran();
                separateur();
                // Implement aff() method
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
