/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iudigital.empresauxz;

/**
 *
 * @author caran
 */
public class Stock {
    
    Producto stock[] = new Producto[Producto.TAMANIO];   
        
    public void llenar(Producto[] A, Producto[] B) {
        
        for (int i = 0; i < Producto.TAMANIO; i++) {
            
            int compras = 0;

            if (A[i].getCantidad() == B[i].getCantidad()) {
                compras = A[i].getCantidad();
            }else if (B[i].getCantidad() > A[i].getCantidad()) {
                compras = (B[i].getCantidad() - A[i].getCantidad()) * 2;
            }else {
                compras = B[i].getCantidad();
            }

            this.stock[i] = new Producto(i, compras);

            System.out.println("El producto " + this.stock[i].getId() + " requiere una cantidad de " + this.stock[i].getCantidad());
        }
        
    }
    

    public Producto[] getStock() {
        return stock;
    }

    public void setStock(Producto[] stock) {
        this.stock = stock;
    }

     
}
