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
public class Pedidos extends Thread {
    
    Producto pedidos[] = new Producto[Producto.TAMANIO];
    Random aleatorio = new Random();
    long tiempo = 0;
        
    public void llenar() {
        for (int i = 0; i < Producto.TAMANIO; i++) {

            int cantidad = aleatorio.nextInt(100, 5000);

            pedidos[i] = new Producto(i, cantidad);

            System.out.println("El producto " + pedidos[i].getId() + " tiene un pedido de " + pedidos[i].getCantidad());
        }
    }
    
    @Override
    public void run() {
        for (int i = 0; i < Producto.TAMANIO; i++) {

            int cantidad = aleatorio.nextInt(100, 5000);

            pedidos[i] = new Producto(i, cantidad);

            System.out.println("El producto " + pedidos[i].getId() + " tiene un pedido de " + pedidos[i].getCantidad());
        }
    }    
    
    public void obtenerMayorPedido() {
        int mayor = 0;
        for (Producto p : this.pedidos) {
            if (p.getCantidad() > mayor) {
                mayor = p.getCantidad();
            }            
        }
        
        System.out.println("El mayor pedido fue: " + mayor);
    }

    public Producto[] getPedidos() {
        return pedidos;
    }

    public void setPedidos(Producto[] pedidos) {
        this.pedidos = pedidos;
    }    
            
}
