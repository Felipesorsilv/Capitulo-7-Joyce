/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gamezone4;

/**
 *
 * @author felipe
 */
public class Respuesta {
    private String resp;
    
    public Respuesta(){
        resp = null;
    }
    
    public String respTell(String tema){
        return ("E.- Tell me more about your "+tema);
    }
    
    public String respStrong(){
        return "E.- You have strong feelings about that";
    }
    
    public String respNada(){
        return "E.- Tell me more";
    }
}
