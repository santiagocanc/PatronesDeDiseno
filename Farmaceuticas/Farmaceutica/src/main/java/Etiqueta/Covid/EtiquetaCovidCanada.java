/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Etiqueta.Covid;

/**
 *
 * @author Weriko
 */
public class EtiquetaCovidCanada implements ICovid{
   
 public String describir(){
        return usoCovid()+ "USO EN CANADA";
    }

   

   public String usoCovid(){
       return "Esta es para el covid ";
   }
    
   public String toString() {
        return describir();
    }
}
