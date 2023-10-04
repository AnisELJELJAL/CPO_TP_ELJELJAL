/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_eljeljal;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author anis_
 */
public class TP1_guessMyNumber_ELJELJAL {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        // Créez un objet Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);
        Random generateurAleat = new Random();
        
        int n = generateurAleat.nextInt(100);
        
        System.out.println("Saisissez votre nombre :");
       
        boolean aTrouve = false;
        int tentative = 0;
        
        while (!aTrouve) { // Inversez la condition pour que la boucle s'exécute correctement
            // Lisez l'entrée de l'utilisateur
            int choice = scanner.nextInt();
 
            if (choice < n) {
                System.out.println("Trop petit");
            }
            else if (choice > n){
                System.out.println("Trop grand");
            }     
            else {
                System.out.println("Gagne !");
                aTrouve = true;
            }
            tentative++;
        }

        // Fermez le scanner
        scanner.close();
    }
}

