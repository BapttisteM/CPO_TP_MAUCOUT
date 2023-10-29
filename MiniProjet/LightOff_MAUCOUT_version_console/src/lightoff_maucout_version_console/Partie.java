/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_maucout_version_console;

/**
 * la classe partiee représente une partie du jeu LightOff. Cette classe facilite l'interaction
entre le joueur et la grille, permettant de jouer au jeu LightOff.
 * @author User
 */

    import java.util.Scanner;


public class Partie {
    // Attributs
    public GrilleDeJeu grille;
    public int nbCoups;

    // Constructeur

    /**
     *cree la grille de jeu et initialise le nb de coups a 0
     */
    public Partie() {
        this.grille = new GrilleDeJeu(2,2);  
        this.nbCoups = 0;
    }

    

    /**
     *melange 10 fois la grille pour avoir le tableau de jeu
     */
    public void initialiserPartie() {
        grille.melangerMatriceAleatoirement(10);  
    }

    

    /**
     *Demarre la partie en communicant la grille au joueur et en lui demandant les actions a realiser.
     * il entre un chiffre entre 1 et 4 afin d'effectuer les differentes actions.
     * il y a une boucle while qui ne s'arrete pas tant que partie terminee ne renvoie pas true.
     * Il y a un compteur de coups qui prend plus un a cheques repetitions de la boucle 
     * Il y a ensuite une condition qui verifie qu touts les cellules de la boucles sont etteintes. si ou alors partie terminee prend true et la partie se termine sinon la boucle continue
     */
    public void lancerPartie() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenue dans le jeu LightOff!");
        boolean partieterminee = false;
        int choix;
        int ligne;
        int colonne;
        grille.melangerMatriceAleatoirement(10);

        while (!partieterminee) {
            System.out.println("État actuel de la grille :");
            
            System.out.println(grille.toString());

            // Demander un coup au joueur
            System.out.println("Choisissez entre: \n1)colonne \n 2)ligne  \n3)diagonale descendante \n4)diagonale montante \nPour choisir entrez 1,2,3 ou 4");
            choix= scanner.nextInt();
            
            switch(choix){
                case 1:
                    System.out.println("Choisissez la colonne a inverser");
                    ligne= scanner.nextInt();
                grille.activerColonneDeCellules(ligne);
                break;
                
                case 2:
                    System.out.println("Choisissez la ligne a inverser");
                    colonne= scanner.nextInt();
                grille.activerLigneDeCellules(colonne);
                break;
                
                case 3:
                    grille.activerDiagonaleDescendante();
                break;
                
                case 4:
                    grille.activerDiagonaleMontante();
                break;
                
                default:
                    System.out.println("La valeur saisie n'est pas compatible");
                }
            

            
            // Incrémenter et afficher le nombre de coups
            nbCoups++;
            System.out.println("Nombre de coups : " + nbCoups);

            // Afficher l'état mis à jour de la grille
            System.out.println(grille.toString());
            
            if(grille.cellulesToutesEteintes()){
                partieterminee=true;
            }
        }

        System.out.println("Félicitations! Vous avez éteint toutes les cellules en " + nbCoups + " coups.");
        scanner.close();
    }
}

    

