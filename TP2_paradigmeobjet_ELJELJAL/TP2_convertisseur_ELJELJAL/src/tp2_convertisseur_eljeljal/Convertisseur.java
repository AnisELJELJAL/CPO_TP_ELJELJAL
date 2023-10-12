
package tp2_convertisseur_eljeljal;

public class Convertisseur {
    int nbConversions;

    public Convertisseur () {
        nbConversions = 0 ;
    }



    // Méthodes de conversion de température (déjà définies)
    public  double CelsiusVersKelvin(double tCelsius) {
        nbConversions+= 1;

        return tCelsius + 273.15;
    }

    public  double KelvinVersCelsius(double tKelvin) {
        nbConversions+= 1;

        return tKelvin - 273.15;
    }

    public double FahrenheitVersCelsius(double tFahrenheit) {
        nbConversions += 1;

        return (tFahrenheit - 32) * 5 / 9;
    }

    public double CelsiusVersFahrenheit(double tCelsius) {
        nbConversions+= 1;

        return (tCelsius * 9 / 5) + 32;
    }

    public  double KelvinVersFahrenheit(double tKelvin) {
        double tCelsius = KelvinVersCelsius(tKelvin);
        // On fait deux appels de fonction ici, pour éviter de rajouter +2 à nbConvertions, j'ai donc soustrait 1
        nbConversions -=1;

        return CelsiusVersFahrenheit(tCelsius);
    }

    public  double FahrenheitVersKelvin(double tFahrenheit) {
        double tCelsius = FahrenheitVersCelsius(tFahrenheit);
        // On fait deux appels de fonction ici, pour éviter de rajouter +2 à nbConvertions, j'ai donc soustrait 1
        nbConversions -= 1;

        return CelsiusVersKelvin(tCelsius);
    }

    @Override
    public String toString () {
        return "nb de conversions "+ nbConversions;
    }
}