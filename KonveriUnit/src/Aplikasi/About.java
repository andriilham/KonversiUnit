/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplikasi;

import java.io.IOException;
import java.util.logging.Level;
import javax.swing.ImageIcon;

/**
 *
 * @author Andri
 */
public class About extends javax.swing.JFrame {

    /**
     * Creates new form About
     */
    public About() {
        initComponents();
        
        gede.setVisible(false);
        nm2.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        kecil = new javax.swing.JLayeredPane();
        gede = new javax.swing.JLayeredPane();
        nm1 = new javax.swing.JLayeredPane();
        nm2 = new javax.swing.JLayeredPane();
        bg = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLayeredPane1.setPreferredSize(new java.awt.Dimension(70, 25));
        jLayeredPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLayeredPane1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLayeredPane1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLayeredPane1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 253, 76, -1));

        kecil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kecil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                kecilMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout kecilLayout = new javax.swing.GroupLayout(kecil);
        kecil.setLayout(kecilLayout);
        kecilLayout.setHorizontalGroup(
            kecilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 53, Short.MAX_VALUE)
        );
        kecilLayout.setVerticalGroup(
            kecilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        getContentPane().add(kecil, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 195, 53, 15));

        gede.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gede.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gedeMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gedeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout gedeLayout = new javax.swing.GroupLayout(gede);
        gede.setLayout(gedeLayout);
        gedeLayout.setHorizontalGroup(
            gedeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        gedeLayout.setVerticalGroup(
            gedeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(gede, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 100, 40));

        nm1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nm1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nm1MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout nm1Layout = new javax.swing.GroupLayout(nm1);
        nm1.setLayout(nm1Layout);
        nm1Layout.setHorizontalGroup(
            nm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        nm1Layout.setVerticalGroup(
            nm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        getContentPane().add(nm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 128, 70, 12));

        nm2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nm2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nm2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout nm2Layout = new javax.swing.GroupLayout(nm2);
        nm2.setLayout(nm2Layout);
        nm2Layout.setHorizontalGroup(
            nm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        nm2Layout.setVerticalGroup(
            nm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(nm2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 130, 30));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/vis1.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 77, 64));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLayeredPane1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLayeredPane1MouseEntered
        ImageIcon AS = new ImageIcon(getClass().getResource("/icons/vis2.png"));
        bg.setIcon(AS);
    }//GEN-LAST:event_jLayeredPane1MouseEntered

    private void jLayeredPane1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLayeredPane1MouseExited
        ImageIcon AS = new ImageIcon(getClass().getResource("/icons/vis1.png"));
        bg.setIcon(AS);
    }//GEN-LAST:event_jLayeredPane1MouseExited

    private void jLayeredPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLayeredPane1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLayeredPane1MouseClicked

    private void kecilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kecilMouseEntered
        ImageIcon AS = new ImageIcon(getClass().getResource("/icons/vis3.png"));
        bg.setIcon(AS);
        gede.setVisible(true);
        kecil.setVisible(false);
    }//GEN-LAST:event_kecilMouseEntered

    private void gedeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gedeMouseExited
        ImageIcon AS = new ImageIcon(getClass().getResource("/icons/vis1.png"));
        bg.setIcon(AS);
        gede.setVisible(false);
        kecil.setVisible(true);
    }//GEN-LAST:event_gedeMouseExited

    private void gedeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gedeMouseClicked
        String url="https://www.instagram.com/andriilh/";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_gedeMouseClicked

    private void nm1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nm1MouseEntered
       ImageIcon AS = new ImageIcon(getClass().getResource("/icons/vis4.png"));
       bg.setIcon(AS);
       nm2.setVisible(true);
       nm1.setVisible(false);
    }//GEN-LAST:event_nm1MouseEntered

    private void nm2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nm2MouseExited
        ImageIcon AS = new ImageIcon(getClass().getResource("/icons/vis1.png"));
       bg.setIcon(AS);
       nm2.setVisible(false);
       nm1.setVisible(true);
    }//GEN-LAST:event_nm2MouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new About().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLayeredPane gede;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLayeredPane kecil;
    private javax.swing.JLayeredPane nm1;
    private javax.swing.JLayeredPane nm2;
    // End of variables declaration//GEN-END:variables
}
