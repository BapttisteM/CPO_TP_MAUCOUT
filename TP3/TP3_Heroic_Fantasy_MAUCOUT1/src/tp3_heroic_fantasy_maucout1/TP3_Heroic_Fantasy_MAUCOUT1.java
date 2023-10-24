/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_maucout1;

import Personnages.Personnages;
import Personnages.Magicien;
import Personnages.Guerrier;
import Armes.Epee;
import Armes.Baton;
import Armes.Armes;
import java.util.ArrayList;
import java.util.Arrays;
import Armes.*;
import Personnages.*;
/**
 *
 * @author User
 */
public class TP3_Heroic_Fantasy_MAUCOUT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
Armes epee1 = new Epee( "Excalibur",7,5 );
Armes epee2 = new Epee( "Durandal",4,7);
Armes baton1 = new Baton("Chêne", 4, 5);
Armes baton2 = new Baton("Charme", 5, 6);

 ArrayList<Armes> listeArme = new ArrayList<Armes>();
 listeArme.add(epee1);
 listeArme.add(epee2);
 listeArme.add(baton1);
 listeArme.add(baton2);
 
 
 
 for (int i = 0; i < listeArme.size(); i++) {
            System.out.print(listeArme.get(i));
        }
 

Personnages perso1 = new Magicien("Gandalf",65,true);
Personnages perso2 = new Magicien("Garcimore",44,false);
Personnages perso3 = new Guerrier("Conan", 78,false);
Personnages perso4 = new Guerrier( "Lannister", 45,true);

ArrayList<Personnages> listePerso = new ArrayList<Personnages>();
listePerso.add(perso1);
listePerso.add(perso2);
listePerso.add(perso3);
listePerso.add(perso4);

 for (int i = 0; i < listePerso.size(); i++) {
            System.out.print(listePerso.get(i));
        }



Personnages perso5 = new Magicien("gandoulf",50,true);
Personnages perso6 = new Guerrier("Arthur",90,true);
Armes baton3 = new Baton("BatonDeLaMort",75,30);
Armes baton4 = new Baton("BatonDeLaMortQuiTue",95,50);
Armes baton5 = new Baton("BatonDeLaMortQuiTueVraiment",100,100);

Armes epee3 = new Epee("Excaliburne", 3,5);
Armes epee4 = new Epee("Excalibré", 69,90);
Armes epee5 = new Epee("Aiguille", 93,72);

perso6.Inventaire(baton3);
perso6.Inventaire(epee3);
perso6.Inventaire(epee4);

perso6.ArmeEquipee(epee3);

perso5.Inventaire(baton4);
perso5.Inventaire(baton5);
perso5.Inventaire(epee5);
perso5.ArmeEquipee(baton4);
perso5.Armepref1();
perso6.Armepref();
}
}