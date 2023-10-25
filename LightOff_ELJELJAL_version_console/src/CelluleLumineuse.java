/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anis_
 */
  
    public class CelluleLumineuse {
    private boolean etat; // L'attribut "etat" est privé

    
    public CelluleLumineuse() {
        etat = false; // Par défaut, la cellule est éteinte
    }

    // Méthode pour activer la cellule (inversion de l'état)
    public void activerCellule() {
        etat = !etat;
    }

    // Méthode pour éteindre la cellule
    public void eteindreCellule() {
        etat = false;
    }

    // Méthode pour vérifier si la cellule est éteinte
    public boolean estEteint() {
        return !etat;
    }

    // Méthode pour obtenir l'état actuel de la cellule
    public boolean getEtat() {
        return etat;
    }

    // Redéfinition de la méthode toString pour afficher l'état de la cellule de manière lisible
    @Override
    public String toString() {
        if (etat) {
            return "X"; // Cellule allumée
        } else {
            return "O"; // Cellule éteinte
        }
    }
    
            
}


    

