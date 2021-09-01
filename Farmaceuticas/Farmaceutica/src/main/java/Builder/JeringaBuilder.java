/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import Etiqueta.IEtiqueta;
import Productos.BlisterPastilla;
import Productos.IProducto;
import Productos.Jeringa;

/**
 *
 * @author Weriko
 */
public class JeringaBuilder implements IBuilder{
    private IProducto jeringa;
    
    public void reset(){
        this.jeringa = new Jeringa();
        
    }
    public void putPrecio(float a) {
        this.jeringa.setPrecio(a);
    }

    @Override
    public void putVolumen(float a) {
        this.jeringa.setVolumen(a);
    }

    @Override
    public void putMaterial(String a) {
        this.jeringa.setMaterial(a);
    }

    @Override
    public void putEtiqueta(IEtiqueta et) {
        this.jeringa.setEtiqueta(et);
    }
    public IProducto darProducto(){
        return this.jeringa;
    }
    @Override
    public void putRestricciones(String a) {
        this.jeringa.setRestricciones(a);
    }

    @Override
    public void putUso(String a) {
        this.jeringa.setUso(a);
    }

    @Override
    public void putNombre(String a) {
        this.jeringa.setNombre(a);
    }
    public void putEmpresa(String a){
        this.jeringa.setEmpresa(a);
    }
    public void putCantidad(float a){
        this.jeringa.setCantidad(a);
    }
}
