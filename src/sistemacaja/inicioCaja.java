package sistemacaja;


import java.util.TimerTask;
import javax.swing.JOptionPane;
import javax.swing.Timer;

import javax.swing.JOptionPane;
import java.util.Timer;
import java.util.TimerTask;


/**
 *
 * @author Planificacion1
 */
public class inicioCaja extends javax.swing.JFrame {

   

       

    
    /**
     * Creates new form inicioCaja
     */
    public inicioCaja() {
        initComponents();
        
        this.setLocationRelativeTo(null);

       
         

        
        //Milisegundos (segundos*1000) luego de los cuales ejecutar el código
        int milisegundos = 1000;

        /*Aquí es donde se mencionó la importancia de definir un tiempo
         luego del cual se volverá a ejecutar el código, si es que no se
         desea eso, se puede dejar en 1 (no en 0) ya que en la clase Codigo 
         se realizará todo el debido control*/
        int milisegundosRepeticion = 3;

        //Temporizador instanciado desde la clase Timer
        /*Timer temporizador = new Timer("");

        //Instancia de la clase que contiene el código a ejecutar
        Codigo c = new Codigo();

        /*Se hace un llamado al temporizador para que ejecute el
         * código en X milisegundos y que repita el código luego del tiempo
         * determinado.
         */
        /*temporizador.schedule(c, milisegundos, milisegundosRepeticion);*/

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
<<<<<<< HEAD
        setFocusCycleRoot(false);
        setLocationByPlatform(true);
=======
>>>>>>> upstream/master
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/siscajaImagenes/FONDO.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    TimerTask timerTask = new TimerTask() 
     { 
         public void run()  
         { 
             JOptionPane.showMessageDialog(rootPane, "hola");
         } 
     };
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        frmLogin Login=new frmLogin();
        Login.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    
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
            java.util.logging.Logger.getLogger(inicioCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicioCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicioCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicioCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicioCaja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
