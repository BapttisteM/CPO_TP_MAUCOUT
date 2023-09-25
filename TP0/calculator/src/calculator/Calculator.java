/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.util.Scanner;

/**
 *Baptiste
 * Maucout
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println();
       System.out.println("\n Please enter the operator: \n 1) add \n 2) substract \n 3) multiply \n 4) divide \n 5) modulo");// TODO code application logic here
       
       int operateur;
       Scanner sa = new Scanner(System.in);
       System.out.println(" Entrer une valeur entre 1 et 5 :");
       operateur=sa.nextInt(); // On demande a sc de donner le prochain entier
       while (operateur >5 || operateur<1){
           System.out.println(" Entrer une valeur entre 1 et 5 :");
            operateur=sa.nextInt();  
           
       }
        
           
       
       int operand1;
       Scanner sc = new Scanner(System.in);
       System.out.println("\n Entrer un nombre :");
       operand1=sc.nextInt(); // On demande a sc de donner le prochain entier
       System.out.println(operand1);
       
       
       int operand2;
       Scanner sb = new Scanner(System.in);
       System.out.println("\n Entrer une nombre :");
       operand2=sb.nextInt(); // On demande a sc de donner le prochain entier
       System.out.println(operand2);
       
       int resultat=0;
    
       
       if (operateur==1){
         resultat= operand1+operand2;
       }
       
       if (operateur==2){
          resultat=operand1-operand2;}
       
       if (operateur==3){
         resultat=operand1*operand2;}
      
       if (operateur==4){
         resultat=operand1/operand2;}
      
       if (operateur==5){
         resultat=operand1%operand2;}
       
       System.out.println("Le resultat est egale a:" +resultat);

       
       
    }
    
}
