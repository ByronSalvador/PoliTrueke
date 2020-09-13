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
public class Tecnologia extends Producto{
    public String tipoTecnologia;

    public Tecnologia(String tipoTecnologia, int cantidad) {
        this.tipoTecnologia = tipoTecnologia;
        this.cantidad = cantidad;
    }
    
    
    
    @Override
    public void obtenerPrecioUnit(){
       switch (this.tipoTecnologia) {
            case "Audifonos":
                this.precioUnit = 19.99;
                break;
            case "Celular":
                this.precioUnit = 199.99;
                break;
            case "Tablet":
                this.precioUnit = 99.99;
                break;
            case "Reloj":
                this.precioUnit = 49.99;
                break;
            case "Computadora":
                this.precioUnit = 399.99;
                break;
            case "Television":
                this.precioUnit = 699.99;
                break;
            case "Camara":
                this.precioUnit = 299.99;
                break;
            default:
                break;
        }
    }
    
    @Override
    public String toString() {
        return this.tipoTecnologia + "\t\t" + this.precioUnit + "\t\t" + this.cantidad;
    }
}
