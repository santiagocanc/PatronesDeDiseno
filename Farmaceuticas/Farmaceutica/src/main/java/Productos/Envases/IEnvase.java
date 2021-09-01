/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos.Envases;
import Productos.*;

/**
 *
 * @author Weriko
 */
public interface IEnvase extends IProducto {
    public boolean isDispensador();
    public float getPeso();
}
