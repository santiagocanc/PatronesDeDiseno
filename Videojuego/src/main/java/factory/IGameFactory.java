/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;
import juegos.*;
/**
 *
 * @author Weriko
 */
import juegos.apex.*;
import juegos.fifita.*;
import juegos.minecraft.*;
public interface IGameFactory {
    public IApex getApex();
    public IFifa getFifa();
    public IMinecraft getMinecraft();
    public IJuego getGame(int i);
    
}
