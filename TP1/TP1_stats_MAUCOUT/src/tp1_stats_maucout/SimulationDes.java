/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_maucout;

/**
 *
 * @author User
 */


    /**
     * @param args the command line arguments
     */
    import java.util.Random;
    import java.util.Scanner;

public class SimulationDes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int[] resultatDes = new int[6];

        
        System.out.print("Entrez un nombre entier m : ");
        int m = scanner.nextInt();

        Random generateurAleat = new Random();

        
        for (int i = 0; i < m; i++) {
       
            
            int resultatLancer = generateurAleat.nextInt(6);
       
            resultatDes[resultatLancer]++;
        }

       
        System.out.println("Résultats des lancers de dés (en pourcentage) :");
        for (int i = 0; i < 6; i++) {
            double pourcentage = (resultatDes[i] * 100.0) / m;
            System.out.println("Face " + (i + 1) + " : " + pourcentage + "%");
        }
    }
}

    

