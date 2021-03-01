/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gamezone1;

/**
 *
 * @author felipe
 */
public class War2 {
   
    public static void main(String[] args) {
        Card usuario= new Card(Palo.CORAZONES);
        Card computer= new Card(Palo.CORAZONES);
        
        System.out.println("Jugando cartas");
        System.out.println("Card user: "+ usuario.toString());
        System.out.println("Card computer: "+computer.toString());
        System.out.println();
        if(Card.ganador(usuario, computer)){
            System.out.println("Gano el usuario");
        }else{
            System.out.println("Gano la computadora");
        }
    }
}
