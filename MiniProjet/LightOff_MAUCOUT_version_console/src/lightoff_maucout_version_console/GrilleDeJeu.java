/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_maucout_version_console;

import static java.lang.Math.random;
import java.util.Random;

/**
 *  représente une grille de cellules lumineuses. Cette grille est
    constituée de cellules lumineuses organisées en lignes et colonnes
 * @author User
 */
public class GrilleDeJeu {
     CellulesLumineuses[][] matriceCellules;
     int nbLignes;
     int nbColonnes;

    // Constructeur
    public GrilleDeJeu(int p_nbLignes, int p_nbColonnes) {
        nbLignes = p_nbLignes;
        nbColonnes = p_nbColonnes;
        matriceCellules = new CellulesLumineuses[nbLignes][nbColonnes];
        
         for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j] = new CellulesLumineuses(true);
            }
 
   
        
    }    
}
public boolean eteindreToutesLesCellules(){
        
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].eteindreCellule();
            }
        }
        return false;
    }



    
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

    // Méthode pour activer une ligne aléatoire
    public void activerLigneAleatoire() {
        Random random = new Random();
        int ligne = random.nextInt(nbLignes);

        for (int j = 0; j < nbColonnes; j++) {
            matriceCellules[ligne][j].activerCellule();
        }
    }

    // Méthode pour activer une colonne aléatoire
    public void activerColonneAleatoire() {
        Random random = new Random();
        int colonne = random.nextInt(nbColonnes);

        for (int i = 0; i < nbLignes; i++) {
            matriceCellules[i][colonne].activerCellule();
        }
    }

    // Méthode pour activer une diagonale aléatoire
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
public void melangerMatriceAleatoirement(int nbTours){
    eteindreToutesLesCellules();
    for (int i=0; i<nbTours; i++){
        
        activerLigneColonneOuDiagonaleAleatoire();
        
    }
}
public void activerLigneDeCellules(int idLigne){
     
    int ligne = idLigne;
    for (int j = 0; j < nbColonnes; j++) {
            matriceCellules[ligne][j].activerCellule();
        }
    
}
public void activerColonneDeCellules(int idColonnes){
    int ligne = idColonnes;
    for (int j = 0; j < nbLignes; j++) {
            matriceCellules[j][ligne].activerCellule();
        }
}
 public void activerDiagonaleDescendante() {
        for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
            matriceCellules[i][i].activerCellule();
        }
    }

    // Méthode pour activer la diagonale montante
    public void activerDiagonaleMontante() {
        for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
            matriceCellules[i][nbColonnes - i - 1].activerCellule();
        }
    }
    
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




