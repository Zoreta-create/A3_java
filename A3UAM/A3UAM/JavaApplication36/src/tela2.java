
import javax.swing.ImageIcon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author profslpa
 */
public class tela2 extends javax.swing.JFrame {
GameAdvanced Game;
boolean contv = false, conta = false,conte = false;
int pontos;
    /**
     * Creates new form tela2
     */
    public tela2() {
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

        lblchoice = new javax.swing.JLabel();
        lbltxt = new javax.swing.JLabel();
        lblpontos = new javax.swing.JLabel();
        btninicio = new javax.swing.JButton();
        lblgifv1 = new javax.swing.JLabel();
        lblgifv2 = new javax.swing.JLabel();
        lblgifa1 = new javax.swing.JLabel();
        lblgifa2 = new javax.swing.JLabel();
        diceOneBlue = new javax.swing.JLabel();
        diceTwoBlue = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        diceOneRed = new javax.swing.JLabel();
        diceTwoRed = new javax.swing.JLabel();
        diceOneBlue1 = new javax.swing.JLabel();
        diceTwoBlue1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        diceOneRed1 = new javax.swing.JLabel();
        diceTwoRed1 = new javax.swing.JLabel();
        btn_redAdvanced = new javax.swing.JButton();
        btn_drawAdvanced = new javax.swing.JButton();
        btn_blueAdvanced = new javax.swing.JButton();
        lbldadov1 = new javax.swing.JLabel();
        lbldadoa1 = new javax.swing.JLabel();
        lbldadov2 = new javax.swing.JLabel();
        lbldadoa2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(550, 400));
        getContentPane().setLayout(null);

