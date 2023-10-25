/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightoff_maucout_version_console;

/**
 *
 * @author User
 */
public class LightOff_MAUCOUT_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
     CellulesLumineuses Cellule1 = new CellulesLumineuses(true);   
     CellulesLumineuses Cellule2 = new CellulesLumineuses(false);  
     CellulesLumineuses Cellule3 = new CellulesLumineuses(true); 
     
     boolean etat1 =Cellule1.getEtat();
     
     
     Cellule2.activerCellule();
     Cellule2.toString();
     
    }
    
}
