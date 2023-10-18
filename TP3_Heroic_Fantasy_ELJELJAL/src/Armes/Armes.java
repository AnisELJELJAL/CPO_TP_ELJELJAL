/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

abstract public class Armes {
    String nom;
    int nvAttaque;

    public Armes(String UnNom, int UnNvAttaque) {
        this.nom = UnNom;
        this.nvAttaque = UnNvAttaque;
        if (UnNvAttaque>100){
            nvAttaque=100;
       } 
        else if (UnNvAttaque<0){
            nvAttaque=0;  
        }
       
        
    }

    @Override
    public String toString() {
        return "Armes{nom=" + nom + ", nvAttaque=" + nvAttaque + '}';
    }
    

    public int getNvAttaque() {
        return nvAttaque;
    }

    public String getNom() {
        return nom;
    }
    
    
    
}
