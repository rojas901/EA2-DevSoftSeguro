/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iudigital.empresauxz;

import java.util.Random;

/**
 *
 * @author caran
 */
public class Inventario extends Thread {
    
    Producto productos[] = new Producto[Producto.TAMANIO];
    Random aleatorio = new Random();
    long tiempo = 0;
        
    public void llenar() {
        for (int i = 0; i < Producto.TAMANIO; i++) {

            int cantidad = aleatorio.nextInt(100, 5000);

            productos[i] = new Producto(i, cantidad);

            System.out.println("El producto " + productos[i].getId() + " tiene una cantidad de " + productos[i].getCantidad());
        }
    }
    
    @Override
    public void run() {
        for (int i = 0; i < Producto.TAMANIO; i++) {

            int cantidad = aleatorio.nextInt(100, 5000);

            productos[i] = new Producto(i, cantidad);

            System.out.println("El producto " + productos[i].getId() + " tiene una cantidad de " + productos[i].getCantidad());
        }
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }    
    
}
