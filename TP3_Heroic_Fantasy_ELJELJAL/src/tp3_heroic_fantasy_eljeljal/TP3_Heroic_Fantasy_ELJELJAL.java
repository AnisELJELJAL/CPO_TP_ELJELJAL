/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_eljeljal;

import Armes.Epee;
import Armes.Baton;

/**
 *
 * @author anis_
 */
public class TP3_Heroic_Fantasy_ELJELJAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Epee epee1 = new Epee ("Excalibur", 7, 5);
        Epee epee2 = new Epee ("Durandal", 4, 7);
        
        Baton baton1 = new Baton("Chêne",4,5);
        Baton baton2 = new Baton ("Charme", 5, 6);
        
        ArrayList<Armes> tabArme = new ArrayList<Armes>();
        tabArme.add(epee1);
        tabArme.add(epee2);
        tabArme.add(baton1);
        tabArme.add(baton2);
         for (int i=0; i<4;i++){
            System.out.print(tabArme.get(i));
        }
        System.out.println();
    }
    
}
