/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import DTO.RegistroNome;

public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    
    
    public Menu() {
        initComponents();
        
        
    }
    public void exportarNome( RegistroNome  registronome){
    iblNome.setText(registronome.getNome());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        play = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        iblNome = new javax.swing.JTextField();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/playbuttons.png"))); // NOI18N
        play.setBorder(null);
        play.setBorderPainted(false);
        play.setContentAreaFilled(false);
        play.setFocusPainted(false);
        play.setFocusable(false);
        play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playActionPerformed(evt);
            }
        });
        getContentPane().add(play, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 220, 200));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/botaoinfoaadd.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 360, 220, 230));

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/pixil-frame-0.png"))); // NOI18N
        btnSair.setBorderPainted(false);
        btnSair.setContentAreaFilled(false);
        btnSair.setFocusPainted(false);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 70, -1, -1));

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/botaovoltar.png"))); // NOI18N
        btnVoltar.setBorderPainted(false);
        btnVoltar.setContentAreaFilled(false);
        btnVoltar.setFocusPainted(false);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 210, 50));

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BEM-VINDO(A)");
        jLabel1.setFocusable(false);
        jLabel1.setInheritsPopupMenu(false);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 650, 370, -1));

        iblNome.setEditable(false);
        iblNome.setBackground(new java.awt.Color(70, 34, 95));
        iblNome.setFont(new java.awt.Font("Palatino Linotype", 1, 48)); // NOI18N
        iblNome.setAutoscrolls(false);
        iblNome.setBorder(null);
        iblNome.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        iblNome.setEnabled(false);
        iblNome.setFocusable(false);
        iblNome.setRequestFocusEnabled(false);
        iblNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iblNomeActionPerformed(evt);
            }
        });
        getContentPane().add(iblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 650, 730, -1));

        fundo.setFont(new java.awt.Font("Segoe UI Historic", 3, 36)); // NOI18N
        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/menufundo.png"))); // NOI18N
        fundo.setText("jLabel2");
        fundo.setMaximumSize(new java.awt.Dimension(1920, 1080));
        fundo.setMinimumSize(new java.awt.Dimension(1920, 1080));
        fundo.setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, -20, 1910, 1040));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaIniciar telainiciar = new TelaIniciar();
        telainiciar.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
      System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playActionPerformed
        PlayMenu1 play = new PlayMenu1();
        play.setVisible(true);
        dispose();
    }//GEN-LAST:event_playActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Introdução introdução = new Introdução();
        introdução.setVisible(true);
        dispose();
        introdução=null;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void iblNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iblNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iblNomeActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel fundo;
    private javax.swing.JTextField iblNome;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton play;
    // End of variables declaration//GEN-END:variables
}
