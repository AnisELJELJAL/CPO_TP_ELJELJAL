package Personnage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anis_
 */
public class Magicien extends Personnage{
    boolean conf = true;
    
    public Magicien(String unNomPerso, int uneVie, String uneConf){
        super(unNomPerso, uneVie);
        if (uneConf=="Novice"){
            conf=false;
        }else{
            conf=true;
        }
    }
}
    
