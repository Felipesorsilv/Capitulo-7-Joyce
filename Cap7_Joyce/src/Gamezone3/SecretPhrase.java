/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gamezone3;

/**
 *
 * @author felipe
 */
public class SecretPhrase {
   
    private String frase;
    private Integer letras;
    private String fraseus;

    public SecretPhrase(String frase) {
        this.frase = frase;
        this.letras = frase.length() - 1;
        this.fraseus = new String(new char[frase.length()]).replace("\0", "*");
        this.ayuda();
    }

    public String getFrase() {
        return frase;
    }

    public Integer getLetras() {
        return letras;
    }

    public String getFraseus() {
        return fraseus;
    }

    private void ayuda(){
        int valor= (int) (Math.random()*this.frase.length()+0);
        //System.out.println(valor);
        String nuevo = "";
        for (int i = 0; i < frase.length(); i++) {
            if (i==valor) {
                nuevo += frase.charAt(valor);
            } else {
                nuevo += "*";
            }
        }
        this.fraseus=nuevo;
       
    }
    
    public void verificaLetra(String a) {
        String nuevo = "";
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == a.charAt(0)) {
                nuevo += a.charAt(0);
            } else if (fraseus.charAt(i) != '*') {
                nuevo += frase.charAt(i);
            } else {
                nuevo += "*";
            }
        }
        this.fraseus=nuevo;
    }
    
    public Boolean ganar(){
        if(frase.equals(fraseus)){
            return true;
        }else{
            System.out.println("Sigue intentando\n Frase "+ this.getFraseus());
            return false;
        }
    } 
}
