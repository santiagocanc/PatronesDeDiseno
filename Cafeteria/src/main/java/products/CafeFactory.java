/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package products;
import java.util.*;
/**
 *
 * @author Weriko
 */
public class CafeFactory {
    public ICafe getCafe(String i){
        ICafe cafe;
        switch(i){
            case "bajo":
                cafe= new Americano();
                break;
            case "medio":
                cafe = new Latte();
                break;
            case "alto":
                cafe = new Mocca();
                break;
            default:
                cafe = null;
            
               
        }
        return cafe;
    }
    
}
