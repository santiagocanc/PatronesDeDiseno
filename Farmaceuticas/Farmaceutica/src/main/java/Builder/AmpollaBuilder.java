/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import Etiqueta.IEtiqueta;
import Productos.Ampolla;
import Productos.IProducto;

/**
 *
 * @author Weriko
 */
public class AmpollaBuilder implements IBuilder{
    private IProducto ampolla;
    
    public void reset(){
        this.ampolla = new Ampolla();
        
    }
    public void putPrecio(float a) {
        this.ampolla.setPrecio(a);
    }

    @Override
    public void putVolumen(float a) {
        this.ampolla.setVolumen(a);
    }

    @Override
    public void putMaterial(String a) {
        this.ampolla.setMaterial(a);
    }

    @Override
    public void putEtiqueta(IEtiqueta et) {
        this.ampolla.setEtiqueta(et);
    }
    public IProducto darProducto(){
        return this.ampolla;
    }

    @Override
    public void putRestricciones(String a) {
        this.ampolla.setRestricciones(a);
    }

    @Override
    public void putUso(String a) {
        this.ampolla.setUso(a);
    }

    @Override
    public void putNombre(String a) {
        this.ampolla.setNombre(a);
    }
    public void putEmpresa(String a){
        this.ampolla.setEmpresa(a);
    }
    
    @Override
    public void putCantidad(float a) {
         this.ampolla.setCantidad(a);
    }

 
    
    
}
