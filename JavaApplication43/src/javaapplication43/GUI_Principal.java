/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication43;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
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
    PanelFinal panelFinal = new PanelFinal();
    FondoPanel fondo = new FondoPanel();
    /**
     * Creates new form GUI_Principal
     */
    public GUI_Principal() {
        //
        this.setContentPane(fondo);
        panelInicial.getTxaInicio().setText("INFORMACIÓN RELEVANTE\n" +
                    "\n" +
                    "Es requisito necesario para la adquisición de los productos que se ofrecen en este sitio, que lea y acepte los siguientes Términos y Condiciones que a continuación se redactan. El uso de nuestros servicios así como la compra de nuestros productos implicará que usted ha leído y aceptado los Términos y Condiciones de Uso en el presente documento. Todas los productos  que son ofrecidos por nuestro sitio web pudieran ser creadas, cobradas, enviadas o presentadas por una página web tercera y en tal caso estarían sujetas a sus propios Términos y Condiciones. En algunos casos, para adquirir un producto, será necesario el registro por parte del usuario, con ingreso de datos personales fidedignos y definición de una contraseña.\n" +
                    "\n" +
                    "El usuario puede elegir y cambiar la clave para su acceso de administración de la cuenta en cualquier momento, en caso de que se haya registrado y que sea necesario para la compra de alguno de nuestros productos.  no asume la responsabilidad en caso de que entregue dicha clave a terceros.\n" +
                    "\n" +
                    "Todas las compras y transacciones que se lleven a cabo por medio de este sitio web, están sujetas a un proceso de confirmación y verificación, el cual podría incluir la verificación del stock y disponibilidad de producto, validación de la forma de pago, validación de la factura (en caso de existir) y el cumplimiento de las condiciones requeridas por el medio de pago seleccionado. En algunos casos puede que se requiera una verificación por medio de correo electrónico.\n" +
                    "\n" +
                    "Los precios de los productos ofrecidos en esta Tienda Online es válido solamente en las compras realizadas en este sitio web.\n" +
                    "\n" +
                    "LICENCIA\n" +
                    "\n" +
                    "  a través de su sitio web concede una licencia para que los usuarios utilicen  los productos que son vendidos en este sitio web de acuerdo a los Términos y Condiciones que se describen en este documento.\n" +
                    "\n" +
                    "USO NO AUTORIZADO\n" +
                    "\n" +
                    "En caso de que aplique (para venta de software, templetes, u otro producto de diseño y programación) usted no puede colocar uno de nuestros productos, modificado o sin modificar, en un CD, sitio web o ningún otro medio y ofrecerlos para la redistribución o la reventa de ningún tipo.\n" +
                    "\n" +
                    "PROPIEDAD\n" +
                    "\n" +
                    "Usted no puede declarar propiedad intelectual o exclusiva a ninguno de nuestros productos, modificado o sin modificar. Todos los productos son propiedad  de los proveedores del contenido. En caso de que no se especifique lo contrario, nuestros productos se proporcionan  sin ningún tipo de garantía, expresa o implícita. En ningún esta compañía será  responsables de ningún daño incluyendo, pero no limitado a, daños directos, indirectos, especiales, fortuitos o consecuentes u otras pérdidas resultantes del uso o de la imposibilidad de utilizar nuestros productos.\n" +
                    "\n" +
                    "POLÍTICA DE REEMBOLSO Y GARANTÍA\n" +
                    "\n" +
                    "En el caso de productos que sean  mercancías irrevocables no-tangibles, no realizamos reembolsos después de que se envíe el producto, usted tiene la responsabilidad de entender antes de comprarlo.  Le pedimos que lea cuidadosamente antes de comprarlo. Hacemos solamente excepciones con esta regla cuando la descripción no se ajusta al producto. Hay algunos productos que pudieran tener garantía y posibilidad de reembolso pero este será especificado al comprar el producto. En tales casos la garantía solo cubrirá fallas de fábrica y sólo se hará efectiva cuando el producto se haya usado correctamente. La garantía no cubre averías o daños ocasionados por uso indebido. Los términos de la garantía están asociados a fallas de fabricación y funcionamiento en condiciones normales de los productos y sólo se harán efectivos estos términos si el equipo ha sido usado correctamente. Esto incluye:\n" +
                    "\n" +
                    "– De acuerdo a las especificaciones técnicas indicadas para cada producto.\n" +
                    "– En condiciones ambientales acorde con las especificaciones indicadas por el fabricante.\n" +
                    "– En uso específico para la función con que fue diseñado de fábrica.\n" +
                    "– En condiciones de operación eléctricas acorde con las especificaciones y tolerancias indicadas.\n" +
                    "\n" +
                    "COMPROBACIÓN ANTIFRAUDE\n" +
                    "\n" +
                    "La compra del cliente puede ser aplazada para la comprobación antifraude. También puede ser suspendida por más tiempo para una investigación más rigurosa, para evitar transacciones fraudulentas.");
        initComponents();
        btnAtras.setText("No Acepto");
        btnSiguiente.setText("Acepto");
        btnAgregar.setVisible(false);

        MainPanel.add(panelInicial);
        
        panelInicial.setVisible(true);
        panelFinal.setVisible(false);
        panelCat.getRbComida().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnSiguiente.setVisible(true);
                btnSiguiente.setText("Agregar");
                panelCat.setVisible(false);
                MainPanel.add(panelComida);
                panelTecno.setVisible(false);
                panelRopa.setVisible(false);
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
                panelComida.setVisible(false);
                panelTecno.setVisible(false);
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
                panelComida.setVisible(false);
                panelRopa.setVisible(false);
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
                && !panelCliente.getTxtDireccion().getText().isEmpty()){
            try{ 
                cliente.setApellido(panelCliente.getTxtApellidoCliente().getText());
                cliente.setNombre(panelCliente.getTxtNombreCliente().getText());
                cliente.setCedula(Integer.parseInt(panelCliente.getTxtCedula().getText()));
                cliente.setDireccion(panelCliente.getTxtDireccion().getText());
                cliente.setCarrito(new Carrito());
                btnSiguiente.setVisible(false);
                MainPanel.add(panelCat);
                panelCliente.setVisible(false);
                auxBtnAtras = 2;            
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(rootPane, "Error el dato ingresado no es del tipo correcto.");
            }
            
        }
        if ((panelComida.isVisible() && !panelComida.getTxtCantidad().getText().isEmpty() &&
                (panelComida.getRbHamburguesa().isSelected() || panelComida.getRbHelado().isSelected() ||
                panelComida.getRbHotDog().isSelected() || panelComida.getRbPastel().isSelected() ||
                panelComida.getRbPizza().isSelected() || panelComida.getRbPolloFrito().isSelected() ||
                panelComida.getRbTacos().isSelected()))|| 
                (panelRopa.isVisible() && !panelRopa.getTxtCantidad().getText().isEmpty() &&
                (panelRopa.getRbCamisa().isSelected() || panelRopa.getRbCamiseta().isSelected() ||
                panelRopa.getRbChaqueta().isSelected() || panelRopa.getRbMedias().isSelected() ||
                panelRopa.getRbPantalon().isSelected() || panelRopa.getRbVestido().isSelected() ||
                panelRopa.getRbZapatos().isSelected()))|| 
                (panelTecno.isVisible() && !panelTecno.getTxtCantidad().getText().isEmpty() &&
                (panelTecno.getRbAudifonos().isSelected() || panelTecno.getRbCamara().isSelected() ||
                panelTecno.getRbCelular().isSelected() || panelTecno.getRbComputadora().isSelected() ||
                panelTecno.getRbReloj().isSelected() || panelTecno.getRbTablet().isSelected() ||
                panelTecno.getRbTelevision().isSelected()))){
            try{
                
                    if(panelComida.isVisible()){
                         if(Integer.parseInt(panelComida.getTxtCantidad().getText()) < 0 ){
                            panelComida.getBtgComida().clearSelection();
                            panelComida.getTxtCantidad().setText("");
                            panelTecno.getBtgTecno().clearSelection();
                            panelTecno.getTxtCantidad().setText("");
                            JOptionPane.showMessageDialog(rootPane, "Error la cantidad debe ser mayor que 0."); 
                        }else{
                            cliente.getCarrito().agregarProducto(new Comida(panelComida.getTipoComida(),Integer.parseInt(panelComida.getTxtCantidad().getText())));
                            ((Producto) cliente.getCarrito().getProductos().get(cliente.getCarrito().getProductos().size() - 1)).obtenerPrecioUnit();
                            panelComida.getBtgComida().clearSelection();
                            panelComida.getTxtCantidad().setText("");
                            btnAgregar.setVisible(true);
                            btnAtras.setText("Modificar");
                            btnSiguiente.setText("Confirmar");
                            MainPanel.add(panelCarrito);
                            panelComida.setVisible(false);
                            panelRopa.setVisible(false);
                            panelTecno.setVisible(false);
                            panelCarrito.setVisible(true);
                            auxBtnAtras = 4;
                        }
                    } 
                    if(panelRopa.isVisible()){
                        if(Integer.parseInt(panelRopa.getTxtCantidad().getText()) < 0 ){
                            panelComida.getBtgComida().clearSelection();
                            panelComida.getTxtCantidad().setText("");
                            panelRopa.getBtgRopa().clearSelection();
                            panelRopa.getBtgTalla().clearSelection();
                            panelRopa.getTxtCantidad().setText("");
                            panelTecno.getBtgTecno().clearSelection();
                            panelTecno.getTxtCantidad().setText("");
                            JOptionPane.showMessageDialog(rootPane, "Error la cantidad debe ser mayor que 0."); 
                        }else{
                            cliente.getCarrito().agregarProducto(new Ropa(panelRopa.getTipoRopa(),Integer.parseInt(panelRopa.getTxtCantidad().getText()),panelRopa.getTalla()));
                            ((Producto) cliente.getCarrito().getProductos().get(cliente.getCarrito().getProductos().size() - 1)).obtenerPrecioUnit();
                            panelRopa.getBtgRopa().clearSelection();
                            panelRopa.getBtgTalla().clearSelection();
                            panelRopa.getTxtCantidad().setText("");
                            btnAgregar.setVisible(true);
                            btnAtras.setText("Modificar");
                            btnSiguiente.setText("Confirmar");
                            MainPanel.add(panelCarrito);
                            panelComida.setVisible(false);
                            panelRopa.setVisible(false);
                            panelTecno.setVisible(false);
                            panelCarrito.setVisible(true);
                            auxBtnAtras = 4;
                        }
           
                    } 
                    if(panelTecno.isVisible()){
                        if(Integer.parseInt(panelTecno.getTxtCantidad().getText()) < 0 ){
                            panelTecno.getBtgTecno().clearSelection();
                            panelTecno.getTxtCantidad().setText("");
                            JOptionPane.showMessageDialog(rootPane, "Error la cantidad debe ser mayor que 0."); 
                        }else{
                            cliente.getCarrito().agregarProducto(new Tecnologia(panelTecno.getTipoTecno(),Integer.parseInt(panelTecno.getTxtCantidad().getText())));
                            ((Producto) cliente.getCarrito().getProductos().get(cliente.getCarrito().getProductos().size() - 1)).obtenerPrecioUnit();
                            panelTecno.getBtgTecno().clearSelection();
                            panelTecno.getTxtCantidad().setText("");
                            btnAgregar.setVisible(true);
                            btnAtras.setText("Modificar");
                            btnSiguiente.setText("Confirmar");
                            MainPanel.add(panelCarrito);
                            panelComida.setVisible(false);
                            panelRopa.setVisible(false);
                            panelTecno.setVisible(false);
                            panelCarrito.setVisible(true);
                            auxBtnAtras = 4;
                        }
                    }
                    
                
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(rootPane, "Error el dato ingresado no es del tipo correcto.");
            }
            if(!cliente.getCarrito().getProductos().isEmpty()){
                panelCarrito.getTxaCarrito().setText("Producto\t\tPrecio\t\tCantidad\n"+
                                                     cliente.getCarrito().toString()+
                                                    "Total:\t\t\t\t" + cliente.getCarrito().obtenerPrecioTotal());
            }
        }else if (panelCarrito.isVisible() && !panelCarrito.getTxaCarrito().getText().isEmpty()){
            System.exit(0);
        }
        
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
            cliente.getCarrito().getProductos().remove(cliente.getCarrito().getProductos().size()-1);
            btnAgregar.setVisible(false);
            btnSiguiente.setVisible(false);
            btnAtras.setText("Atrás");
            panelCarrito.setVisible(false);
            panelCat.setVisible(true);
            panelCat.getButtonGroupCategoria().clearSelection();
            auxBtnAtras = 2;
        }
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        if (panelCarrito.isVisible() && (auxBtnAtras == 4)){
            btnAgregar.setVisible(false);
            btnSiguiente.setVisible(false);
            btnAtras.setText("Atrás");
            panelCarrito.setVisible(false);
            panelCat.setVisible(true);
            panelCat.getButtonGroupCategoria().clearSelection();
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
    class FondoPanel extends JPanel{
    private Image imagen;
    
    @Override
    public void paint (Graphics g){
        imagen = new ImageIcon(getClass().getResource("/Imagenes/imagen.jpg")).getImage();
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
    }
    
}

}
