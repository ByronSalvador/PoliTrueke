/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication43;

/**
 *
 * @author ANDRES
 */
public class Comida extends Producto{
    public String tipoComida;
    
    public Comida(String tipoComida,int cantidad) {
        this.tipoComida = tipoComida;
        this.cantidad = cantidad;
    }    
    
    @Override
    public void obtenerPrecioUnit(){
       switch (this.tipoComida) {
            case "Pizza":
                this.precioUnit = 9.99;
                break;
            case "Hamburguesa":
                this.precioUnit = 3.99;
                break;
            case "Hot-Dog":
                this.precioUnit = 2.99;
                break;
            case "Tacos":
                this.precioUnit = 3.99;
                break;
            case "Pollo-Frito":
                this.precioUnit = 2.99;
                break;
            case "Helado":
                this.precioUnit = 1.50;
                break;
            case "Pastel":
                this.precioUnit = 3.99;
                break;
            default:
                break;
        }
    }

    @Override
    public String toString() {
        return this.tipoComida + "\t\t" + this.precioUnit + "\t\t" + this.cantidad;
    }
    
}

