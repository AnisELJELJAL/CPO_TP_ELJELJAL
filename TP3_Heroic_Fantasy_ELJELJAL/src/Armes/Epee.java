package Armes;




public class Epee extends Armes {
    private int finesse;

    public Epee(String unNom, int unNiveauAttaque,int finesse) {
        super(unNom, unNiveauAttaque);
        finesse=uneFinesse;
        if (uneFinesse>100){
            finesse=100;
        }else if(uneFinesse<0){
            finesse=0;
        }
    }
    
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = "{Epee: "+UnNom+ ", Niveau d'attaque: "+ unNiveauAttaque+ ", Finesse: "+ finesse+"}";
        return chaine_a_retourner ;     
    }
}
    

