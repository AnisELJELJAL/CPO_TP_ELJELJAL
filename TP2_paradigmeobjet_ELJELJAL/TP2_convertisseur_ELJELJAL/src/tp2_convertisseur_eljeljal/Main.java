/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseur_eljeljal;

public class Main {
    public static void main(String[] args) {

        Convertisseur a = new Convertisseur();

        System.out.println(a.CelsiusVersFahrenheit(5));
        System.out.println(a.CelsiusVersKelvin(19));
        System.out.println(a.KelvinVersCelsius(1819));
        System.out.println(a.FahrenheitVersCelsius(9));
        System.out.println(a.FahrenheitVersKelvin(1));
        System.out.println(a);

        Convertisseur b = new Convertisseur();

        System.out.println(b.CelsiusVersFahrenheit(5));
        System.out.println(b.CelsiusVersKelvin(19));
        System.out.println(b.KelvinVersCelsius(1819));
        System.out.println(b.FahrenheitVersCelsius(9));
        System.out.println(b.FahrenheitVersCelsius(9));
        System.out.println(b.FahrenheitVersCelsius(9));
        System.out.println(b.FahrenheitVersCelsius(9));
        System.out.println(b);
    }
}