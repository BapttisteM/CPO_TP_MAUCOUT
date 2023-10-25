/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_maucout;

/**
 *
 * @author User
 */
public class TP2_Bieres_MAUCOUT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    BouteilleBiere uneBiere = new BouteilleBiere("Cuvee des trolls", 7 , "Dubuisson") ;
    
   
    uneBiere.lireEtiquette();
    uneBiere.Decapsuler();
    System.out.println(uneBiere) ;

    
    BouteilleBiere secondBiere = new BouteilleBiere("Leffe", (float)6.6 , "Abbaye de Leffe" ) ;

   
    secondBiere.lireEtiquette();
    secondBiere.Decapsuler();
    
    
     BouteilleBiere troisBiere = new BouteilleBiere("La bete", 8 , "tire bouchon") ;
     
     troisBiere.lireEtiquette();
     troisBiere.Decapsuler();
     
     BouteilleBiere quatreBiere = new BouteilleBiere("krow", 8 , "Austra") ;
     
     quatreBiere.lireEtiquette();
     quatreBiere.Decapsuler();
     
     BouteilleBiere cinqBiere = new BouteilleBiere("1664", 5, "Noveltie") ;
     
      cinqBiere.lireEtiquette();
     cinqBiere.Decapsuler();
    }
    
}
