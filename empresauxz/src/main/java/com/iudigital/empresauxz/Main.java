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
public class Main {
    
    public static void main(String[] args) {
        
        long inicio = System.currentTimeMillis();        
        Inventario inventario = new Inventario();
        Pedidos pedidos = new Pedidos();
        Stock stock = new Stock();
        
        inventario.llenar();
        pedidos.llenar();       
        
        stock.llenar(inventario.getProductos(), pedidos.getPedidos());  
        
        pedidos.obtenerMayorPedido();
        
        long fin = System.currentTimeMillis();
        long tiempo = (fin - inicio)/1000;
        System.out.println("Normal Tiempo: " + tiempo + " seg");
        
    }
       
}
