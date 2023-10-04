/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_maucout;

import java.util.Random;


/**
 *
 * @author User
 */



import java.util.Scanner;

public class JeuDevineNombre {
    public static void main(String[] args) {
        // Initialiser le scanner pour lire l'entrée utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de choisir le niveau de difficulté
        System.out.println("Choisissez le niveau de difficulté :");
        System.out.println("1. Facile");
        System.out.println("2. Normal");
        System.out.println("3. Difficile");

        int choixDifficulte = scanner.nextInt();

        // Définir les paramètres en fonction du niveau de difficulté
        int nombreMax = 100;
        int coupsMax = 0;

        switch (choixDifficulte) {
            case 1:
                coupsMax = 15;
                break;
            case 2:
                coupsMax = 10;
                break;
            case 3:
                nombreMax = 200;
                coupsMax = 9;
                break;
            default:
                System.out.println("Choix de difficulté non valide. Utilisation des paramètres par défaut.");
        }

        // Générer un nombre aléatoire en fonction de la nouvelle plage
        int nombreAleatoire = (int) (Math.random() * (nombreMax + 1));

        // Demander à l'utilisateur de saisir un nombre dans la nouvelle plage
        System.out.print("Devinez le nombre entre 0 et " + nombreMax + " : ");

        // Initialiser le compteur de tentatives
        int tentatives = 0;

        // Utiliser une boucle while pour demander à l'utilisateur de deviner tant qu'il n'a pas trouvé
        while (tentatives < coupsMax) {
            // Lire le nombre saisi par l'utilisateur
            int nombreUtilisateur = scanner.nextInt();

            // Incrémenter le compteur de tentatives
            tentatives++;

            // Comparer le nombre saisi avec le nombre généré aléatoirement
            if (nombreUtilisateur < nombreAleatoire) {
                System.out.println("Trop petit. Essayez encore !");
            } else if (nombreUtilisateur > nombreAleatoire) {
                System.out.println("Trop grand. Essayez encore !");
            } else {
                System.out.println("Félicitations ! Vous avez trouvé le nombre en " + tentatives + " tentatives.");
                break; // Sortir de la boucle si l'utilisateur a trouvé le nombre
            }

            // Afficher des messages d'aide si l'écart est très grand
            if (Math.abs(nombreUtilisateur - nombreAleatoire) > 50) {
                System.out.println("Vraiment trop " + (nombreUtilisateur < nombreAleatoire ? "petit" : "grand") + " !");
            }
        }

        // Afficher un message si le nombre n'a pas été trouvé dans le nombre maximum de coups
        if (tentatives == coupsMax) {
            System.out.println("Désolé, vous avez épuisé tous vos coups. Le nombre était : " + nombreAleatoire);
        }

        // Fermer le scanner
        scanner.close();
    }
}





    
    
    

