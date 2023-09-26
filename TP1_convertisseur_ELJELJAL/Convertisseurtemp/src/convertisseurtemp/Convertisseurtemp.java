/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convertisseurtemp;
/**
 *
 * @author anis_
 */
import java.util.Scanner;
public class Convertisseurtemp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("veuillez saisir la temperature : " );
        double temperature = scanner.nextDouble();
        // TODO code application logic here
        
       // Fermez le scanner
        scanner.close();
        
        System.out.println("temperature : " + temperature);
    }
    
}
