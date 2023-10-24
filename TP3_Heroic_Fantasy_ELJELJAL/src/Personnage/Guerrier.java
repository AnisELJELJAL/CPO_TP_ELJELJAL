package Personnage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anis_
 */
public class guerrier extends Personnage {
    boolean Acheval;
   
    public boolean isAcheval(){
        return Acheval;
    }
    public void setAcheval(boolean Acheval){
        this.Acheval = Acheval;
    }
    public guerrier(String nomPersonnage, int niv_vie, boolean confirme) {
        super(nomPersonnage, niv_vie);
    }
}

    

