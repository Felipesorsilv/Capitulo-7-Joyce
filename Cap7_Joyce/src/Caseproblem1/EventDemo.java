/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caseproblem1;

import java.util.Scanner;
/**
 *
 * @author felipe
 */
public class EventDemo {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        
        
        Event ev1 = new Event();
        System.out.println("Introduzca el Numero de evento");
        String event = leer.nextLine();
        
        if (((event.charAt(0)>=65)&&(event.charAt(0)<=90))&&(event.length()==4)) {
            if (((event.charAt(1)>=48)&&(event.charAt(1)<=57))) {
                if (((event.charAt(2)>=48)&&(event.charAt(2)<=57))) {
                    if (((event.charAt(3)>=48)&&(event.charAt(3)<=57))) {
                        
                    }else{
                        event = "A000";
                    }
                }else{
                    event = "A000";
                }
            }else{
                event = "A000";
            }
        }else{
            event = "A000";
        }
        event = event.toUpperCase();
        
        int n = 0;
        
        do {
            System.out.println("Introduzca el numero de invitados");
            n = leer.nextInt();
            leer.nextLine();
            if ((n>=5)&&(n<=100)) {
                break;
            }
        } while (true);
        
        Event ev2 = new Event(event, n);
        
        System.out.println("Intoduzca el número telefónico");        
        ev2.setPhoneNumber(leer.nextLine());
        
        System.out.println(ev2.getPhoneNumber());
        
        
        
        for (int i = 0; i < ev2.getNGuests(); i++) {
            System.out.println("Please come to my event");
        }
        
        System.out.println(ev1+"\n"+ev2);
        
    }
}
