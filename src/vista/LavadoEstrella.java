package vista;

import controlador.Coordinador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/*

Johan Sebastian Moreno Lugo

*/
public class LavadoEstrella extends javax.swing.JFrame implements ActionListener {

    private Coordinador miCoordinador = new Coordinador();
    public double total = 0;

    public LavadoEstrella() {
        initComponents();
        setSize(500, 400);
        setResizable(false);
        setTitle("Lava Autos la Estrella");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        btnAgregarServicio.addActionListener(this);
        btnServicios.addActionListener(this);
        btnLimpiar.addActionListener(this);
        btnProduccionServicio.addActionListener(this);
        btnProduccionFuncionario.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnAgregarServicio) {
            if (txtFecha.getText().equals("") || txtServicio.getText().equals("") || txtTipoVehiculo.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Debe diligenciar todos los campos");
            } else {
                String nombreEmpleado = miCoordinador.buscarEmpleado(txtServicio.getText().trim());
                total = miCoordinador.buscarPrecio(txtServicio.getText().trim());
                String totalUno = String.valueOf(total);
                String tipoVehiculo = miCoordinador.tipoVehiculo(txtTipoVehiculo.getText().trim());
                txtTotal.setText(totalUno);               
                miCoordinador.agregarCarrito(txtFecha.getText().trim(), txtServicio.getText().trim(), txtTipoVehiculo.getText().trim(), total, nombreEmpleado);
                miCoordinador.buscarServicio(txtServicio.getText().trim());
            }
        }
        if (e.getSource() == btnServicios) {
            miCoordinador.visualizarServicios();
        }
        if (e.getSource() == btnLimpiar) {
            txtFecha.setText("");
            txtServicio.setText("");
            txtTipoVehiculo.setText("");
            txtTotal.setText("");
        }
        if(e.getSource() == btnProduccionServicio){
            double totalServicio = miCoordinador.produccionServicio(txtServicio.getText().trim());
            JOptionPane.showMessageDialog(null, "Servicio: " + txtServicio.getText().trim() + "\n" + 
                                                "Total: $" + totalServicio);
        }
        if(e.getSource()== btnProduccionFuncionario){
            double totalFuncionario = miCoordinador.produccionFuncionario(txtServicio.getText().trim());
            JOptionPane.showMessageDialog(null, "Empleado: " + miCoordinador.buscarEmpleado(txtServicio.getText().trim()) + "\n" + 
                                                "Total: $" + totalFuncionario);
        }
    }

    public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAgregarServicio = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtServicio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        txtTipoVehiculo = new javax.swing.JTextField();
        btnServicios = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnProduccionServicio = new javax.swing.JButton();
        btnProduccionFuncionario = new javax.swing.JButton();
        btnProduccionFecha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LAVADO DE AUTOS LA ESTRELLA");

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tipo Vehículo:");

        btnAgregarServicio.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregarServicio.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnAgregarServicio.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarServicio.setText("Agregar");
        btnAgregarServicio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregarServicio.setBorderPainted(false);
        btnAgregarServicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarServicioActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha:");

        txtFecha.setBackground(new java.awt.Color(153, 0, 0));
        txtFecha.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(255, 255, 255));
        txtFecha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Servicio:");

        txtServicio.setBackground(new java.awt.Color(153, 0, 0));
        txtServicio.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtServicio.setForeground(new java.awt.Color(255, 255, 255));
        txtServicio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total");

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(153, 0, 0));
        txtTotal.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(255, 255, 255));
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtTipoVehiculo.setBackground(new java.awt.Color(153, 0, 0));
        txtTipoVehiculo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtTipoVehiculo.setForeground(new java.awt.Color(255, 255, 255));
        txtTipoVehiculo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnServicios.setBackground(new java.awt.Color(0, 0, 0));
        btnServicios.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnServicios.setForeground(new java.awt.Color(255, 255, 255));
        btnServicios.setText("Servicios");
        btnServicios.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnServicios.setBorderPainted(false);
        btnServicios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnLimpiar.setBackground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnProduccionServicio.setBackground(new java.awt.Color(0, 0, 0));
        btnProduccionServicio.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnProduccionServicio.setForeground(new java.awt.Color(255, 255, 255));
        btnProduccionServicio.setText("Producción Servicio");
        btnProduccionServicio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnProduccionServicio.setBorderPainted(false);
        btnProduccionServicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnProduccionFuncionario.setBackground(new java.awt.Color(0, 0, 0));
        btnProduccionFuncionario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnProduccionFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        btnProduccionFuncionario.setText("Producción Funcionario");
        btnProduccionFuncionario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnProduccionFuncionario.setBorderPainted(false);
        btnProduccionFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnProduccionFecha.setBackground(new java.awt.Color(0, 0, 0));
        btnProduccionFecha.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnProduccionFecha.setForeground(new java.awt.Color(255, 255, 255));
        btnProduccionFecha.setText("Producción Fecha");
        btnProduccionFecha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnProduccionFecha.setBorderPainted(false);
        btnProduccionFecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProduccionFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProduccionFechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(45, 45, 45)
                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel3))
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(btnAgregarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(btnProduccionServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(337, 337, 337)
                .addComponent(btnProduccionFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(337, 337, 337)
                .addComponent(btnProduccionFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel2))
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(txtTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(8, 8, 8)
                                .addComponent(jLabel4))
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProduccionServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(btnProduccionFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnProduccionFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarServicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarServicioActionPerformed

    private void btnProduccionFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProduccionFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProduccionFechaActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(LavadoEstrella.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(LavadoEstrella.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(LavadoEstrella.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(LavadoEstrella.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new LavadoEstrella().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAgregarServicio;
    public javax.swing.JButton btnLimpiar;
    public javax.swing.JButton btnProduccionFecha;
    public javax.swing.JButton btnProduccionFuncionario;
    public javax.swing.JButton btnProduccionServicio;
    public javax.swing.JButton btnServicios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txtFecha;
    public javax.swing.JTextField txtServicio;
    public javax.swing.JTextField txtTipoVehiculo;
    public javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

}
