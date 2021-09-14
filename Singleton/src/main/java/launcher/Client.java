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
public class Client {
    public String nombre;

    @Override
    public String toString() {
        return "Client{" + "nombre=" + nombre + '}';
    }
    

    public Client(String nombre) {
        this.nombre = nombre;
    }

    
    
}
