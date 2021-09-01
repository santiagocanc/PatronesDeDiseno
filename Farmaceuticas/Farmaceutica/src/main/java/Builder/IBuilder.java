/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import Etiqueta.IEtiqueta;

/**
 *
 * @author Weriko
 */
public interface IBuilder {
    public void putPrecio(float a);
    public void putVolumen(float a);
    public void putMaterial(String a);
    public void putEtiqueta(IEtiqueta et);
    public void putRestricciones(String a);
    public void putUso(String a);
    public void putNombre(String a);
            
    public void putEmpresa(String a);
    public void putCantidad(float a);
}
