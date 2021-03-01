/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gamezone3;

import java.util.Scanner;
/**
 *
 * @author felipe
 */
public class Test {
    public static void main(String[] args) {
        SecretPhrase palabra= new SecretPhrase("guero");
        Boolean gana= false;
        Scanner pen= new Scanner(System.in);
        
        System.out.println("Welcome");        
        System.out.println("Adivina la siguiente frase: "+ palabra.getFraseus());
        do{
            System.out.println("Dame una letra");            
            palabra.verificaLetra(pen.next());
            gana= palabra.ganar();
        }while(gana!=true);
        System.out.println("Felicidades adivinaste la palabra "+ palabra.getFrase());
    }
}
