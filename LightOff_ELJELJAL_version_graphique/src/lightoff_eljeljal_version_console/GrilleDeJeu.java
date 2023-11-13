package lightoff_eljeljal_version_console;



import java.util.Random;

public class GrilleDeJeu {
    CelluleLumineuse[][] matriceCellules;
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
                    activerDesactiverDiagonaleMontante();
                } else {
                    activerDesactiverDiagonaleDescendante();
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
    
    /**
     * permet d'activer et desactiver les lignes de nos cellules
     * @param idLigne
     */
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

    /**
     * permet d'activer et desactiver nos colonne de cellules 
     * @param idColonne
     */
    public void activerDesactiverColonneDeCellules(int idColonne) {
        for (int i = 0; i < nbLignes; i++) {
            if (matriceCellules[i][idColonne].getEtat())
            {
                
                matriceCellules[i][idColonne].eteindreCellule();
            }
            else
            {
                
                matriceCellules[i][idColonne].activerCellule();
            }
        }
    } 

    /**
     * retourne les lignes et colonnes 
     * @param ligne
     * @param col
     * @return
     */
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
    

    //activer une diagonale descendante*/
  public void activerDesactiverDiagonaleDescendante()
  {
      for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) 
      {
          if (matriceCellules[i][i].getEtat())
          {
              matriceCellules[i][i].eteindreCellule();
          }
          else
          {
              matriceCellules[i][i].activerCellule();
          }
      }
  }

    
     
//activer une diagonale montante*/
  public void activerDesactiverDiagonaleMontante() 
  {
      for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) 
      {
          if (matriceCellules[i][nbColonnes - 1 - i].getEtat())
          {
              matriceCellules[i][nbColonnes - 1 - i].eteindreCellule();
          }
          else
          {
              matriceCellules[i][nbColonnes - 1 - i].activerCellule();
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