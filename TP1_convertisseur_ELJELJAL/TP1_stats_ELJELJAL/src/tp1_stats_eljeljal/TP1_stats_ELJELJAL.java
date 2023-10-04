/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_eljeljal;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author anis_
 */
public class TP1_stats_ELJELJAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here    public static void main(String[] args) {
          Scanner sc;
      sc = new Scanner(System.in);
      Random generateurAleat = new Random();
      int Tab[] = new int[6];
      System.out.println("\nVeuillez rentrer un nombre entier");
      int nb = sc.nextInt();
      int i = 1;
      for (i=0; i<nb; i++){
       int n = generateurAleat.nextInt(5);
       System.out.println(n);
       Tab[n]+=100.00/nb;
      }
      System.out.println("Voici le Tableau:\n" + Tab[0]+"\n" + Tab[1]+"\n" + Tab[2]+"\n" + Tab[3]+"\n" + Tab[4]+"\n" + Tab[5]);
    }

    }
    
