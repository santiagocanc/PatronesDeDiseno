/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegos.fifita;
import juegos.*;
/**
 *
 * @author Weriko
 */
 
public class FifaPC implements IJuego, IFifa{
    public String jugar(){
        return "Fifa es un juego muy malo, pero en pc";
    }
    public String patear(){
        return "pateo";
    }
}