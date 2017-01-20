/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RelojPrueba;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author APOYO
 */
public class RelojPrueba extends javax.swing.JFrame {

    /**
     * Creates new form RelojPrueba
     */
    public RelojPrueba() {
        initComponents();
        alarma();
    }  
      
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTHora = new javax.swing.JTextField();
        jSHora = new javax.swing.JSlider();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSMin = new javax.swing.JSlider();
        jTMin = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        relojDigitalBean1 = new RelojDigital.RelojDigitalBean();
        cBoxAlarma = new java.awt.Checkbox();
        jThoraAlarma = new javax.swing.JTextField();
        imagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CONFIGURAR ALARMA");

        jTHora.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        jTHora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTHora.setText("0");
        jTHora.setToolTipText("solo se pueden introducir números y un valor de 0 a 24");

        jSHora.setBackground(new java.awt.Color(255, 255, 255));
        jSHora.setMaximum(24);
        jSHora.setOrientation(javax.swing.JSlider.VERTICAL);
        jSHora.setPaintTicks(true);
        jSHora.setValue(0);
        jSHora.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSHoraStateChanged(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel5.setText("RELOJ DIGITAL");

        jLabel6.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText(":");

        jSMin.setBackground(new java.awt.Color(255, 255, 255));
        jSMin.setMaximum(59);
        jSMin.setOrientation(javax.swing.JSlider.VERTICAL);
        jSMin.setPaintTicks(true);
        jSMin.setValue(0);
        jSMin.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSMinStateChanged(evt);
            }
        });

        jTMin.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        jTMin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTMin.setText("0");
        jTMin.setToolTipText("solo se pueden introducir números y un valor de 0 a 59");

        jButton1.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jButton1.setText("Guardar Alarma");
        jButton1.setToolTipText("Se activara la alarma");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Stencil", 0, 10)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("HORA");

        jLabel8.setFont(new java.awt.Font("Stencil", 0, 10)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("MINUTOS");

        jButton2.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jButton2.setText("12/24");
        jButton2.setToolTipText("Al pulsar el botón se cambiara el formato de hora.");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        relojDigitalBean1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        relojDigitalBean1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        relojDigitalBean1.setAlarma("");
        relojDigitalBean1.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        relojDigitalBean1.addAlarmaListener(new RelojDigital.RelojDigitalBean.AlarmaListener() {
            public void capturarAlarma(RelojDigital.RelojDigitalBean.AlarmaEvent evt) {
                relojDigitalBean1CapturarAlarma(evt);
            }
        });

        cBoxAlarma.setEnabled(false);
        cBoxAlarma.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        cBoxAlarma.setLabel("Alarma activa");
        cBoxAlarma.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cBoxAlarmaItemStateChanged(evt);
            }
        });

        jThoraAlarma.setEditable(false);
        jThoraAlarma.setBackground(new java.awt.Color(255, 255, 255));
        jThoraAlarma.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jThoraAlarma.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tack.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSHora, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                    .addComponent(jTHora))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSMin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                    .addComponent(jTMin)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imagen)
                .addGap(26, 26, 26))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(relojDigitalBean1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addGap(32, 140, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(cBoxAlarma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jThoraAlarma))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(relojDigitalBean1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cBoxAlarma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jThoraAlarma)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagen)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSHora, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jTHora, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSMin, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jTMin, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addComponent(jButton1)))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSHoraStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSHoraStateChanged
        jTHora.setText(Integer.toString(jSHora.getValue()));
    }//GEN-LAST:event_jSHoraStateChanged

    private void jSMinStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSMinStateChanged
        jTMin.setText(Integer.toString(jSMin.getValue()));
    }//GEN-LAST:event_jSMinStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(relojDigitalBean1.isFormato()==true){
            relojDigitalBean1.setFormato(false);
        }else{
            relojDigitalBean1.setFormato(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void alarma(){
        if(relojDigitalBean1.getAlarma().equals("")){
            cBoxAlarma.setState(false);
            cBoxAlarma.setEnabled(false);
            jThoraAlarma.setText("");
        }else{
            cBoxAlarma.setState(true);
            cBoxAlarma.setEnabled(true);
            jThoraAlarma.setText(relojDigitalBean1.getAlarma());
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int h = Integer.parseInt(jTHora.getText());
        int m = Integer.parseInt(jTMin.getText());
        boolean aux;
        
        if(h<0 || h>23){
            JOptionPane.showMessageDialog(null, "La hora introducida no puede ser inferior a 0, ni superior a 23 horas", "Aviso",
            JOptionPane.INFORMATION_MESSAGE);
            aux=false;
        }else{
            aux = true;
        }
        
        if(m<0 || m>59){
            JOptionPane.showMessageDialog(null, "Los minutos introducidos no pueden ser inferiores a 0, ni superiores a 59 minutos", "Aviso",
            JOptionPane.INFORMATION_MESSAGE);
            aux=false;
        }else{
            if(aux==false){
                JOptionPane.showMessageDialog(null, "Compruebe la hora de la alarma introducida", "Aviso",
                JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        if(aux==true){
            cBoxAlarma.setState(true);
            cBoxAlarma.setEnabled(true);
            if(m<10){
                jThoraAlarma.setText(jTHora.getText()+":0"+jTMin.getText());
            }else{
                jThoraAlarma.setText(jTHora.getText()+":"+jTMin.getText());
            }
            
            relojDigitalBean1.setAlarma(jTHora.getText()+jTMin.getText());
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void relojDigitalBean1CapturarAlarma(RelojDigital.RelojDigitalBean.AlarmaEvent evt) {//GEN-FIRST:event_relojDigitalBean1CapturarAlarma
        JOptionPane.showMessageDialog(null, "Es la hora, despierta", "Alarma", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/imagenes/tick.gif"));
        alarma();
    }//GEN-LAST:event_relojDigitalBean1CapturarAlarma

    private void cBoxAlarmaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cBoxAlarmaItemStateChanged
        relojDigitalBean1.setAlarma("");
        alarma();
    }//GEN-LAST:event_cBoxAlarmaItemStateChanged

    
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
            java.util.logging.Logger.getLogger(RelojPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelojPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelojPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelojPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelojPrueba().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Checkbox cBoxAlarma;
    private javax.swing.JLabel imagen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider jSHora;
    private javax.swing.JSlider jSMin;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTHora;
    private javax.swing.JTextField jTMin;
    private javax.swing.JTextField jThoraAlarma;
    private RelojDigital.RelojDigitalBean relojDigitalBean1;
    // End of variables declaration//GEN-END:variables
}
