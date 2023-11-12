/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_maucout_version_console;

import static java.lang.Math.random;
import java.util.Random;
import java.util.Scanner;

/**
 *  représente une grille de cellules lumineuses. Cette grille est
    constituée de cellules lumineuses organisées en lignes et colonnes
 * @author User
 */
public class GrilleDeJeu {
     public CellulesLumineuses[][] matriceCellules;
     int nbLignes;
     int nbColonnes;

    // Constructeur

    /**
     *cree une matrice contenant des cellules lumineuses sur toutes ses lignes et diagonales
     * @param 
     * @param 
     */
    public GrilleDeJeu(int nbLignes1, int nbColonnes1) {
       
        nbLignes = nbLignes1;
        nbColonnes = nbColonnes1;
        matriceCellules = new CellulesLumineuses[nbLignes][nbColonnes];
        
         for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j] = new CellulesLumineuses(true);
            }
 
   
        
    }    
}

    /**
     *parcourt les cases du tableau et renvoie false si chaques cellules est eteinte
     * @return boolean
     */
    public boolean eteindreToutesLesCellules(){
        
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].estEteint();
            }
        }
        return false;
    }

    /**
     *Active une ligne ou une colonne aleatoirement 
     */
    public void activerLigneColonneOuDiagonaleAleatoire() {
        Random random = new Random();
        int choix = random.nextInt(3);  // Génère un nombre aléatoire entre 0 et 2
       

        switch (choix) {
            case 0:
                activerLigneAleatoire();
                break;
            case 1:
                activerColonneAleatoire();
                break;
            case 2:
                activerDiagonaleAleatoire();
                break;
            default:
                // Ne devrait pas arriver, mais tu peux ajouter une gestion d'erreur si nécessaire
                break;
        }
    }

    

    /**
     * active une ligne aléatoire
     */
    public void activerLigneAleatoire() {
        Random random = new Random();
        int ligne = random.nextInt(nbLignes);

        for (int j = 0; j < nbColonnes; j++) {
            matriceCellules[ligne][j].activerCellule();
        }
    }

    

    /**
     *active une colonne aléatoire
     */
    public void activerColonneAleatoire() {
        Random random = new Random();
        int colonne = random.nextInt(nbColonnes);

        for (int i = 0; i < nbLignes; i++) {
            matriceCellules[i][colonne].activerCellule();
        }
    }

    

    /**
     *activer une diagonale aléatoire
     */
    public void activerDiagonaleAleatoire() {
        Random random = new Random();
        int sens = random.nextInt(2);  // 0 pour diagonale de gauche à droite, 1 pour diagonale de droite à gauche

        if (sens == 0) {
            for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
                matriceCellules[i][i].activerCellule();
            }
        } else {
            for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
                matriceCellules[i][nbColonnes - i - 1].activerCellule();
            }
        }
    }

    /**
     *Melange la matrice en appelant la fonction activerLigneColonneOuDiagonaleAleatoire un certain nombre de fois 
     * @param nbTours
     */
    public void melangerMatriceAleatoirement(int nbTours){
    eteindreToutesLesCellules();
    for (int i=0; i<nbTours; i++){
        
        activerLigneColonneOuDiagonaleAleatoire();
        
    }
}

    /**
     *Actives une ligne de cellules
     * @param idLigne
     */
    public void activerLigneDeCellules(int idLigne){
     
    int ligne = idLigne;
    for (int j = 0; j < nbColonnes; j++) {
            matriceCellules[ligne][j].activerCellule();
        }
    
}

    /**
     *Active une colonnes de cellules
     * @param idColonnes
     */
    public void activerColonneDeCellules(int idColonnes){
    int ligne = idColonnes;
    for (int j = 0; j < nbLignes; j++) {
            matriceCellules[j][ligne].activerCellule();
        }
}

    /**
     *Active la diagonale descendante
     */
    public void activerDiagonaleDescendante() {
        for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
            matriceCellules[i][i].activerCellule();
        }
    }

    

    /**
     *Active la diagonale montante
     */
    public void activerDiagonaleMontante() {
        for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
            matriceCellules[i][nbColonnes - i - 1].activerCellule();
        }
    }
    
    /**
     *verifie que les cellules sont eteintes retourne false s'il y en a une allumee et true si elles sont toutes eteintes
     * @return boolean
     */
    public boolean cellulesToutesEteintes() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                if (matriceCellules[i][j].estAllumee()) {
                    return false; // S'il y a au moins une cellule allumée, retourne false
                }
            }
        }
        return true; // Si aucune cellule n'est allumée, retourne true
    }
    
    public boolean cellulesToutesAllumees() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                if (matriceCellules[i][j].estEteint()) {
                    return false; // S'il y a au moins une cellule allumée, retourne false
                }
            }
        }
        return true; // Si aucune cellule n'est allumée, retourne true
    }
 
 
 

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        // Affichage des indices de colonnes
        result.append("  |");
        for (int j = 0; j < nbColonnes; j++) {
            result.append(" ").append(j).append(" |");
        }
        result.append("\n");

        // Affichage de la ligne de séparation
        result.append(new String(new char[4 * nbColonnes + 2]).replace('\0', '-')).append("\n");

        // Affichage des cellules avec indices de lignes
        for (int i = 0; i < nbLignes; i++) {
            result.append(i).append(" |");
            for (int j = 0; j < nbColonnes; j++) {
                result.append(" ").append(matriceCellules[i][j].estAllumee() ? "X" : "O").append(" |");
            }
            result.append("\n");
            // Affichage de la ligne de séparation
            result.append(new String(new char[4 * nbColonnes + 2]).replace('\0', '-')).append("\n");
        }

        return result.toString();
    }

}



