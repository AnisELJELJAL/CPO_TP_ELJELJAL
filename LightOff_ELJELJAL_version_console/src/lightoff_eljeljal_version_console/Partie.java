package lightoff_eljeljal_version_console;

import java.util.Scanner;

import java.util.Objects;
import java.util.Scanner;

public class Partie {
    public GrilleDeJeu grille;
    private int nbCoups;

    public Partie() {
        grille = new GrilleDeJeu(7, 7); // Spécifiez les dimensions de la grille
        grille.melangerMatriceAleatoirement(20);
        nbCoups = 0;
    }

    /**
     *initialiser la partie
     */
    public void initialiserPartie() {
        grille.melangerMatriceAleatoirement(20); // Vous pouvez spécifier le nombre de tours de mélange
    }

    /**
     *Permet d'afficher les indication de la partie
     */
    public void lancerPartie() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Grille de Jeu :");
        System.out.println(grille);
        System.out.println("Bienvenue dans le jeu LightOff!");
        System.out.println("Voici l'etat initial de la grille :");
        System.out.println(grille);
        String input ;


        int coup;
        String typeCoup;
        while (!grille.cellulesToutesEteintes()) {
            nbCoups++;
            System.out.println("Coup n°" + nbCoups);

            // Demande d'un coup au joueur

            System.out.print("Veuillez entrer un coup (L (ligne), C (Colonne), D (Diagonale) : ");
            typeCoup = scanner.nextLine();
            if (Objects.equals(typeCoup, "L") || Objects.equals(typeCoup, "l")) {
                System.out.println("Quelle ligne eteindre ? : ");
                input = scanner.nextLine();
                coup = Integer.parseInt(input);
                grille.desactiverLigneDeCellules(coup);
            }
            if (Objects.equals(typeCoup, "C") || Objects.equals(typeCoup, "c")) {
                System.out.println("Quelle colonne eteindre ? : ");
                input = scanner.nextLine();
                coup = Integer.parseInt(input);
                grille.desactiverColonneDeCellules(coup);
            }
            if (Objects.equals(typeCoup, "D") || Objects.equals(typeCoup, "d")) {
                System.out.println("Quelle Diagonale eteindre ? Entrez la colonne : ");
                input = scanner.nextLine();
                coup = Integer.parseInt(input);
                grille.desactiverDiagonales(coup);
            }

            // Affichage de l'état de la grille mis à jour
            System.out.println("Etat de la grille après le coup n°" + nbCoups + " :");
            System.out.println(grille);
        }

        System.out.println("Felicitations, vous avez eteint toutes les cellules en " + nbCoups + " coups!");
        scanner.close();
    }
}
    
        
    

    