        lblchoice.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblchoice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblchoice);
        lblchoice.setBounds(50, 160, 460, 90);

        lbltxt.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        lbltxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lbltxt);
        lbltxt.setBounds(180, 10, 200, 110);
        getContentPane().add(lblpontos);
        lblpontos.setBounds(170, 180, 230, 90);

        btninicio.setFont(new java.awt.Font("Segoe Script", 0, 12)); // NOI18N
        btninicio.setForeground(new java.awt.Color(51, 51, 51));
        btninicio.setText("INICIO");
        btninicio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btninicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninicioActionPerformed(evt);
            }
        });
        getContentPane().add(btninicio);
        btninicio.setBounds(10, 10, 45, 20);
        getContentPane().add(lblgifv1);
        lblgifv1.setBounds(60, 20, 110, 100);
        getContentPane().add(lblgifv2);
        lblgifv2.setBounds(60, 150, 110, 100);
        getContentPane().add(lblgifa1);
        lblgifa1.setBounds(400, 20, 100, 100);
        getContentPane().add(lblgifa2);
        lblgifa2.setBounds(400, 160, 100, 100);
        getContentPane().add(diceOneBlue);
        diceOneBlue.setBounds(235, 6, 0, 0);
        getContentPane().add(diceTwoBlue);
        diceTwoBlue.setBounds(231, 40, 0, 0);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(146, 109, 0, 0);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(229, 109, 0, 0);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(149, 364, 0, 0);
        getContentPane().add(diceOneRed);
        diceOneRed.setBounds(56, 6, 0, 0);
        getContentPane().add(diceTwoRed);
        diceTwoRed.setBounds(146, 40, 0, 0);
        getContentPane().add(diceOneBlue1);
        diceOneBlue1.setBounds(245, 6, 0, 0);
        getContentPane().add(diceTwoBlue1);
        diceTwoBlue1.setBounds(241, 40, 0, 0);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(156, 109, 0, 0);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(239, 109, 0, 0);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(159, 364, 0, 0);
        getContentPane().add(diceOneRed1);
        diceOneRed1.setBounds(66, 6, 0, 0);
        getContentPane().add(diceTwoRed1);
        diceTwoRed1.setBounds(156, 40, 0, 0);

        btn_redAdvanced.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botaoVERMELHOsf (1).png"))); // NOI18N
        btn_redAdvanced.setBorderPainted(false);
        btn_redAdvanced.setContentAreaFilled(false);
        btn_redAdvanced.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_redAdvancedActionPerformed(evt);
            }
        });
        getContentPane().add(btn_redAdvanced);
        btn_redAdvanced.setBounds(50, 310, 110, 40);

        btn_drawAdvanced.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botaoEMPATEsf (1).png"))); // NOI18N
        btn_drawAdvanced.setBorder(new javax.swing.border.MatteBorder(null));
        btn_drawAdvanced.setBorderPainted(false);
        btn_drawAdvanced.setContentAreaFilled(false);
        btn_drawAdvanced.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_drawAdvancedActionPerformed(evt);
            }
        });
        getContentPane().add(btn_drawAdvanced);
        btn_drawAdvanced.setBounds(230, 260, 110, 40);

        btn_blueAdvanced.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botaoAZULsf (1).png"))); // NOI18N
        btn_blueAdvanced.setBorderPainted(false);
        btn_blueAdvanced.setContentAreaFilled(false);
        btn_blueAdvanced.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_blueAdvanced.setHideActionText(true);
        btn_blueAdvanced.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_blueAdvancedActionPerformed(evt);
            }
        });
        getContentPane().add(btn_blueAdvanced);
        btn_blueAdvanced.setBounds(400, 310, 110, 40);

        lbldadov1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/n1-vermelho.png"))); // NOI18N
        getContentPane().add(lbldadov1);
        lbldadov1.setBounds(60, 20, 110, 100);

        lbldadoa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/n1-azul.png"))); // NOI18N
        getContentPane().add(lbldadoa1);
        lbldadoa1.setBounds(400, 20, 100, 100);

        lbldadov2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/n1-vermelho.png"))); // NOI18N
        getContentPane().add(lbldadov2);
        lbldadov2.setBounds(60, 150, 110, 100);

        lbldadoa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/n1-azul.png"))); // NOI18N
        getContentPane().add(lbldadoa2);
        lbldadoa2.setBounds(400, 160, 100, 100);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fundoDD.jpeg"))); // NOI18N
        jLabel9.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        getContentPane().add(jLabel9);
        jLabel9.setBounds(-10, -30, 590, 430);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_redAdvancedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_redAdvancedActionPerformed
        jogarDado("red");
        contv = true;
        lblchoice.setText("Red foi sua escolha");
        
    }//GEN-LAST:event_btn_redAdvancedActionPerformed

    private void btn_drawAdvancedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_drawAdvancedActionPerformed
      jogarDado("draw");
      conte = true;
      lblchoice.setText("Draw foi sua escolha");
    }//GEN-LAST:event_btn_drawAdvancedActionPerformed

    private void btn_blueAdvancedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_blueAdvancedActionPerformed
      jogarDado("blue");
      conta = true;
      lblchoice.setText("Blue foi sua escolha");
    }//GEN-LAST:event_btn_blueAdvancedActionPerformed

    private void btninicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninicioActionPerformed
        new telaInicial().setVisible(true);
        dispose();
    }//GEN-LAST:event_btninicioActionPerformed

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
            java.util.logging.Logger.getLogger(tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_blueAdvanced;
    private javax.swing.JButton btn_drawAdvanced;
    private javax.swing.JButton btn_redAdvanced;
    private javax.swing.JButton btninicio;
    private javax.swing.JLabel diceOneBlue;
    private javax.swing.JLabel diceOneBlue1;
    private javax.swing.JLabel diceOneRed;
    private javax.swing.JLabel diceOneRed1;
    private javax.swing.JLabel diceTwoBlue;
    private javax.swing.JLabel diceTwoBlue1;
    private javax.swing.JLabel diceTwoRed;
    private javax.swing.JLabel diceTwoRed1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblchoice;
    private javax.swing.JLabel lbldadoa1;
    private javax.swing.JLabel lbldadoa2;
    private javax.swing.JLabel lbldadov1;
    private javax.swing.JLabel lbldadov2;
    private javax.swing.JLabel lblgifa1;
    private javax.swing.JLabel lblgifa2;
    private javax.swing.JLabel lblgifv1;
    private javax.swing.JLabel lblgifv2;
    private javax.swing.JLabel lblpontos;
    private javax.swing.JLabel lbltxt;
    // End of variables declaration//GEN-END:variables

    
    public void jogarDado(String cor){
        
        lbldadov1.setVisible(false);
        lbldadov2.setVisible(false);
        ImageIcon gif1 = new ImageIcon("src/img/dadogifnovo.gif");
        lblgifv1.setIcon(gif1);
        lblgifv2.setIcon(gif1);

        lbldadoa1.setVisible(false);
        lbldadoa2.setVisible(false);
        ImageIcon gif2 = new ImageIcon("src/img/gifdadoazul.gif");
        lblgifa1.setIcon(gif2);
        lblgifa2.setIcon(gif2);

        Game = new GameAdvanced(lblgifa1, lblgifa2, lblgifv1, lblgifv2, lbltxt,contv,conta,conte,lblpontos
                ,pontos,cor);
        Game.start();
        
    }
    
}
