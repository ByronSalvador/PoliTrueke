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
    private ArrayList<Producto> productos = new ArrayList<>();
    private int codCarrito;

    public ArrayList getProductos() {
        return productos;
    }
    
    public void agregarProducto(Producto producto){
        this.productos.add(producto);    
    }
    
    public double obtenerPrecioTotal(){
        double precioTotal = 0;
        Iterator <Producto> iterador = this.productos.iterator();
        for (Object p : this.productos) {
            precioTotal += ((Producto) p).precioUnit * ((Producto) p).cantidad;
        }
        return precioTotal;
    }

    @Override
    public String toString() {
        String toString = "";
        for (Object p : this.productos) {
            toString += p.toString() + "\n";
        }
        return toString;
    }
    
    
}
