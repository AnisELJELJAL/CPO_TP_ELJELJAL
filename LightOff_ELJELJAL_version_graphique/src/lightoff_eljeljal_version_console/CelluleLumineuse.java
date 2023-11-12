package lightoff_eljeljal_version_console;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anis_
 */
  
   public class CelluleLumineuse {
    private boolean etat;
    /**
     * Constructeur par défaut qui initialise l'état de la cellule
     * en le mettant à "éteinte" (false).
     */
    public CelluleLumineuse(boolean unEtat) {
        etat = unEtat;
    }
    /**
     * Permet d'activer la cellule en la mettant dans l'état "allumée" (true).
     */
    public void activerCellule() {
        etat = true;
    }
    /**
     * Permet d'éteindre la cellule en la mettant dans l'état "éteinte" (false).
     */
    public void eteindreCellule() {
        etat = false;
    }
    /**
     * Vérifie si la cellule est actuellement éteinte.
     * Elle renvoie true si la cellule est éteinte et false si elle est allumée.
     */
    public boolean estEteint() {
        return !etat;
    }
    /**
     * Renvoie l'état actuel de la cellule.
     */
    public boolean getEtat() {
        return etat;
    }
    /**
     * Affiche l'état de la cellule de manière lisible. Si la cellule est allumée,
     * elle affiche "X", et si la cellule est éteinte, elle affiche "O".
     */
    @Override
    public String toString() {
        return etat ? "X" : "O";
    }
}