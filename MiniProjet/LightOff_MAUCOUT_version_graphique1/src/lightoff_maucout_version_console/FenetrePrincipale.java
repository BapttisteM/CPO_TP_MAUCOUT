/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lightoff_maucout_version_console;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import lightoff_maucout_version_console.CelluleGraphique;
import lightoff_maucout_version_console.GrilleDeJeu;
import javax.swing.JFrame;

/**
 *
 * @author User
 */
public class FenetrePrincipale extends javax.swing.JFrame {
    GrilleDeJeu grille;
        
        int nbCoups=0;
       int nbLigne ;
        int nbColonne ; 
        int i;
        int j;
        boolean partieterminee = false;
       
      
    /**
     * Creates new form FenetrePrincipale
     */
    public FenetrePrincipale(int nbLignes, int nbColonnes, int nbCoup ) {
        initComponents();
      nbColonne=nbColonnes;
      nbLigne=nbLignes;
      this.setLocationRelativeTo(null);
      this.setExtendedState(JFrame.MAXIMIZED_BOTH);
     
        
        this.grille = new GrilleDeJeu(nbLignes,nbColonnes);
     //   getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20,
     //   nbColonnes*40, nbLignes*40));
     //   this.pack();
     //   this.revalidate();
         
        
         PanneauGrille.setLayout(new GridLayout(nbLignes, nbColonnes));
         
         initialiserPartie();
         for (int i=0; i < nbLignes; i++) {
         for (int j=0; j < nbColonnes; j++ ) {
         CelluleGraphique bouton_cellule = new CelluleGraphique( grille.matriceCellules[i][j], 50,50);
         PanneauGrille.add(bouton_cellule); // ajout au Jpanel PanneauGrille
 }
         
}
   PanneauBoutonsVerticaux.setLayout(new GridLayout(nbLignes, 1));
   //  getContentPane().add(PanneauBoutonsVerticaux, new
    //org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1 * 40, nbLignes * 40));
    // this.pack();
    // this.revalidate();
    
     PanneauBoutonsHorizontaux.setLayout(new GridLayout(1, nbColonnes));
  //   getContentPane().add(PanneauBoutonsHorizontaux, new
  //  org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, nbColonnes * 40, 1 * 40));
   //  this.pack();
    // this.revalidate();
        
    

     // cr�ation du panneau de boutons verticaux (pour les lignes)
 for (i = 0; i < nbLignes; i++) {
 JButton bouton_ligne = new JButton(""+i);
 ActionListener ecouteurClick = new ActionListener() {
    final int j = i;
 @Override

 public void actionPerformed(ActionEvent e) {
 nbCoups=nbCoups+1;   
grille.activerLigneDeCellules(j);
repaint();
Label1.setText("le nombre de coups est de:"+nbCoups+"/"+nbCoup);


if(nbCoup==nbCoups){
    FenetreDefaite d = new FenetreDefaite();
    d.setVisible(true);
    FenetrePrincipale.this.dispose();
            
 }

if(grille.cellulesToutesEteintes()==true){
      FenetreVictoire f = new FenetreVictoire();
      f.setVisible(true);
     FenetrePrincipale.this.dispose();
     
  }
}

    


    
 
 };
 
 bouton_ligne.addActionListener(ecouteurClick);
 PanneauBoutonsVerticaux.add(bouton_ligne);



 }

 
        


     // cr�ation du panneau de boutons verticaux (pour les lignes)
 for (j = 0; j < nbColonnes; j++) {
 JButton bouton_colonne = new JButton(""+j);
 ActionListener ecouteurClick = new ActionListener() {
    final int i= j;
 @Override
 
 public void actionPerformed(ActionEvent e) {
  nbCoups=nbCoups+1; 
  
 grille.activerColonneDeCellules(i);
repaint();

Label1.setText("le nombre de coups est de:"+nbCoups+"/"+nbCoup);
 
if(nbCoup==nbCoups){
    FenetreDefaite d = new FenetreDefaite();
    d.setVisible(true);
    FenetrePrincipale.this.dispose();
 }    
 
if(grille.cellulesToutesEteintes()==true){
      FenetreVictoire f = new FenetreVictoire();
      f.setVisible(true);
      FenetrePrincipale.this.dispose();
     
     
  }


 }

 };
 bouton_colonne.addActionListener(ecouteurClick);
 PanneauBoutonsHorizontaux.add(bouton_colonne);

 }


 
    }
public void initialiserPartie() {
 grille.eteindreToutesLesCellules();
 grille.melangerMatriceAleatoirement(50);
 
 }
public void AfficherMessage(){
     if(grille.cellulesToutesEteintes()) {
         FenetreVictoire f = new FenetreVictoire() ;
          f.setVisible(true) ;
     }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jFrame2 = new javax.swing.JFrame();
        PanneauGrille = new javax.swing.JPanel();
        PanneauBoutonsVerticaux = new javax.swing.JPanel();
        PanneauBoutonsHorizontaux = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Label1 = new java.awt.Label();
        jButton3 = new javax.swing.JButton();

        jFrame1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jFrame1PropertyChange(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(480, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanneauGrille.setBackground(java.awt.Color.blue);
        PanneauGrille.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                PanneauGrillePropertyChange(evt);
            }
        });

