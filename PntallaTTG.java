
public class PntallaTTG extends javax.swing.JFrame {

    public PntallaTTG() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        btnCalcular = new javax.swing.JButton();
        txtPrecioBase = new javax.swing.JTextField();
        tbtnInstalacion = new javax.swing.JToggleButton();
        tbtnFormacion = new javax.swing.JToggleButton();
        tbtnAlimentacionBD = new javax.swing.JToggleButton();
        etiTotal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        etiPrecioInstalacion = new javax.swing.JLabel();
        etiPrecioFormacion = new javax.swing.JLabel();
        etiPrecioAlimentacionBD = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCalcular.setText("Calcular");
        tbtnInstalacion.setSelected(true);

        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        txtPrecioBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioBaseActionPerformed(evt);
            }
        });

        tbtnInstalacion.setText("Instalación");

        tbtnFormacion.setText("Formación");

        tbtnAlimentacionBD.setText("Alimentación BD");

        jLabel2.setText("Precio Base");
        jLabel2.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                jLabel2CaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });

        etiPrecioInstalacion.setText("40");

        etiPrecioFormacion.setText("200");

        etiPrecioAlimentacionBD.setText("200");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtPrecioBase, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etiTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tbtnAlimentacionBD, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(tbtnFormacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tbtnInstalacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiPrecioInstalacion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiPrecioFormacion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiPrecioAlimentacionBD, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPrecioBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbtnInstalacion)
                    .addComponent(etiPrecioInstalacion))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbtnFormacion)
                    .addComponent(etiPrecioFormacion))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbtnAlimentacionBD)
                    .addComponent(etiPrecioAlimentacionBD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(btnCalcular)
                .addGap(18, 18, 18)
                .addComponent(etiTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>                        

    private void txtPrecioBaseActionPerformed(java.awt.event.ActionEvent evt) {                                              

    }                                             

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {                                            
        double precio_base;
        double precio_instal; //precio instalación
        double precio_for;
        double precio_ali;
        
//Recojo datos desde la ventana:
        
        precio_base = Double.parseDouble(txtPrecioBase.getText());
        precio_instal = Double.parseDouble(etiPrecioInstalacion.getText());
        precio_for = Double.parseDouble(etiPrecioFormacion.getText());
        precio_ali = Double.parseDouble(etiPrecioAlimentacionBD.getText());
        
//Ahora que tengo los datos, puedo hacer cálculos.
        
//Al precio base se le van añadiendo precio de extras
//según estén o no activados los JToggleButtons
        double precio_total;
        
        precio_total = precio_base;
        
        if (tbtnInstalacion.isSelected()) { //Si se seleccionó instalación
            precio_total = precio_total+precio_instal;
        }
        
        if (tbtnFormacion.isSelected()) { //Si se seleccionó formación
            precio_total = precio_total+precio_for;            
        }
        
        if (tbtnAlimentacionBD.isSelected()) { //Si se seleccionó Alimentación BD
            precio_total = precio_total+precio_ali;
        }  
         
                
        //Finalmente pongo el resultado en la etiqueta

        etiTotal.setText(precio_total+" €");

    }                                           

    private void jLabel2CaretPositionChanged(java.awt.event.InputMethodEvent evt) {                                             
        // TODO add your handling code here:
    }                                            
    
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
            java.util.logging.Logger.getLogger(PntallaTTG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PntallaTTG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PntallaTTG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PntallaTTG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PntallaTTG().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel etiPrecioAlimentacionBD;
    private javax.swing.JLabel etiPrecioFormacion;
    private javax.swing.JLabel etiPrecioInstalacion;
    private javax.swing.JLabel etiTotal;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToggleButton tbtnAlimentacionBD;
    private javax.swing.JToggleButton tbtnFormacion;
    private javax.swing.JToggleButton tbtnInstalacion;
    private javax.swing.JTextField txtPrecioBase;

}
