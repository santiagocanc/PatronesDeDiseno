/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import juegos.IJuego;
import juegos.apex.ApexXbox;
import juegos.fifita.FifaXbox;
import juegos.minecraft.MinecraftXbox;

/**
 *
 * @author Weriko
 */
public class XboxFactory implements IGameFactory{
    public ApexXbox getApex(){
        return new ApexXbox();
    }
    public FifaXbox getFifa(){
        return new FifaXbox();
    }
    public MinecraftXbox getMinecraft(){
        return new MinecraftXbox();
    }
    public IJuego getGame(int i){
        IJuego juegos[] = {getApex(), getFifa(), getMinecraft()};
        return juegos[i];
    }
    
}
