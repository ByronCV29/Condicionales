
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author byron_rigdkvz
 */
public class NumerosParoImpar extends javax.swing.JFrame {

    /**
     * Creates new form NumerosParoImpar
     */
    public NumerosParoImpar() {
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

        Titulo = new javax.swing.JLabel();
        SubTitulo = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        Validar = new javax.swing.JButton();
        jSalir = new javax.swing.JButton();
        jLimpiar = new javax.swing.JButton();
        jTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        Titulo.setForeground(new java.awt.Color(153, 255, 51));
        Titulo.setText("VAMOS AVERIGUAR SI EL NÚMERO ES PAR O IMPAR");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 620, 40));

        SubTitulo.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 18)); // NOI18N
        SubTitulo.setForeground(new java.awt.Color(0, 255, 255));
        SubTitulo.setText("Favor ingresar un número:");
        getContentPane().add(SubTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 340, -1));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 90, 70));

        Validar.setBackground(new java.awt.Color(204, 204, 204));
        Validar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Validar.setForeground(new java.awt.Color(0, 0, 255));
        Validar.setText("VALIDAR");
        Validar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValidarActionPerformed(evt);
            }
        });
        getContentPane().add(Validar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 160, 60));

        jSalir.setBackground(new java.awt.Color(204, 204, 204));
        jSalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jSalir.setForeground(new java.awt.Color(0, 0, 255));
        jSalir.setText("SALIR");
        jSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 160, 60));

        jLimpiar.setBackground(new java.awt.Color(204, 204, 204));
        jLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLimpiar.setForeground(new java.awt.Color(0, 0, 255));
        jLimpiar.setText("LIMPIAR");
        jLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(jLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 160, 60));

        jTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/wallpaper4.png"))); // NOI18N
        getContentPane().add(jTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 628, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jSalirActionPerformed

    private void ValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValidarActionPerformed
      int num;
      num=Integer.parseInt(jTextField1.getText());
      if (num % 2 == 0)
          JOptionPane.showMessageDialog(null,"El número es par");
      else
          JOptionPane.showMessageDialog(null,"El número es impar");
    }//GEN-LAST:event_ValidarActionPerformed

    private void jLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLimpiarActionPerformed
        jTextField1.setText("");
    }//GEN-LAST:event_jLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(NumerosParoImpar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NumerosParoImpar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NumerosParoImpar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NumerosParoImpar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NumerosParoImpar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SubTitulo;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton Validar;
    private javax.swing.JButton jLimpiar;
    private javax.swing.JButton jSalir;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jTitulo;
    // End of variables declaration//GEN-END:variables
}
