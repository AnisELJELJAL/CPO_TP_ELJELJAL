/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manipnbr;

/**
 *
 * @author anis_
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Créez un objet Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demandez à l'utilisateur de saisir le premier entier
        System.out.print("Veuillez saisir le premier entier : ");

        // Lisez l'entier saisi par l'utilisateur et stockez-le dans une variable
        int premierEntier = scanner.nextInt();

        // Demandez à l'utilisateur de saisir le deuxième entier
        System.out.print("Veuillez saisir le deuxieme entier : ");

        // Lisez le deuxième entier saisi par l'utilisateur et stockez-le dans une variable
        int deuxiemeEntier = scanner.nextInt();
        // operation des entiers 
        int somme = premierEntier + deuxiemeEntier; 
        int difference = premierEntier - deuxiemeEntier;
        int produit = premierEntier * deuxiemeEntier;
        int quotient = premierEntier / deuxiemeEntier ;
        int reste = premierEntier % deuxiemeEntier ;
        

        // Fermez le scanner
        scanner.close();

        // Affichez les valeurs saisies par l'utilisateur
        System.out.println("Vous avez saisi le premier entier : " + premierEntier);
        System.out.println("Vous avez saisi le deuxieme entier : " + deuxiemeEntier);
        System.out.println("la somme est egale a : " + somme);
        System.out.println("la difference est egale a : " + difference);
        System.out.println("le produit est egale a : " + produit);
        System.out.println("le quotient est egale a : " + quotient);
        System.out.println("le reste est egale a : " + reste);
    }
}
