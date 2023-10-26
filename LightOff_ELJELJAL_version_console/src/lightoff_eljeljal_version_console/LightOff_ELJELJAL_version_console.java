/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightoff_eljeljal_version_console;




public class LightOff_ELJELJAL_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CelluleLumineuse lampe1 = new CelluleLumineuse(false);  
        CelluleLumineuse lampe2 = new CelluleLumineuse(false);  

        System.out.println("Etat initial de lampe1 : " + lampe1.toString());
        System.out.println("Etat initial de lampe2 : " + lampe2.toString());

        lampe1.activerCellule();
        lampe2.activerCellule();

        System.out.println("Nouvel etat de lampe1 : " + lampe1.toString());
        System.out.println("Nouvel etat de lampe2 : " + lampe2.toString());

        boolean etatLampe1 = lampe1.getEtat();
        System.out.println("Etat de lampe1 : " + etatLampe1);

        boolean etatLampe2 = lampe2.getEtat();
        System.out.println("Etat de lampe2 : " + etatLampe2);
        
        
        GrilleDeJeu grille = new GrilleDeJeu(7, 7);
        grille.melangerMatriceAleatoirement(20);
        System.out.println(grille);
        
    }
    
    
 }

        
   