/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos;

import Etiqueta.IEtiqueta;

/**
 *
 * @author Weriko
 */
public interface IProducto {
    public String describirProducto();
    public float getPrecio();
    public float getVolumen();
    public String getMaterial();
    public IEtiqueta getEtiqueta();

    public void setPrecio(float a);

    public void setVolumen(float a);

    public void setMaterial(String a);

    public void setEtiqueta(IEtiqueta et);

    public void setRestricciones(String a);

    public void setUso(String a);

    public void setNombre(String a);
    
    public void setEmpresa(String a);

    public void setCantidad(float a);
}
