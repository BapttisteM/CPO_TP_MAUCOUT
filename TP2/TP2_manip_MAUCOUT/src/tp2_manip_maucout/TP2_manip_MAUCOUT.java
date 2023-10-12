/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_maucout;

/**
 *
 * @author User
 */
public class TP2_manip_MAUCOUT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Tartiflette assiette1 = new Tartiflette(500) ;
Tartiflette assiette2 = new Tartiflette(600) ;
Tartiflette assiette3 = assiette2 ; 
//on a cree seulement deux objets car il n'y a que deux new

assiette2 = assiette1;
assiette1=assiette3;

System.out.println("nb de calories de Assiette 2 : " +
assiette2.nbCalories) ;
System.out.println("nb de calories de Assiette 3 : " +
assiette3.nbCalories) ;

//Moussaka assiette666 = assiette1 ;
//Moussaka assiette667 = new Tartiflette() ;  Les deux lignes sont fausses car les references ne vont pas aux bons objets


Moussaka assiette4 = new Moussaka(770);
Moussaka assiette5 = new Moussaka(470);
Moussaka assiette6 = new Moussaka(300);
Moussaka assiette7 = new Moussaka(670);
Moussaka assiette8 = new Moussaka(240);
Moussaka assiette9 = new Moussaka(800);
Moussaka assiette10 = new Moussaka(700);
Moussaka assiette11= new Moussaka(365);
Moussaka assiette12 = new Moussaka(350);
Moussaka assiette13= new Moussaka(400);


System.out.println("nb de calories des assiettes de la 4eme a la 13eme:\n" + assiette4.nbCalories + "\n" +assiette5.nbCalories + "\n" + assiette6.nbCalories + "\n"+assiette7.nbCalories +"\n"+assiette8.nbCalories +"\n"+assiette9.nbCalories +"\n"+ assiette10.nbCalories + "\n"+assiette11.nbCalories+ "\n" + assiette12.nbCalories +"\n"+ assiette13.nbCalories);
    }
    
}
