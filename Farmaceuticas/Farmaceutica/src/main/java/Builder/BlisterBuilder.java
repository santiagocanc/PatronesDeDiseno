/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import Etiqueta.IEtiqueta;
import Productos.Ampolla;
import Productos.BlisterPastilla;
import Productos.IProducto;

/**
 *
 * @author Weriko
 */
public class BlisterBuilder implements IBuilder{
     private IProducto blister;
    
    public void reset(){
        this.blister = new BlisterPastilla();
        
    }
    public void putPrecio(float a) {
        this.blister.setPrecio(a);
    }

    @Override
    public void putVolumen(float a) {
        this.blister.setVolumen(a);
    }

    @Override
    public void putMaterial(String a) {
        this.blister.setMaterial(a);
    }

    @Override
    public void putEtiqueta(IEtiqueta et) {
        this.blister.setEtiqueta(et);
    }
    public IProducto darProducto(){
        return this.blister;
    }
    @Override
    public void putRestricciones(String a) {
        this.blister.setRestricciones(a);
    }

    @Override
    public void putUso(String a) {
        this.blister.setUso(a);
    }

    @Override
    public void putNombre(String a) {
        this.blister.setNombre(a);
    }
    public void putEmpresa(String a){
        this.blister.setEmpresa(a);
    }
    

    @Override
    public void putCantidad(float a) {
       this.blister.setCantidad(a);
    }
    
}
