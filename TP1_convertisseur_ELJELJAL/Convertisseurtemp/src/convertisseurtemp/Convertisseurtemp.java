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
    public static void main(String[] args) {
        // Créez un objet Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Affichez un message d'accueil
        System.out.println("Bonjour, saisissez une valeur :");
        double valeur = scanner.nextDouble();

        // Affichez le menu des conversions
        System.out.println("Saisissez la conversion que vous souhaitez effectuer :");
        System.out.println("1) De Celcius vers Kelvin");
        System.out.println("2) De Kelvin vers Celcius");
        System.out.println("3) De Fahrenheit vers Celsius");
        System.out.println("4) De Celsius vers Fahrenheit");
        System.out.println("5) De Kelvin vers Fahrenheit");
        System.out.println("6) De Fahrenheit vers Kelvin");

        // Lisez le choix de l'utilisateur
        int choix = scanner.nextInt();

        // Effectuez la conversion en fonction du choix de l'utilisateur
        double resultat = 0;

        switch (choix) {
            case 1:
                resultat = CelsiusVersKelvin(valeur);
                break;
            case 2:
                resultat = KelvinVersCelsius(valeur);
                break;
            case 3:
                resultat = FahrenheitVersCelsius(valeur);
                break;
            case 4:
                resultat = CelsiusVersFahrenheit(valeur);
                break;
            case 5:
                resultat = KelvinVersFahrenheit(valeur);
                break;
            case 6:
                resultat = FahrenheitVersKelvin(valeur);
                break;
            default:
                System.out.println("Choix invalide");
        }

        // Affichez le résultat de la conversion
        System.out.println(valeur + " degre est egal a " + resultat + " degres.");
        
        // Fermez le scanner
        scanner.close();
    }

    // Méthodes de conversion de température (déjà définies)
    public static double CelsiusVersKelvin(double tCelsius) {
        return tCelsius + 273.15;
    }

    public static double KelvinVersCelsius(double tKelvin) {
        return tKelvin - 273.15;
    }

    public static double FahrenheitVersCelsius(double tFahrenheit) {
        return (tFahrenheit - 32) * 5 / 9;
    }

    public static double CelsiusVersFahrenheit(double tCelsius) {
        return (tCelsius * 9 / 5) + 32;
    }

    public static double KelvinVersFahrenheit(double tKelvin) {
        double tCelsius = KelvinVersCelsius(tKelvin);
        return CelsiusVersFahrenheit(tCelsius);
    }

    public static double FahrenheitVersKelvin(double tFahrenheit) {
        double tCelsius = FahrenheitVersCelsius(tFahrenheit);
        return CelsiusVersKelvin(tCelsius);
    }
}
