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
public class Ropa extends Producto{
    public String tipoRopa;
    public int talla;

    public Ropa(String tipoRopa, int cantidad) {
        this.tipoRopa = tipoRopa;
        this.cantidad = cantidad;
    }
    
    /**
     *
     */
    @Override
    public void obtenerPrecioUnit(){
       switch (this.tipoRopa) {
            case "Pantalon":
                this.precioUnit = 14.99;
                break;
            case "Camiseta":
                this.precioUnit = 6.99;
                break;
            case "Camisa":
                this.precioUnit = 14.99;
                break;
            case "Chaqueta":
                this.precioUnit = 29.99;
                break;
            case "Medias":
                this.precioUnit = 2.99;
                break;
            case "Zapatos":
                this.precioUnit = 49.99;
                break;
            case "Vestido":
                this.precioUnit = 29.99;
                break;
            default:
                break;
        }
    }
    @Override
    public String toString() {
        return this.tipoRopa + "\t\t" + this.precioUnit + "\t\t" + this.cantidad;
    }
}
