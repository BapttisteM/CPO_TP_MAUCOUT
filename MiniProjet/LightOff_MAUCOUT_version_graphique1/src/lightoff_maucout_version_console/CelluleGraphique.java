/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_maucout_version_console;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;

/**
 *
 * @author User
 */
public class CelluleGraphique extends JButton {
    
    int largeur; // largeur en pixel de la cellule
    int hauteur; // hauteur en pixel de la cellule
    CellulesLumineuses celluleLumineuseAssociee;
 // constructeur (appel� depuis FenetrePrincipale)

    public CelluleGraphique(CellulesLumineuses celluleLumineuseAssociee, int largeur, int hauteur) {
 this.largeur = largeur;
 this.hauteur = hauteur;
 this.celluleLumineuseAssociee = celluleLumineuseAssociee;
 }
 // Methode g�rant le dessin de la cellule
 
    /**
     *
     * @param g
     */
    @Override
   protected void paintComponent(Graphics g) {
 int w = this.getWidth();
 int h = this.getHeight();
 if (celluleLumineuseAssociee.estEteint() == true) {
 g.setColor(Color.red);
 } else {
 g.setColor(Color.yellow);
 }
 g.fillOval(2, 2, w - 4, h - 4);
 }
}

