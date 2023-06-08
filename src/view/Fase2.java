/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import DAO.ArquivoDAO;
import DTO.ArquivoDTO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class Fase2 extends javax.swing.JFrame {
 private boolean p1,p2,p3, p4, p5, p6;
 public static int d1,d2,d3,d4,d5,d6,somafase2;
 private ArquivoDTO arquivodto;
 private ArquivoDAO arquivodao;
    /**
     * Creates new form Fase2
     */
    public Fase2() {
        initComponents();
        
        arquivodto = new ArquivoDTO();
        arquivodao = new ArquivoDAO();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ibt1fase2 = new javax.swing.JLabel();
        ibt2fase2 = new javax.swing.JLabel();
        ibt3fase2 = new javax.swing.JLabel();
        ibt4fase2 = new javax.swing.JLabel();
        ibt5fase2 = new javax.swing.JLabel();
        ibt6fase2 = new javax.swing.JLabel();
        ibtr1fase2 = new javax.swing.JLabel();
        ibtr2fase2 = new javax.swing.JLabel();
        ibtr3fase2 = new javax.swing.JLabel();
        ibtr4fase2 = new javax.swing.JLabel();
        ibtr5fase2 = new javax.swing.JLabel();
        ibtr6fase2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusCycleRoot(false);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ibt1fase2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/fase2include1.png"))); // NOI18N
        ibt1fase2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                ibt1fase2MouseDragged(evt);
            }
        });
        getContentPane().add(ibt1fase2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 610, 250, 80));

        ibt2fase2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/fase2intmain.png"))); // NOI18N
        ibt2fase2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                ibt2fase2MouseDragged(evt);
            }
        });
        getContentPane().add(ibt2fase2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, -1, -1));

        ibt3fase2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/fase2int.png"))); // NOI18N
        ibt3fase2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                ibt3fase2MouseDragged(evt);
            }
        });
        getContentPane().add(ibt3fase2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, -1, -1));

        ibt4fase2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/fase2for.png"))); // NOI18N
        ibt4fase2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                ibt4fase2MouseDragged(evt);
            }
        });
        getContentPane().add(ibt4fase2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, -1, -1));

        ibt5fase2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/fase2.png"))); // NOI18N
        ibt5fase2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                ibt5fase2MouseDragged(evt);
            }
        });
        getContentPane().add(ibt5fase2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        ibt6fase2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/fase2return01.png"))); // NOI18N
        ibt6fase2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                ibt6fase2MouseDragged(evt);
            }
        });
        getContentPane().add(ibt6fase2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        ibtr1fase2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ibtr1fase2MouseEntered(evt);
            }
        });
        getContentPane().add(ibtr1fase2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 250, 70));

        ibtr2fase2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ibtr2fase2MouseEntered(evt);
            }
        });
        getContentPane().add(ibtr2fase2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 250, 80));

        ibtr3fase2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ibtr3fase2MouseEntered(evt);
            }
        });
        getContentPane().add(ibtr3fase2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 250, 90));

        ibtr4fase2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ibtr4fase2MouseEntered(evt);
            }
        });
        getContentPane().add(ibtr4fase2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 440, 250, 80));

        ibtr5fase2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ibtr5fase2MouseEntered(evt);
            }
        });
        getContentPane().add(ibtr5fase2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 520, 250, 90));

        ibtr6fase2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ibtr6fase2MouseEntered(evt);
            }
        });
        getContentPane().add(ibtr6fase2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 610, 250, 80));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/botãoproximafase.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 660, 240, 70));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/menuinfob.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 90, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/help.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 30, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/sombrafase2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/enunciadof2.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 230, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/fundoatt.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ibt1fase2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ibt1fase2MouseDragged
        ibt1fase2.setLocation(ibt1fase2.getX()+evt.getX(), ibt1fase2.getY()+evt.getY());
       p1=true;
    }//GEN-LAST:event_ibt1fase2MouseDragged

    private void ibt2fase2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ibt2fase2MouseDragged
       ibt2fase2.setLocation(ibt2fase2.getX()+evt.getX(), ibt2fase2.getY()+evt.getY());
       p2=true;
    }//GEN-LAST:event_ibt2fase2MouseDragged

    private void ibt3fase2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ibt3fase2MouseDragged
        ibt3fase2.setLocation(ibt3fase2.getX()+evt.getX(), ibt3fase2.getY()+evt.getY());
       p3=true;
    }//GEN-LAST:event_ibt3fase2MouseDragged

    private void ibt4fase2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ibt4fase2MouseDragged
       ibt4fase2.setLocation(ibt4fase2.getX()+evt.getX(), ibt4fase2.getY()+evt.getY());
       p4=true;
    }//GEN-LAST:event_ibt4fase2MouseDragged

    private void ibt5fase2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ibt5fase2MouseDragged
       ibt5fase2.setLocation(ibt5fase2.getX()+evt.getX(), ibt5fase2.getY()+evt.getY());
       p5=true;
    }//GEN-LAST:event_ibt5fase2MouseDragged

    private void ibt6fase2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ibt6fase2MouseDragged
       ibt6fase2.setLocation(ibt6fase2.getX()+evt.getX(), ibt6fase2.getY()+evt.getY());
       p6=true;
    }//GEN-LAST:event_ibt6fase2MouseDragged

    private void ibtr1fase2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ibtr1fase2MouseEntered
     if(p1){
           ibt1fase2.setVisible(false);
           ibtr1fase2.setIcon(new ImageIcon("src/resouces/fase2include1.png")); 
           d1=1;
       } 
    }//GEN-LAST:event_ibtr1fase2MouseEntered

    private void ibtr2fase2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ibtr2fase2MouseEntered
        if(p2){
           ibt2fase2.setVisible(false);
           ibtr2fase2.setIcon(new ImageIcon("src/resouces/fase2intmain.png")); 
           d2=1;
       } 
    }//GEN-LAST:event_ibtr2fase2MouseEntered

    private void ibtr3fase2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ibtr3fase2MouseEntered
        if(p3){
           ibt3fase2.setVisible(false);
           ibtr3fase2.setIcon(new ImageIcon("src/resouces/fase2int.png")); 
           d3=1;
       } 
    }//GEN-LAST:event_ibtr3fase2MouseEntered

    private void ibtr4fase2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ibtr4fase2MouseEntered
      if(p4){
           ibt4fase2.setVisible(false);
           ibtr4fase2.setIcon(new ImageIcon("src/resouces/fase2for.png")); 
           d4=1;
       } 
    }//GEN-LAST:event_ibtr4fase2MouseEntered

    private void ibtr5fase2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ibtr5fase2MouseEntered
        if(p5){
           ibt5fase2.setVisible(false);
           ibtr5fase2.setIcon(new ImageIcon("src/resouces/fase2.png")); 
           d5=1;
       } 
    }//GEN-LAST:event_ibtr5fase2MouseEntered

    private void ibtr6fase2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ibtr6fase2MouseEntered
        if(p6){
           ibt6fase2.setVisible(false);
           ibtr6fase2.setIcon(new ImageIcon("src/resouces/fase2return01.png")); 
           d6=1;
       } 
    }//GEN-LAST:event_ibtr6fase2MouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       somafase2=d1+d2+d3+d4+d5+d6;
        
        arquivodto.setId_dois(1);
        arquivodto.setDoispeca_um(d1);
        arquivodto.setDoispeca_dois(d2);
        arquivodto.setDoispeca_tres(d3);
        arquivodto.setDoispeca_quatro(d4);
        arquivodto.setDoispeca_cinco(d5);
        arquivodto.setDoispeca_seis(d6);
        arquivodto.setTotal_pecasdois(somafase2);
        arquivodao.InserirPecasFasesDois(arquivodto);
       
         if(somafase2==6){
          ProximaFase2 proximafase2= new ProximaFase2();
          proximafase2.setVisible(true);
          dispose();
          proximafase2=null;
          }else{
             JOptionPane.showMessageDialog(null, " - Pontos insuficientes - "+somafase2); 
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
           MenuInfof2  menuinfof2 = new  MenuInfof2 ();
           menuinfof2.setVisible(true);
          
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Helpf2 helpf2 = new Helpf2();
        helpf2.setVisible(true);
        
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Fase2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fase2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fase2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fase2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fase2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ibt1fase2;
    private javax.swing.JLabel ibt2fase2;
    private javax.swing.JLabel ibt3fase2;
    private javax.swing.JLabel ibt4fase2;
    private javax.swing.JLabel ibt5fase2;
    private javax.swing.JLabel ibt6fase2;
    private javax.swing.JLabel ibtr1fase2;
    private javax.swing.JLabel ibtr2fase2;
    private javax.swing.JLabel ibtr3fase2;
    private javax.swing.JLabel ibtr4fase2;
    private javax.swing.JLabel ibtr5fase2;
    private javax.swing.JLabel ibtr6fase2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
