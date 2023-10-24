package Personnage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anis_
 */
abstract public class Personnage {
    String NomPerso;
    int Vie;
    ArrayList<Armes> inventaire = new ArrayList<Armes>();
    Armes arme_en_main;

    public Personnage(String NomPerso, int Vie) {
        nom = NomPerso;
        if (niv_vie < 0) {
        this.NomPerso = NomPerso;
        } else {
        this.Vie = Vie;
        arme_en_main = null;
    }
        
    
}
     public void ajouterArme (Armes arme_a_ajouter){
        if (inventaire.size()<5){
            inventaire.add(arme_a_ajouter);           
        }
    }
    
    public Armes getArme_en_main(){
        return arme_en_main;
    }
    
    public void EquipArme(String uneArme){
        for (int i=0; i<inventaire.size();i++){
            if (inventaire.get(i).getNom().equals(uneArme)){
                arme_en_main=inventaire.get(i);
                System.out.println("L'arme a bien ete affecte");
            }else{
                System.out.println("L'arme n'a pas ete trouvé");
            }
        }
    }
     @Override
    public String toString(){
        String chaine;
        chaine = "{Personnage: "+NomPerso+" Niveau de vie: "+Vie+"}";
        return chaine;
    }
    
}
