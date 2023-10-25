/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_maucout_version_console;

/**
 *représente une cellule lumineuse qui peut être dans l'état
  "allumée" ou "éteinte".
 * @author User
 */
public class CellulesLumineuses {
   private boolean etat= true;
   
 public CellulesLumineuses(boolean etat){
    etat = false;
}

    /**
     *Permet de faire changer l'etat d'une cellule en fonction deson etat actuel
     * s'il etait false il ressort true et inverssement 
     * @param 
     */
    public void activerCellule(){
        if (etat==true){
            etat= false;
        }
        if(etat==false){
            etat=true;
        }
    
} 

    /**
     *permet d'eteindre la cellule si elle est allumee et de ne rien faire si elle est deja eteinte
     * @param 
     */
    public void eteindreCellule(){
    if(etat==true){
        etat= false;
    }
    
}

    /**
     *permet de verifier si la cellule est eteinte  
     * retourne true si elle est eteinte et false si ele est allumee
     * @param 
     * @return
     */
    public boolean estEteint(){
         if(etat==false){
             return true;
         }
         else{
             return false;
         }
    }
    
    /**
     *permet de donner l'etat de la cellule
     * @return true ou false
     */
    public boolean getEtat(){
        if(etat==true){
            return true;
        }
        else {
            return false;
        }
    }

    /**
     *permet d'afficher l'etat de la cellule
     * @return X ou O
     */
    @Override
    public String toString() {
        if(etat== true){
        System.out.println("X");
    }
        if(etat==false){
          System.out.println("O");
        }
       return null;
    }   
     
    
}
