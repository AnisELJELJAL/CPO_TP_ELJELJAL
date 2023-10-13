/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_eljeljal;

/**
 *
 * @author anis_
 */
public class TP2_Bieres_ELJELJAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",7.0,"Dubuisson") ;
        uneBiere.ouverte= false;
        uneBiere.lireEtiquette(); 
        uneBiere.decapsuler();
        System.out.println(uneBiere);
        BouteilleBiere deuxiemeBiere = new BouteilleBiere("Leffe",6.6,"Abayye de Leffe");
        deuxiemeBiere.ouverte= true;
        deuxiemeBiere.lireEtiquette();
        System.out.println(deuxiemeBiere);
        
        BouteilleBiere troisiemeBiere = new BouteilleBiere();
    }
    
}
