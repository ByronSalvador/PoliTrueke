/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication43;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author ANDRES
 */
public class Carrito {
    private ArrayList productos;
    private int codCarrito;

    public ArrayList getProductos() {
        return productos;
    }
    
    public void agregarProducto(Producto producto, int cantidad){
        for(int i = 0; i < cantidad; i++){
            this.productos.add(producto);
        }
    }
    
    public double obtenerPrecioTotal(){
        double precioTotal = 0;
        Iterator <String> iterador = this.productos.iterator();
        for (Object p : this.productos) {
            precioTotal += ((Producto) p).precioUnit * ((Producto) p).cantidad;
        }
        return precioTotal;
    }
}
