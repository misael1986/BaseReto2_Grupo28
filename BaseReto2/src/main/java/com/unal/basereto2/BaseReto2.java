/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.unal.basereto2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class BaseReto2 {

    public static void main(String[] args) {
        List<Vehiculo> inventario= new ArrayList<>();
        
        //Particular p1=new Particular(5, "ABC 123", "Negro Mate");
        //Comercial c1= new Comercial("IOA 568",3);
        
        inventario.add(new Particular(5, "ABC 123", "Negro Mate"));
        inventario.add(new Comercial("IOA 568",3));
        
        for(Vehiculo vel:inventario){
            vel.Imprimir();
        }
        
        
        
    }
}
