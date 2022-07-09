/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unal.basereto2;

/**
 *
 * @author Usuario
 */
public class Particular extends Vehiculo {

    String color;

    public Particular() {
        super();
    }

    public Particular(int pasajeros, String placa, String color) {
        super(placa, pasajeros);
        this.color = color;
    }

    @Override
    public void Imprimir() {
        System.out.println("\tPlaca: " + this.Placa);
        System.out.println("\tpasajeros: " + this.pasajeros);
        System.out.println("\tcolor: " + this.color);
    }

}
