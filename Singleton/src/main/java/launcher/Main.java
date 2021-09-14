/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package launcher;

/**
 *
 * @author Weriko
 */
public class Main {
    public static void main (String[] args){
        Connection c=  Connection.getConnection();
        Client yo = new Client("Juan Andres Gonzales");
        c.addClient(yo, 0);
        c=  Connection.getConnection();
        System.out.println(c);
        Client yo2 = new Client("Juan Sebastian Leyva");
        c.addClient(yo2, 0);
        
        System.out.println(c);
        c=  Connection.getConnection();
        Client yo3 = new Client("Juan Camilo Rodriguez");
        c.addClient(yo3, 2);
        System.out.println(c);
        Client yo4 = new Client("Pipo");
        c.addClient(yo4, 2);
        System.out.println(c.getSalas());
        Test test = new Test();
        
        test.test("Juanito", 10);
       
        System.out.println(c.getSalas());
        
        c.delClient("Juanito", 10);
        System.out.println(c.getSalas());
        
        
        
    }
    
}
