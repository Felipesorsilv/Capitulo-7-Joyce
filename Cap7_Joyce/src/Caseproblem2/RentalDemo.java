/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caseproblem2;

import java.util.Scanner;
/**
 *
 * @author felipe
 */
public class RentalDemo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca el numero de contracto");
        String n = leer.nextLine();
        
        if (((n.charAt(0)>=65)&&(n.charAt(0)<=90))&&(n.length()==4)) {
            if (((n.charAt(1)>=48)&&(n.charAt(1)<=57))) {
                if (((n.charAt(2)>=48)&&(n.charAt(2)<=57))) {
                    if (((n.charAt(3)>=48)&&(n.charAt(3)<=57))) {
                        
                    }else{
                        n = "A000";
                    }
                }else{
                    n = "A000";
                }
            }else{
                n = "A000";
            }
        }else{
            n = "A000";
        }
        n = n.toUpperCase();
        
        
        int m = 0;
        do {
            System.out.println("Introduzca el numero de minutos");
            m = leer.nextInt();
            if ((m>=60)||(m<=7200)) {
                break;
            }
        } while (true);       
        
        
        
        Rental r1 = new Rental(m, n);
        Rental r2 = new Rental();
        
        System.out.println("Intoduzca el número telefónico");        
        r1.setPhoneNumber(leer.nextLine());
        
        System.out.println(r1.getPhoneNumber());
        
        
        for (int i = 0; i < r1.getNum_hours(); i++) {
            System.out.println("Coupon good for 10 percent off nextal rental");
        }
        
        System.out.println(r1+"\n"+r2);
        
    }
}
