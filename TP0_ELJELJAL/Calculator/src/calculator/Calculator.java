/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;
import java.util.Scanner;

/**
 *
 * @author anis_
 */
public class Calculator {
    public static void main(String[] args) {
        // Créez un objet Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);
        
        // Affichez le texte d'instructions
        System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) subtract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");

        // Lisez l'entrée de l'utilisateur
        int choice = scanner.nextInt();

        // Utilisez une instruction switch pour afficher le texte correspondant à l'opérateur choisi
        switch (choice) {
            case 1:
                System.out.println("You selected: add");
                break;
            case 2:
                System.out.println("You selected: subtract");
                break;
            case 3:
                System.out.println("You selected: multiply");
                break;
            case 4:
                System.out.println("You selected: divide");
                break;
            case 5:
                System.out.println("You selected: modulo");
                break;
            default:
                System.out.println("Invalid choice");
        }
        // Affichez un message demandant à l'utilisateur de saisir la première valeur
        System.out.print("Please enter the first number: ");

        // Lisez l'entrée de l'utilisateur et stockez-la dans la variable operande1
        double operande1 = scanner.nextDouble();

        // Affichez la valeur saisie par l'utilisateur à des fins de vérification
        System.out.println("Please enter the first number : " + operande1);
        
        // Affichez un message demandant à l'utilisateur de saisir la deuxième valeur
        System.out.print("Please enter the first number: ");
        
        // Lisez l'entrée de l'utilisateur et stockez-la dans la variable operande2
        double operande2 = scanner.nextDouble();

        // Affichez la valeur saisie par l'utilisateur à des fins de vérification
        System.out.println("Please enter the second number : " + operande2);
        // Fermez le scanner
        scanner.close();
    }
}

}

  
