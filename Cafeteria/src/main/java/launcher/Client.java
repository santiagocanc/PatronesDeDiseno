/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package launcher;
import products.*;
/**
 *
 * @author Weriko
 */
public class Client {
    public static void main(String[] args){
       CafeFactory factory = new CafeFactory();
       
       ICafe cafe = factory.getCafe("medio");
       System.out.println(cafe.hacerCafe());
       
       ICafe cafe2 = factory.getCafe("bajo");
       System.out.println(cafe2.hacerCafe());
       
        
    }
}
