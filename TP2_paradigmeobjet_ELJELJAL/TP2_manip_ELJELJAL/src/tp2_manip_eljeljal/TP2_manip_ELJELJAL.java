/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_eljeljal;

/**
 *
 * @author anis_
 */
public class TP2_manip_ELJELJAL {

public static void main(String[] args) {
        // TODO code application logic here
    Tartiflette assiette1 = new Tartiflette(500) ;
    Tartiflette assiette2 = new Tartiflette(600) ;
    Tartiflette assiette3 = assiette2 ; 
    
    System.out.println("nb de calories de Assiette 2 : " + 
    assiette2.nbCalories) ;
    System.out.println("nb de calories de Assiette 3 : " + 
    assiette3.nbCalories) ;
    
    Moussaka[] moussakaReferences = new Moussaka[10];
    for (int i = 0; i < 10; i++) {
        moussakaReferences[i] = new Moussaka((i + 1) * 100); // Utiliser une valeur arbitraire pour les calories
    }
    for (int i = 0; i < 10; i++) {
            System.out.println("Référence " + (i + 1) + ":");
            System.out.println("Nombre de calories : " + moussakaReferences[i].nbCalories);
          
    }
    
}
}

    

