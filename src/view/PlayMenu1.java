/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author pedro
 */
public class PlayMenu1 extends javax.swing.JFrame {

    /**
     * Creates new form PlayMenu1
     */
    public PlayMenu1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaovoltar = new javax.swing.JButton();
        botaosair = new javax.swing.JButton();
        botaofase1 = new javax.swing.JButton();
        botaofase3 = new javax.swing.JButton();
        botaofase2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1204, 1080));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botaovoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/botaovoltar.png"))); // NOI18N
        botaovoltar.setBorderPainted(false);
        botaovoltar.setContentAreaFilled(false);
        botaovoltar.setFocusPainted(false);
        botaovoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaovoltarActionPerformed(evt);
            }
        });
        getContentPane().add(botaovoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 195, -1));

        botaosair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/pixil-frame-0.png"))); // NOI18N
        botaosair.setBorderPainted(false);
        botaosair.setContentAreaFilled(false);
        botaosair.setFocusPainted(false);
        botaosair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaosairActionPerformed(evt);
            }
        });
        getContentPane().add(botaosair, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 60, -1, -1));

        botaofase1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/fase1play.png"))); // NOI18N
        botaofase1.setBorderPainted(false);
        botaofase1.setContentAreaFilled(false);
        botaofase1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaofase1ActionPerformed(evt);
            }
        });
        getContentPane().add(botaofase1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 387, -1));

        botaofase3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/fase3play.png"))); // NOI18N
        botaofase3.setBorderPainted(false);
        botaofase3.setContentAreaFilled(false);
        getContentPane().add(botaofase3, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 420, -1, -1));

        botaofase2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/fase2play.png"))); // NOI18N
        botaofase2.setBorderPainted(false);
        botaofase2.setContentAreaFilled(false);
        botaofase2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaofase2ActionPerformed(evt);
            }
        });
        getContentPane().add(botaofase2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, 340, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/selecionefase.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 760, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/play2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/play3.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 430, -1, 330));

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/menufundo.png"))); // NOI18N
        getContentPane().add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-280, -80, 1930, 1110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaofase1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaofase1ActionPerformed
        FasePlay1 play2 = new FasePlay1();
        play2.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaofase1ActionPerformed

    private void botaovoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaovoltarActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaovoltarActionPerformed

    private void botaosairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaosairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botaosairActionPerformed

    private void botaofase2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaofase2ActionPerformed
       
    }//GEN-LAST:event_botaofase2ActionPerformed

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
            java.util.logging.Logger.getLogger(PlayMenu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayMenu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayMenu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayMenu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayMenu1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaofase1;
    private javax.swing.JButton botaofase2;
    private javax.swing.JButton botaofase3;
    private javax.swing.JButton botaosair;
    private javax.swing.JButton botaovoltar;
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
