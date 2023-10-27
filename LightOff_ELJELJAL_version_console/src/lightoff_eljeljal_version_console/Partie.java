package lightoff_eljeljal_version_console;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anis_
 */


public class Partie {
    private GrilleDeJeu grille;
    private int nbCoups;

    public Partie() {
        grille = new GrilleDeJeu(7, 7); // Spécifiez les dimensions de la grille
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

        while (!grille.cellulesToutesEteintes()) {
            nbCoups++;
            System.out.println("Coup n°" + nbCoups);
            
            // Demande d'un coup au joueur
            System.out.print("Veuillez entrer un coup (ligne, colonne ou diagonale) : ");
            String coup = scanner.nextLine();
            
            
            // Affichage de l'état de la grille mis à jour
            System.out.println("État de la grille après le coup n°" + nbCoups + " :");
            System.out.println(grille);
        }

        System.out.println("Felicitations, vous avez eteint toutes les cellules en " + nbCoups + " coups!");
        scanner.close();
    }

    // Ajoutez d'autres méthodes et fonctionnalités spécifiques à votre jeu ici
}

    
        
    

    


