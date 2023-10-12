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
    
    public void lireEtiquette() {
System.out.println("Bouteille de " + nom +" (" + degreAlcool +
 " degres) \nBrasserie : " + brasserie ) ;

}

    
    
    
}
