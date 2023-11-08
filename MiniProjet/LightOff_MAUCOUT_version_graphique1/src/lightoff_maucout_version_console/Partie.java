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
    public int nbCoups ;

    // Constructeur

    /**
     *cree la grille de jeu et initialise le nb de coups a 0
     */
    public Partie() {
        
         
        this.nbCoups = 0;
    }

    

    /**
     *melange 10 fois la grille pour avoir le tableau de jeu
     */
    public void initialiserPartie() {
       for (int i = 0; i < 100; i++){
        grille.activerLigneColonneOuDiagonaleAleatoire();  
      }
    }

    

    /**
     *Demarre la partie en communicant la grille au joueur et en lui demandant les actions a realiser.
     * il entre un chiffre entre 1 et 4 afin d'effectuer les differentes actions.
     * il y a une boucle while qui ne s'arrete pas tant que partie terminee ne renvoie pas true.
     * Il y a un compteur de coups qui prend plus un a cheques repetitions de la boucle 
     * Il y a ensuite une condition qui verifie qu touts les cellules de la boucles sont etteintes. si ou alors partie terminee prend true et la partie se termine sinon la boucle continue
     */
    public void niveauFacile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenue dans le jeu LightOff!");
        boolean partieterminee = false;
        int choix;
        int ligne;
        int colonne;
        grille.melangerMatriceAleatoirement(50);
        

        while (!partieterminee) {
            System.out.println("État actuel de la grille :");
            
            System.out.println(grille.toString());

            // Demander un coup au joueur
            System.out.println("Choisissez entre: \n1)colonne \n2)ligne  \n3)diagonale descendante \n4)diagonale montante \nPour choisir entrez 1,2,3 ou 4");
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
            
            if(grille.cellulesToutesEteintes()) {
                partieterminee=true;
            }
            if (grille.cellulesToutesAllumees()){
                 partieterminee=true;
                
            }
        }

        System.out.println("Félicitations! Vous avez éteint toutes les cellules en " + nbCoups + " coups.");
        scanner.close();
    }
    
   
    
    
    
    
    public void niveauMoyen() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenue dans le jeu LightOff! \n Vous avez choisit le niveau difficile vous avez donc 10 coups pour terminer le niveau");
        boolean partieterminee = false;
        int choix;
        int ligne;
        int colonne;
        grille.melangerMatriceAleatoirement(50);
        
        
        
        while (!partieterminee) {
            System.out.println("État actuel de la grille :");
            
            System.out.println(grille.toString());

            // Demander un coup au joueur
            System.out.println("Choisissez entre: \n1)colonne \n2)ligne  \n3)diagonale descendante \n4)diagonale montante \nPour choisir entrez 1,2,3 ou 4");
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
            
            if(grille.cellulesToutesEteintes()) {
                partieterminee=true;
            }
            if (grille.cellulesToutesAllumees()){
                 partieterminee=true;
                 
           
            }
             if(nbCoups==11){
                partieterminee=true;
            }
        
        }
      if (nbCoups>=11){
          System.out.println("Dommage vous avez fait trop de coups ");
      }
      if (nbCoups<11){

        System.out.println("Félicitations! Vous avez reussi le niveaux moyen en"+nbCoups+"coups");
        scanner.close();
      
      }
    }
    
    
    public void niveauDifficile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenue dans le jeu LightOff! \n Vous avez choisit le niveau difficile vous avez donc 5 coups pour terminer le niveau");
        boolean partieterminee = false;
        int choix;
        int ligne;
        int colonne;
        grille.melangerMatriceAleatoirement(50);
        
        
        
        while (!partieterminee) {
            System.out.println("État actuel de la grille :");
            
            System.out.println(grille.toString());

            // Demander un coup au joueur
            System.out.println("Choisissez entre: \n1)colonne \n2)ligne  \n3)diagonale descendante \n4)diagonale montante \nPour choisir entrez 1,2,3 ou 4");
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
            
            if(grille.cellulesToutesEteintes()) {
                partieterminee=true;
            }
            if (grille.cellulesToutesAllumees()){
                 partieterminee=true;
                 
           
            }
             if(nbCoups==6){
                partieterminee=true;
            }
        
        }
      if (nbCoups>=6){
          System.out.println("Dommage vous avez fait trop de coups ");
      }
      if(nbCoups<6){

        System.out.println("Félicitations! Vous avez reussi le niveaux difficile en"+nbCoups+"coups");
        scanner.close();
      }
      
        
    }
    
    
    public void niveauExtreme() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenue dans le jeu LightOff! \n Vous avez choisit le niveau EXTREME vous avez donc 3 coups pour terminer le niveau");
        boolean partieterminee = false;
        int choix;
        int ligne;
        int colonne;
        grille.melangerMatriceAleatoirement(50);
        
        
        
        while (!partieterminee) {
            System.out.println("État actuel de la grille :");
            
            System.out.println(grille.toString());

            // Demander un coup au joueur
            System.out.println("Choisissez entre: \n1)colonne \n2)ligne  \n3)diagonale descendante \n4)diagonale montante \nPour choisir entrez 1,2,3 ou 4");
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
            
            if(grille.cellulesToutesEteintes()) {
                partieterminee=true;
            }
            if (grille.cellulesToutesAllumees()){
                 partieterminee=true;
                 
           
            }
             if(nbCoups==4){
                partieterminee=true;
            }
        
        }
      if (nbCoups>=4){
          System.out.println("Dommage vous avez fait trop de coups ");
      }
      if(nbCoups<4){

        System.out.println("Félicitations! Vous avez reussi le niveaux EXTREME en"+nbCoups+"coups");
        scanner.close();
      }
        
    }
    
    
    public void choisirNiveau(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez choisir un niveau de difficulte \n1)Facile \n2)Moyens \n3)Difficile \n4)Extreme \nPour choisir il vous suffit de taper 1,2,3 ou 4");
       int choix= scanner.nextInt();
       
       switch(choix){
           case 1:
               niveauFacile();
               break;
           case 2:
               niveauMoyen();
               break;
           case 3:
               niveauDifficile();
               break;
           case 4:
               niveauExtreme();
               break;
               
           default:
               break;
               
        
                   
               
       }
    }
    
public void AfficherMessage(){
     if(grille.cellulesToutesEteintes()) {
         FenetreVictoire f = new FenetreVictoire() ;
          f.setVisible(true) ;
     }
}
}

    

