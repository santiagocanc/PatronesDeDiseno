/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factories;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Weriko
 */
public class PaisFactory {
    public IFactory darAlemania(){
        return new AlemaniaFactory();
    }
    public IFactory darCanada(){
        return new CanadaFactory();
    }
    public IFactory darColombia(){
        return new ColombiaFactory();
    }
    public IFactory darFactory(String p){
        //IFactory factories[] = {darAlemania(),darCanada(),darColombia()};
        Map<String, IFactory> map = new HashMap<String, IFactory>();
        map.put("alemania",darAlemania());
        map.put("colombia",darColombia());
        map.put("canada",darCanada());
        return map.get(p);
        
    }
    
    
}
