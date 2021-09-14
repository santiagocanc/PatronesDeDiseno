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
public class Test {
    public void test(String usuario, int a){
        Connection c=  Connection.getConnection();
        Client yo = new Client(usuario);
        c.addClient(yo, a);
    }
}
