/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_eljeljal_version_console;
import java.util.Random;

/**
 *
 * @author anis_
 */
public class GrilleDeJeu {
    private CelluleLumineuse[][] matriceCellules;
    private int nbLignes;
    private int nbColonnes;

    public GrilleDeJeu(int nbLignes, int nbColonnes) {
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];

        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j] = new CelluleLumineuse(false);
            }
        }
    }

    /**
     * elle sert a eteindre toute les cellules de la grille
     */
    public void eteindreToutesLesCellules() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }

    /**
     *Active une ligne colonne ou diagonale aleatoire
     */
    public void activerLigneColonneOuDiagonaleAleatoire() {
        Random random = new Random();
        int choix = random.nextInt(3);

        switch (choix) {
            case 0:
                int ligneAleatoire = random.nextInt(nbLignes);
                activerLigneDeCellules(ligneAleatoire);
                break;
            case 1:
                int colonneAleatoire = random.nextInt(nbColonnes);
                activerColonneDeCellules(colonneAleatoire);
                break;
            default:
                if (random.nextBoolean()) {
                    activerDiagonaleMontante();
                } else {
                    activerDiagonaleDescendante();
                }   break;
        }
    }

    /**
     * melange les matrices aleatoirement
     * @param nbTours
     */
    public void melangerMatriceAleatoirement(int nbTours) {
        eteindreToutesLesCellules();

        for (int tour = 0; tour < nbTours; tour++) {
            activerLigneColonneOuDiagonaleAleatoire();
        }
    }

    /**
     * Active les lignes des celulles
     * @param idLigne
     */
    public void activerLigneDeCellules(int idLigne) {
        for (int j = 0; j < nbColonnes; j++) {
            matriceCellules[idLigne][j].activerCellule();
        }
    }
    public void desactiverLigneDeCellules(int idLigne) {
        for (int j = 0; j < nbColonnes; j++) {
            matriceCellules[idLigne][j].eteindreCellule();
        }
    }
    public void activerDesactiverLigneDeCellules(int idLigne) {
        for (int j = 0; j < nbColonnes; j++) {

            if (matriceCellules[idLigne][j].getEtat())
            {
                matriceCellules[idLigne][j].eteindreCellule();
            }
            else
            {
                matriceCellules[idLigne][j].activerCellule();
            }
        }
    }
    public void activerDesactiverColonneDeCellules(int idColonne) {
        for (int i = 0; i < nbLignes; i++) {
            System.out.println ("i = " +i);
System.out.println ("Colone = "+ idColonne);
System.out.println ("etat = " + matriceCellules[i][idColonne].getEtat());
            if (matriceCellules[i][idColonne].getEtat() == true) {
                matriceCellules[i][idColonne].eteindreCellule();
            }
            else
            {
                matriceCellules[i][idColonne].activerCellule();
            }
        }
    }
    public CelluleLumineuse getColLigne (int ligne, int col)
    {
        return matriceCellules[ligne][col];
    }
    /**
     * activer colonne de cellule
     * @param idColonne
     */
    public void activerColonneDeCellules(int idColonne) {
        for (int i = 0; i < nbLignes; i++) {
            matriceCellules[i][idColonne].activerCellule();
        }
    }
    public void desactiverColonneDeCellules(int idColonne) {
        for (int i = 0; i < nbLignes; i++) {
            matriceCellules[i][idColonne].eteindreCellule();
        }
    }

    /**
     * activer une diagonale descendante
     */
    public void activerDiagonaleDescendante() {
        for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
            matriceCellules[i][i].activerCellule();
        }
    }

    /**
     * activer une diagonale montante
     */
    public void activerDiagonaleMontante() {
        for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
            matriceCellules[i][nbColonnes - 1 - i].activerCellule();
        }
    }
    public void desactiverDiagonales(int coup) {

        for (int ligne = 0, a = coup, b = coup; ligne < nbLignes; ++ ligne)
        {
            if (a >= 0)
            {
                if (matriceCellules[a][ligne].getEtat())
                {
                    matriceCellules[a][ligne].eteindreCellule();
                }
                else
                {
                    matriceCellules[a][ligne].activerCellule();
                }
                --a;
            }
            if (b <= (nbColonnes - 1))
            {
                if (matriceCellules[b][ligne].getEtat())
                {
                    matriceCellules[b][ligne].eteindreCellule();
                }
                else
                {
                    matriceCellules[b][ligne].activerCellule();
                }
                ++b;
            }
        }
    }


    /**
     * permet d'eteindre les celulles
     * @return
     */
    public boolean cellulesToutesEteintes() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                if (matriceCellules[i][j].getEtat()) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Permet d'afficher la grille
     * @return
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        // Affichage des indices des colonnes
        sb.append("  ");
        for (int j = 0; j < nbLignes; j++) {
            sb.append("|").append(" ").append(j).append(" ");

        }
        sb.append("|\n");

        for (int i = 0; i < nbColonnes; i++) {
            // Affichage de l'indice de la ligne
            for (int k = 0; k < nbLignes; k++) {
                sb.append("----");
            }
            sb.append("---\n");
            sb.append(i).append(" ");
            for (int j = 0; j < nbLignes; j++) {
                sb.append("|").append(" ").append(matriceCellules[i][j]).append(" ");
            }
            sb.append("|\n");


        }
        return sb.toString();
    }
}

    

