/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegos.minecraft;

import juegos.IJuego;

/**
 *
 * @author Weriko
 */

public class MinecraftXbox implements IJuego, IMinecraft {
    public String jugar(){
        return "Juego minecraft en xbox";
        
    }
    public String construir(){
        return "a";
    }
    
}