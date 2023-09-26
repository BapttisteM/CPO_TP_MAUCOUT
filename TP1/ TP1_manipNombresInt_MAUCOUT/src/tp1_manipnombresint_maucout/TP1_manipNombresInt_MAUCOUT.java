/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_maucout;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class TP1_manipNombresInt_MAUCOUT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int entier1;
       int entier2;
       int add;
       int soustra;
       int multi;
       int divi;
       int divieucli;
       Scanner sc = new Scanner(System.in);
       System.out.println("Saisir un entier");
       entier1=sc.nextInt();
       System.out.println("\n Saisir un autre entier");
       entier2= sc.nextInt();
       System.out.println("\n Voici vos deux entiers; \n"+entier1 +"\n"+entier2 );
       add= entier1+entier2;
       soustra= entier1-entier2;
       multi = entier1*entier2;
       divi= entier1/entier2;
       divieucli=entier1%entier2;
               
       System.out.println("voici: \nla somme:"+add +"\nla soustraction:"+soustra +" \nla multiplication:"+multi + " \nla division: "+divi+ "\nla division euclidienne:"+divieucli);
    }
    
}
