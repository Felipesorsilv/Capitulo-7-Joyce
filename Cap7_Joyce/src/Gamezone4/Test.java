/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gamezone4;

import java.util.Scanner;
/**
 *
 * @author felipe   
 */
public class Test {
    
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Eliza e = new Eliza();
        String entrada;
        
        System.out.println("Bienvenido a ELiza");
        System.out.println("Introduzca su entrada");
        
        do {            
            entrada = leer.nextLine();
            if (entrada.contains("goodbye")) {
                break;
            }
            entrada = " "+entrada+" ";
            e.setEntrada(entrada);       
            
        } while (true);
        
        
        
        
        
    }
}
