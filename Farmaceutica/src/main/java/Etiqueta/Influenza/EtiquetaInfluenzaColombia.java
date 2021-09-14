/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Etiqueta.Influenza;

/**
 *
 * @author Weriko
 */
public class EtiquetaInfluenzaColombia implements IInfluenza{

      public String describir(){
        return usoInfluenza()+ "USO EN COLOMBIA";
    }

  
    @Override
    public String usoInfluenza() {
       return "Poner para influeza";
    }
    public String toString() {
        return describir();
    }
}