        javax.swing.GroupLayout PanneauGrilleLayout = new javax.swing.GroupLayout(PanneauGrille);
        PanneauGrille.setLayout(PanneauGrilleLayout);
        PanneauGrilleLayout.setHorizontalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        PanneauGrilleLayout.setVerticalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 410, 300));

        PanneauBoutonsVerticaux.setBackground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout PanneauBoutonsVerticauxLayout = new javax.swing.GroupLayout(PanneauBoutonsVerticaux);
        PanneauBoutonsVerticaux.setLayout(PanneauBoutonsVerticauxLayout);
        PanneauBoutonsVerticauxLayout.setHorizontalGroup(
            PanneauBoutonsVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        PanneauBoutonsVerticauxLayout.setVerticalGroup(
            PanneauBoutonsVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 50, 300));

        PanneauBoutonsHorizontaux.setBackground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout PanneauBoutonsHorizontauxLayout = new javax.swing.GroupLayout(PanneauBoutonsHorizontaux);
        PanneauBoutonsHorizontaux.setLayout(PanneauBoutonsHorizontauxLayout);
        PanneauBoutonsHorizontauxLayout.setHorizontalGroup(
            PanneauBoutonsHorizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        PanneauBoutonsHorizontauxLayout.setVerticalGroup(
            PanneauBoutonsHorizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsHorizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 410, 50));

        jButton1.setText("Diag");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 33, 60, 40));

        jButton2.setText("Diag2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 70, 40));

        Label1.setText("label1");
        Label1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                Label1PropertyChange(evt);
            }
        });
        getContentPane().add(Label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 280, 60));

        jButton3.setText("Arreter la partie");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         this.grille.activerDiagonaleMontante();
        repaint();
        nbCoups=nbCoups+1;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.grille.activerDiagonaleDescendante();
 repaint();
 nbCoups=nbCoups+1;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void Label1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_Label1PropertyChange
       Label1.setText("Nombre de coups: 0");
    }//GEN-LAST:event_Label1PropertyChange

    private void jFrame1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jFrame1PropertyChange
       
         
            
        
    }//GEN-LAST:event_jFrame1PropertyChange

    private void PanneauGrillePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_PanneauGrillePropertyChange
this.setLocationRelativeTo(null);
    }//GEN-LAST:event_PanneauGrillePropertyChange

    /**
     * @param args the command line arguments
     */
    //public static void main(String args[]) {
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
      //  try {
      //      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
      //          if ("Nimbus".equals(info.getName())) {
      //              javax.swing.UIManager.setLookAndFeel(info.getClassName());
       //             break;
      //          }
      //      }
      //  } catch (ClassNotFoundException ex) {
      //      java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      //  } catch (InstantiationException ex) {
        //    java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
   //     } catch (IllegalAccessException ex) {
     //       java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       // } catch (javax.swing.UnsupportedLookAndFeelException ex) {
     //       java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       // }
        //</editor-fold>

        /* Create and display the form */
      //  java.awt.EventQueue.invokeLater(new Runnable() {
        //    public void run() {
          //      new FenetrePrincipale(Lignes,Colonnes).setVisible(true);
       //     }
     //   });
   // }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label Label1;
    private javax.swing.JPanel PanneauBoutonsHorizontaux;
    private javax.swing.JPanel PanneauBoutonsVerticaux;
    private javax.swing.JPanel PanneauGrille;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
