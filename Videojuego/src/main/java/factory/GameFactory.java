/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author Weriko
 */
public class GameFactory {
    public IGameFactory getFactory(int i){
        IGameFactory factories[] = {new XboxFactory(), new PCFactory()};
        return factories[i];
    }
    
}
