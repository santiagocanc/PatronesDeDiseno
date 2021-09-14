/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package launcher;
import factory.*;
import juegos.*;
/**
 *
 * @author Weriko
 */
public class Client {
    public static void main(String[] args){
        int p = 0;
        int j = 2;
        GameFactory gamefactory = new GameFactory();
        IGameFactory plataforma = gamefactory.getFactory(p);
        IJuego juego = plataforma.getGame(j);
        System.out.println(juego.jugar());    
        
        p = 1;
        j = 1;
        IGameFactory plataforma2 = gamefactory.getFactory(p);
        IJuego juego2 = plataforma2.getGame(j);
        System.out.println(juego2.jugar());    
        
    }
}
/*
      O
     ~|~
     / \
*/