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
public class Eliza {
      private Respuesta resp;
    private String tema;
    private String entrada;
    
    public Eliza(){
        resp = new Respuesta();
        tema = "";
    }
    
    public void setEntrada(String entrada){
        this.entrada = entrada;
        this.decidirRespuesta();
    }
    
    public void decidirRespuesta(){
        this.cleanTema();
        if ((this.entrada.contains("love"))||(this.entrada.contains("hate"))) {
            System.out.println(resp.respStrong());
        }else if(this.entrada.contains("my")){
            this.tema();
            System.out.println(this.resp.respTell(this.tema));            
        }else{
            System.out.println(this.resp.respNada());
        }
    }
    
    public void cleanTema(){
        this.tema = "";
    }
    
    
    public void tema(){
        int intIndex = entrada.indexOf("my");
        
        if ((this.entrada.charAt(intIndex+2)==' ')&&(this.entrada.charAt(intIndex-1)==' ')) {            
            for (int i = (intIndex+3); i < 100; i++) {
                if (this.entrada.charAt(i)!=' ') {
                    this.tema = tema+this.entrada.charAt(i);
                }else if ((this.entrada.charAt(i)==' ')||(this.entrada.charAt(i)=='\n')) {
                    break;
                }
            }
        }
    }

  
}
