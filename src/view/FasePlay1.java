/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class FasePlay1 extends javax.swing.JFrame {

    boolean t1,t2,t3,t4,t5,t6;
    private int pontos,pontos1,pontos2,pontos3,pontos4,pontos5;
    private int soma;
    public FasePlay1() {
        initComponents();
         pontos=pontos1=pontos2=pontos3=pontos4=pontos5=soma=0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ibt1fase1 = new javax.swing.JLabel();
        ibt2fase1 = new javax.swing.JLabel();
        ibt3fase1 = new javax.swing.JLabel();
        ibt4fase1 = new javax.swing.JLabel();
        ibt5fase1 = new javax.swing.JLabel();
        ibt6fase1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ibtr1fase1 = new javax.swing.JLabel();
        ibtr2fase1 = new javax.swing.JLabel();
        ibtr3fase1 = new javax.swing.JLabel();
        ibtr4fase1 = new javax.swing.JLabel();
        ibtr5fase1 = new javax.swing.JLabel();
        ibtr6fase1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sombra = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ibt1fase1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/include1.png"))); // NOI18N
        ibt1fase1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                ibt1fase1MouseDragged(evt);
            }
        });
        getContentPane().add(ibt1fase1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, -1, -1));

        ibt2fase1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/intmain.png"))); // NOI18N
        ibt2fase1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                ibt2fase1MouseDragged(evt);
            }
        });
        getContentPane().add(ibt2fase1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        ibt3fase1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/int valor.png"))); // NOI18N
        ibt3fase1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                ibt3fase1MouseDragged(evt);
            }
        });
        getContentPane().add(ibt3fase1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 130, -1, -1));

        ibt4fase1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/printf1_2.png"))); // NOI18N
        ibt4fase1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                ibt4fase1MouseDragged(evt);
            }
        });
        getContentPane().add(ibt4fase1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, -1, 90));

        ibt5fase1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/scanf.png"))); // NOI18N
        ibt5fase1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                ibt5fase1MouseDragged(evt);
            }
        });
        getContentPane().add(ibt5fase1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 640, -1, 80));

        ibt6fase1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/printf2.png"))); // NOI18N
        ibt6fase1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                ibt6fase1MouseDragged(evt);
            }
        });
        getContentPane().add(ibt6fase1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/enunciadof11.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 240, 570, 430));

        ibtr1fase1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ibtr1fase1MouseEntered(evt);
            }
        });
        getContentPane().add(ibtr1fase1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 250, 80));

        ibtr2fase1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ibtr2fase1MouseEntered(evt);
            }
        });
        getContentPane().add(ibtr2fase1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 250, 80));

        ibtr3fase1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ibtr3fase1MouseEntered(evt);
            }
        });
        getContentPane().add(ibtr3fase1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 250, 80));

        ibtr4fase1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ibtr4fase1MouseEntered(evt);
            }
        });
        getContentPane().add(ibtr4fase1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, 250, 80));

        ibtr5fase1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ibtr5fase1MouseEntered(evt);
            }
        });
        getContentPane().add(ibtr5fase1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 470, 260, 80));

        ibtr6fase1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ibtr6fase1MouseEntered(evt);
            }
        });
        getContentPane().add(ibtr6fase1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 560, 260, 90));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/return01.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 640, -1, -1));

        sombra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/sombrafase1.png"))); // NOI18N
        getContentPane().add(sombra, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/botãoproximafase.png"))); // NOI18N
        jButton1.setText("Proxima fase");
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 660, 240, 80));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/menuinfob.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/fundoplay.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(1020, 1080));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -450, 1440, 1710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ibt1fase1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ibt1fase1MouseDragged
        ibt1fase1.setLocation(ibt1fase1.getX()+evt.getX(), ibt1fase1.getY()+evt.getY());
        t1=true;
    }//GEN-LAST:event_ibt1fase1MouseDragged

    private void ibt2fase1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ibt2fase1MouseDragged
       ibt2fase1.setLocation(ibt2fase1.getX()+evt.getX(), ibt2fase1.getY()+evt.getY());
       t2=true; 
    }//GEN-LAST:event_ibt2fase1MouseDragged

    private void ibt3fase1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ibt3fase1MouseDragged
       ibt3fase1.setLocation(ibt3fase1.getX()+evt.getX(), ibt3fase1.getY()+evt.getY());
       t3=true;
    }//GEN-LAST:event_ibt3fase1MouseDragged

    private void ibt4fase1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ibt4fase1MouseDragged
       ibt4fase1.setLocation(ibt4fase1.getX()+evt.getX(), ibt4fase1.getY()+evt.getY());
       t4=true;
    }//GEN-LAST:event_ibt4fase1MouseDragged

    private void ibt5fase1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ibt5fase1MouseDragged
       ibt5fase1.setLocation(ibt5fase1.getX()+evt.getX(), ibt5fase1.getY()+evt.getY());
       t5=true;
    }//GEN-LAST:event_ibt5fase1MouseDragged

    private void ibt6fase1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ibt6fase1MouseDragged
      ibt6fase1.setLocation(ibt6fase1.getX()+evt.getX(), ibt6fase1.getY()+evt.getY());
      t6=true;
    }//GEN-LAST:event_ibt6fase1MouseDragged

    private void ibtr1fase1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ibtr1fase1MouseEntered
        if(t1){
           ibt1fase1.setVisible(false);
           ibtr1fase1.setIcon(new ImageIcon("src/resouces/include1.png"));
           pontos=1;
           
       }
    }//GEN-LAST:event_ibtr1fase1MouseEntered

    private void ibtr2fase1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ibtr2fase1MouseEntered
         if(t2){
           ibt2fase1.setVisible(false);
           ibtr2fase1.setIcon(new ImageIcon("src/resouces/intmain.png")); 
           pontos1=1;
           
       } 
    }//GEN-LAST:event_ibtr2fase1MouseEntered

    private void ibtr3fase1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ibtr3fase1MouseEntered
       if(t3){
           ibt3fase1.setVisible(false);
           ibtr3fase1.setIcon(new ImageIcon("src/resouces/int valor.png"));
           pontos2=1;
       }   
    }//GEN-LAST:event_ibtr3fase1MouseEntered

    private void ibtr4fase1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ibtr4fase1MouseEntered
       if(t4){
           ibt4fase1.setVisible(false);
           ibtr4fase1.setIcon(new ImageIcon("src/resouces/printf1_2.png")); 
           pontos3=1;
 
       } 
    }//GEN-LAST:event_ibtr4fase1MouseEntered

    private void ibtr5fase1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ibtr5fase1MouseEntered
       if(t5){
           ibt5fase1.setVisible(false);
           ibtr5fase1.setIcon(new ImageIcon("src/resouces/scanf.png")); 
            pontos4=1;

       }   
    }//GEN-LAST:event_ibtr5fase1MouseEntered

    private void ibtr6fase1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ibtr6fase1MouseEntered
        if(t6){
           ibt6fase1.setVisible(false);
           ibtr6fase1.setIcon(new ImageIcon("src/resouces/printf2.png")); 
            pontos5=1;
                    
           
       }     
    }//GEN-LAST:event_ibtr6fase1MouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        soma=pontos+pontos1+pontos2+pontos3+pontos4+pontos5; 
        System.out.printf("Acessou a soma de pontos");

        if(soma==6){
            System.out.printf("Acessou a tela 2");
            ProximaFase1  proximafase1 = new ProximaFase1();
            proximafase1.setVisible(true);
            dispose();
            
        }else{
             JOptionPane.showMessageDialog(null, " - Pontos insuficientes - "+soma); 
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            MenuInfo  menuinfo = new MenuInfo();
            menuinfo.setVisible(true);
            
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(FasePlay1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FasePlay1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FasePlay1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FasePlay1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FasePlay1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ibt1fase1;
    private javax.swing.JLabel ibt2fase1;
    private javax.swing.JLabel ibt3fase1;
    private javax.swing.JLabel ibt4fase1;
    private javax.swing.JLabel ibt5fase1;
    private javax.swing.JLabel ibt6fase1;
    private javax.swing.JLabel ibtr1fase1;
    private javax.swing.JLabel ibtr2fase1;
    private javax.swing.JLabel ibtr3fase1;
    private javax.swing.JLabel ibtr4fase1;
    private javax.swing.JLabel ibtr5fase1;
    private javax.swing.JLabel ibtr6fase1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel sombra;
    // End of variables declaration//GEN-END:variables
}
