/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Anonymus
 */
public class telaGenio extends javax.swing.JFrame {

    /**
     * Creates new form telaGenio
     */
    public telaGenio() {
        initComponents();
        
        lblFala.setText("<html>Estou pensando em um número entre <strong>1 e 5</strong>. Tente adivinhar que valor é esse.</html>");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblFala = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnPalp = new javax.swing.JButton();
        valor = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/genio.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 160, 311));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Valor");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        lblFala.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblFala.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        getContentPane().add(lblFala, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 150, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/balao.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 245, 195));

        btnPalp.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnPalp.setText("Palpite");
        btnPalp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPalpActionPerformed(evt);
            }
        });
        getContentPane().add(btnPalp, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 130, 40));

        valor.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        getContentPane().add(valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 70, 30));

        jLabel4.setFont(new java.awt.Font("Javanese Text", 3, 14)); // NOI18N
        jLabel4.setText("Paulo Tarcisio Java Developer");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPalpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPalpActionPerformed
        int n = Integer.parseInt(valor.getValue().toString());
        
        double res = 1 + Math.random() * (6 - 1);
        int vr = (int) res ;
        
        String f1 = "<html> ACERTOU MIZERÁVI!! Kkkk Pensei no " + vr + " !</html>" ;
        String f2 = "<html> Errou! Eu pensei no número " + vr + " </html>";
        
        String resul = (n == vr)? f1:f2;
        
        lblFala.setText(resul);
    }//GEN-LAST:event_btnPalpActionPerformed

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
            java.util.logging.Logger.getLogger(telaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaGenio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPalp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel lblFala;
    private javax.swing.JSpinner valor;
    // End of variables declaration//GEN-END:variables
}
