package Ejer3;
public class View_Obreros extends javax.swing.JFrame {
    //Declaración de Variables de la clase
        Obrero C; //Instanciando el objeto docende a "C"
        
    public View_Obreros() {
        initComponents();
    }
    public void limpiar_area(){
        info.setText("");
     }
     public void limpiar_total(){
      limpiar_area();
      
     cb_tipo.setSelectedIndex(0);
   
      
      txt_t.setText("");
      txt_l.setText("");
      txt_nombre.setText("");
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_limpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        info = new javax.swing.JTextArea();
        btn_salir = new javax.swing.JButton();
        cb_tipo = new javax.swing.JComboBox();
        btn_generar = new javax.swing.JButton();
        txt_nombre = new javax.swing.JTextField();
        txt_t = new javax.swing.JTextField();
        txt_l = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        info.setColumns(20);
        info.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info.setRows(5);
        jScrollPane1.setViewportView(info);

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        cb_tipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C" }));
        cb_tipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Categoría"));

        btn_generar.setText("Guardar y generar ");
        btn_generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generarActionPerformed(evt);
            }
        });

        txt_nombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombres"));

        txt_t.setBorder(javax.swing.BorderFactory.createTitledBorder("Unidad de tejas producidas"));

        txt_l.setBorder(javax.swing.BorderFactory.createTitledBorder("Unidad de losetas producidas"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txt_nombre)
                            .addGap(18, 18, 18)
                            .addComponent(cb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txt_t, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txt_l, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btn_generar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nombre)
                    .addComponent(cb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_t)
                    .addComponent(txt_l))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_generar)
                    .addComponent(btn_limpiar)
                    .addComponent(btn_salir))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generarActionPerformed
        
        
    //obteniendo información de Obrero (Mediante los TextField)
        
        String nombre = txt_nombre.getText();
    Double unidad_t = Double.parseDouble(txt_t.getText());
    Double unidad_l = Double.parseDouble(txt_l.getText());

        String cat= cb_tipo.getSelectedItem().toString();

        
        
        //Rellenando atributos de la instancia "C"
        C=new Obrero (nombre, cat, unidad_t, unidad_l); // Utilizando la clase
        
        //Limpiando área  
        limpiar_area();
        //Generando información en el Area de Texto
        
        info.append("Ver rendimiento del obrero                 \n\n");
        info.append("Nombre                             :"+C.nombre+"\n");
        info.append("Cantidad de Tejas producidas       :"+C.unidad_t+"\n");
        info.append("Cantidad de Losetas producidas     :"+C.unidad_l+"\n");
        info.append("Categoría                          :"+cat+"\n");
        info.append("Tarifa por Tejas                   :"+C.tarifa_tejas()+"\n");
        info.append("Tarifa por Losetas                 :"+C.tarifa_losetas()+"\n");
        info.append("Bonificación                       :"+C.bonificacion()+"\n");
        info.append("precio por unidades producidas     :"+C.unidad_total()+"\n");
        info.append("Descuento de seguro                : -75 \n");
        info.append("Sueldo Bruto                       :"+C.sueldobruto()+"\n");
        info.append("Suelto Total                       :"+C.seguro()+"\n");   
    }//GEN-LAST:event_btn_generarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
     
      limpiar_total();
      
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(View_Obreros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Obreros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Obreros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Obreros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Obreros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_generar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JComboBox cb_tipo;
    private javax.swing.JTextArea info;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_l;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_t;
    // End of variables declaration//GEN-END:variables
}
