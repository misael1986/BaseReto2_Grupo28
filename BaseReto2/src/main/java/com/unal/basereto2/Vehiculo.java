/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unal.basereto2;

/**
 *
 * @author Usuario
 */
public class Vehiculo {
    String Placa;
    int pasajeros;
    
    public Vehiculo(){
    }

    public Vehiculo(String Placa, int pasajeros) {
        this.Placa = Placa;
        this.pasajeros = pasajeros;
    }
    
    public void Imprimir(){
        System.out.println("\tPlaca: "+this.Placa);
        System.out.println("\tpasajeros: "+this.pasajeros);
    }
}
