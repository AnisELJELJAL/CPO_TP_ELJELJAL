package lightoff_eljeljal_version_console;


import lightoff_eljeljal_version_console.CelluleLumineuse;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anis_
 */
import java.util.Random;

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
                matriceCellules[i][j] = new CelluleLumineuse();
            }
        }
    }

    public void eteindreToutesLesCellules() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }

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

    public void melangerMatriceAleatoirement(int nbTours) {
        eteindreToutesLesCellules();

        for (int tour = 0; tour < nbTours; tour++) {
            activerLigneColonneOuDiagonaleAleatoire();
        }
    }

    public void activerLigneDeCellules(int idLigne) {
        for (int j = 0; j < nbColonnes; j++) {
            matriceCellules[idLigne][j].activerCellule();
        }
    }

    public void activerColonneDeCellules(int idColonne) {
        for (int i = 0; i < nbLignes; i++) {
            matriceCellules[i][idColonne].activerCellule();
        }
    }

    public void activerDiagonaleDescendante() {
        for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
            matriceCellules[i][i].activerCellule();
        }
    }

    public void activerDiagonaleMontante() {
        for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
            matriceCellules[i][nbColonnes - 1 - i].activerCellule();
        }
    }

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        // Affichage des indices des colonnes
        sb.append("  ");
        for (int j = 0; j < nbColonnes; j++) {
            sb.append(j).append(" ");
        }
        sb.append("\n");
        
        for (int i = 0; i < nbLignes; i++) {
            // Affichage de l'indice de la ligne
            sb.append(i).append(" ");
            
            for (int j = 0; j < nbColonnes; j++) {
                sb.append(matriceCellules[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    
    
}
