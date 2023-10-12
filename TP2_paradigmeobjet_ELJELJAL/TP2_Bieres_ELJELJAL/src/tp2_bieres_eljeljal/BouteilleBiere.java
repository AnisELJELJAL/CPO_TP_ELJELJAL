package tp2_bieres_eljeljal;


/**
 *
 * @author anis_
 */
public class BouteilleBiere {
    String nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte ;
    
    public BouteilleBiere(){
        
    } 
            
    public BouteilleBiere(String inNom, double inDegreAlcool, String inBrasserie){
        nom= inNom;
        degreAlcool= inDegreAlcool;
        brasserie= inBrasserie;
    }
    public boolean decapsuler ()
    {
        if (ouverte != false) {
            ouverte = true;
            return true;
        }
        else {
            System.out.println("Bouteille déjà ouverte.");
            return false;
        }
    }
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom + " (" + degreAlcool + " degrés) Ouverte ? ";
        if (ouverte == true ) {
            chaine_a_retourner += "oui";
        }
        else {
            chaine_a_retourner += "non";
        }
        return chaine_a_retourner ;
    }

    public void lireEtiquette() {
System.out.println("Bouteille de " + nom +" (" + degreAlcool +
 " degres) \nBrasserie : " + brasserie ) ;

}

    
    
    
}
