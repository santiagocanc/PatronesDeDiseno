/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;
import juegos.apex.*;
import juegos.fifita.*;
import juegos.*;
import juegos.minecraft.*;
/**
 *
 * @author Weriko
 */
public class PCFactory implements IGameFactory{
    public ApexPC getApex(){
        return new ApexPC();
    }
    public FifaPC getFifa(){
        return new FifaPC();
    }
    public MinecraftPC getMinecraft(){
        return new MinecraftPC();
    }
    public IJuego getGame(int i){
        IJuego juegos[] = {getApex(), getFifa(), getMinecraft()};
        return juegos[i];
    } 
    
}
