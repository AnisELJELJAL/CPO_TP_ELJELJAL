package Armes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anis_
 */
public class Baton extends Armes {
    int age;
    
    public Baton (String unNom, int unNiveauAttaque){
        super(unNom, unNiveauAttaque);
        age=unAge;
        if (unAge>100){
            age=100;
        }else if(unAge<0){
            age=0;
        }
    }

// @Override
    public String toString () {
        String chaine_a_retourner;
        chaine_a_retourner = "{Baton: "+unNom+ ", Niveau d'attaque: "+ unNiveauAttaque + ", Age: "+unAge+"}";
        return chaine_a_retourner ;     
    }
}
