/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication43;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
//import sun.awt.WindowClosingListener;

/**
 *
 * @author GANDHY
 */
public class GUI_Principal extends javax.swing.JFrame {
    int auxBtnAtras = 0;
    Cliente cliente = new Cliente();
    
    PanelInicial panelInicial = new PanelInicial();
    PanelCliente panelCliente = new PanelCliente();
    PanelCategoria panelCat = new PanelCategoria();
    PanelComida panelComida = new PanelComida();
    PanelRopa panelRopa = new PanelRopa();
    PanelTecnologia panelTecno = new PanelTecnologia();
    PanelCarrito panelCarrito = new PanelCarrito();
    
    /**
     * Creates new form GUI_Principal
     */
    public GUI_Principal() {
        // 
        initComponents();
        btnAtras.setText("No Acepto");
        btnSiguiente.setText("Acepto");
        btnAgregar.setVisible(false);

        MainPanel.add(panelInicial);
        
        panelInicial.setVisible(true);

        panelCat.getRbComida().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnSiguiente.setVisible(true);
                btnSiguiente.setText("Agregar");
                panelCat.setVisible(false);
                MainPanel.add(panelComida);
                panelComida.setVisible(true);
                auxBtnAtras = 3;
            }
        });
        panelCat.getRbRopa().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnSiguiente.setVisible(true);
                btnSiguiente.setText("Agregar");
                panelCat.setVisible(false);
                MainPanel.add(panelRopa);
                panelRopa.setVisible(true);
                auxBtnAtras = 3;
            }
        });
        panelCat.getRbTecnologia().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnSiguiente.setVisible(true);
                btnSiguiente.setText("Agregar");
                panelCat.setVisible(false);
                MainPanel.add(panelTecno);
                panelTecno.setVisible(true);
                auxBtnAtras = 3;
            }
        });
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAtras = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        MainPanel = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tienda Virtual");

        btnAtras.setText("Atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        MainPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MainPanel.setLayout(new java.awt.BorderLayout());

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                        .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtras)
                    .addComponent(btnSiguiente)
                    .addComponent(btnAgregar))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        // TODO add your handling code here:
        if (panelInicial.isVisible()){
            btnAtras.setText("Atrás");
            btnSiguiente.setText("Ingresar");
            MainPanel.add(panelCliente);
            panelInicial.setVisible(false);
            panelCliente.setVisible(true);
            auxBtnAtras = 1;
        }
        if (panelCliente.isVisible() && !panelCliente.getTxtNombreCliente().getText().isEmpty()
                && !panelCliente.getTxtApellidoCliente().getText().isEmpty() 
                && !panelCliente.getTxtCedula().getText().isEmpty()
                && !panelCliente.getTxtCorreo().getText().isEmpty()){
            btnSiguiente.setVisible(false);
            MainPanel.add(panelCat);
            panelCliente.setVisible(false);
            auxBtnAtras = 2;
            
            try{
                cliente.setApellido(panelCliente.getTxtApellidoCliente().getText());
                cliente.setNombre(panelCliente.getTxtNombreCliente().getText());
                cliente.setCedula(Integer.parseInt(panelCliente.getTxtCedula().getText()));
                cliente.setCorreo(panelCliente.getTxtCorreo().getText());
                cliente.setCarrito(new Carrito());
            }catch(Exception e){
                
            }
            
        }
        if ((panelComida.isVisible() && !panelComida.getTxtCantidad().getText().isEmpty())|| 
                (panelRopa.isVisible() && !panelRopa.getTxtCantidad().getText().isEmpty())|| 
                (panelTecno.isVisible() && !panelTecno.getTxtCantidad().getText().isEmpty())){
            btnAgregar.setVisible(true);
            btnAtras.setText("Modificar");
            btnSiguiente.setText("Confirmar");
            MainPanel.add(panelCarrito);
            try{
                if(panelComida.isVisible()){
                    cliente.getCarrito().agregarProducto(new Comida(panelComida.getTipoComida(),Integer.parseInt(panelComida.getTxtCantidad().getText())));
                    ((Producto) cliente.getCarrito().getProductos().get(cliente.getCarrito().getProductos().size() - 1)).obtenerPrecioUnit();
                    panelComida.getBtgComida().clearSelection();
                    panelComida.getTxtCantidad().setText("");
                }else if(panelRopa.isVisible()){
                    cliente.getCarrito().agregarProducto(new Ropa(panelRopa.getTipoRopa(),Integer.parseInt(panelRopa.getTxtCantidad().getText())));
                    ((Producto) cliente.getCarrito().getProductos().get(cliente.getCarrito().getProductos().size() - 1)).obtenerPrecioUnit();
                    panelRopa.getBtgRopa().clearSelection();
                    panelRopa.getTxtCantidad().setText("");
                }else if(panelTecno.isVisible()){
                    cliente.getCarrito().agregarProducto(new Ropa(panelTecno.getTipoTecno(),Integer.parseInt(panelTecno.getTxtCantidad().getText())));
                    ((Producto) cliente.getCarrito().getProductos().get(cliente.getCarrito().getProductos().size() - 1)).obtenerPrecioUnit();
                    panelTecno.getBtgTecno().clearSelection();
                    panelTecno.getTxtCantidad().setText("");
                }
            }catch(NumberFormatException e){
            }
            panelComida.setVisible(false);
            panelRopa.setVisible(false);
            panelTecno.setVisible(false);
            panelCarrito.setVisible(true);
            auxBtnAtras = 4;
        
        
        if(!cliente.getCarrito().getProductos().isEmpty()){
            panelCarrito.getTxaCarrito().setText("Producto\t\tCantidad\t\tPrecio\n"+
                                                 cliente.getCarrito().toString()+
                                                "Total:\t\t\t\t" + cliente.getCarrito().obtenerPrecioTotal());
        }
        }
        
        /*if (panelCarrito.isVisible() && !panelCarrito.getTxaCarrito().getText().isEmpty()){
            
           System.exit(0);
        }*/
        
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        if (panelInicial.isVisible()){
            System.exit(0);
        }
        if (panelCliente.isVisible() && (auxBtnAtras == 1)){
            btnAtras.setText("No Acepto");
            btnSiguiente.setText("Acepto");
            panelCliente.setVisible(false);
            panelInicial.setVisible(true);
            auxBtnAtras = 0;
        }
        if (panelCat.isVisible() && (auxBtnAtras == 2)){
            btnAtras.setText("Atrás");
            btnSiguiente.setVisible(true);
            btnSiguiente.setText("Ingresar");
            panelCat.setVisible(false);
            panelCliente.setVisible(true);
            auxBtnAtras = 1;
        }
        if ((panelComida.isVisible() || panelRopa.isVisible() || panelTecno.isVisible()) && 
                (auxBtnAtras == 3)){
            btnSiguiente.setVisible(false);
            panelComida.setVisible(false);
            panelRopa.setVisible(false);
            panelTecno.setVisible(false);
            panelCat.setVisible(true);
            auxBtnAtras = 2;
        }
        if (panelCarrito.isVisible() && (auxBtnAtras == 4)){
            btnAgregar.setVisible(false);
            btnSiguiente.setVisible(false);
            panelCarrito.setVisible(false);
            panelCat.setVisible(true);
            auxBtnAtras = 2;
        }
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        if (panelCarrito.isVisible() && (auxBtnAtras == 4)){
            btnAgregar.setVisible(false);
            btnSiguiente.setVisible(false);
            panelCarrito.setVisible(false);
            panelCat.setVisible(true);
            auxBtnAtras = 2;
        }
        
    }//GEN-LAST:event_btnAgregarActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnSiguiente;
    // End of variables declaration//GEN-END:variables
}
