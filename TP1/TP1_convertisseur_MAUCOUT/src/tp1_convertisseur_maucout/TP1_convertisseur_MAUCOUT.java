/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_maucout;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class TP1_convertisseur_MAUCOUT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
     double temp;
     double entier1;
     double tempfin = 0;
     Scanner sc = new Scanner(System.in);
       System.out.println("Saisir un entier");
       temp=sc.nextDouble();
       System.out.println("Choisir la conversion: \n 1)CelciusVersKelvin \n 2)KelvinVersCelcius \n 3)FarenheitVersCelcius \n 4)CelciusVersFarenheit \n 5)KelvinVersFarenheit \n 6)FarenheitVersKelvin");
       entier1=sc.nextDouble(); 
    
    
        
       
    if (entier1 ==1) {
     tempfin= CelciusVersKelvin(temp);}
    if (entier1==2){
        tempfin=KelvinVersCelcius (temp);}
    if (entier1==3){
        tempfin=FarenheitVersCelcius(temp);}
    if (entier1==4){
        tempfin=CelciusVersFarenheit(temp);}
    if (entier1==5){
        tempfin= KelvinVersFarenheit(temp);}
    if (entier1==6){
        tempfin=FarenheitVersKelvin(temp);}
    
    System.out.println("Le resultat est:" +tempfin);
        
    }
 public static double CelciusVersKelvin (double tcelcius) {
double tkelvin= tcelcius +273.15;
return tkelvin;
     
}

 public static double  KelvinVersCelcius (double tkelvin) {
double tcelcius= tkelvin-273.15;
return tcelcius;       
}


public static double  FarenheitVersCelcius (double tfarenheit) {
double tcelcius= (tfarenheit-32)*(5/9);
return tcelcius;       
}

public static double  CelciusVersFarenheit (double tcelcius) {
double tfarenheit= (tcelcius+32)*(1.8);
return tfarenheit;
}

public static double  KelvinVersFarenheit (double tkelvin) {
double tfarenheit= ((tkelvin-273.15)*1.8)+32;
return tfarenheit;

}

public static double  FarenheitVersKelvin (double tfarenheit) {
double tkelvin= (tfarenheit-32)*(1.8)+273.15;
return tkelvin;

}
{
int entier1;
int temp;
int tempfin;
Scanner sc = new Scanner(System.in);
System.out.println("Saisir un entier");
temp=sc.nextInt();
System.out.println("\n Saissisez la convertion que vous voulez effectuer: \n 1) De celcius vers Kelvin \n 1)De Kelvin vers celcius \n 3)De farenheint vers celcius \n 4)De celcius vers farenheit \n 5)De kelvin vers farenheit \n 6)De farenheit vers kelvin");
entier1=sc.nextInt();



}
}