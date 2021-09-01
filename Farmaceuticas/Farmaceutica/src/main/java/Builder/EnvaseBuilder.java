/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import Etiqueta.IEtiqueta;
import Productos.BlisterPastilla;
import Productos.Envases.EnvaseLiquido;
import Productos.Envases.EnvasePastilla;
import Productos.Envases.IEnvase;
import Productos.IProducto;

/**
 *
 * @author Weriko
 */
public class EnvaseBuilder implements IBuilder{
    private IProducto envase;
    
    public void reset(int a){
        IEnvase envases[] = {new EnvaseLiquido(), new EnvasePastilla()};
        this.envase = envases[a];
        
    }
    public void reset(){
        this.envase = new EnvaseLiquido();
        
    }
    public void putPrecio(float a) {
        this.envase.setPrecio(a);
    }

    @Override
    public void putVolumen(float a) {
        this.envase.setVolumen(a);
    }

    @Override
    public void putMaterial(String a) {
        this.envase.setMaterial(a);
    }

    @Override
    public void putEtiqueta(IEtiqueta et) {
        this.envase.setEtiqueta(et);
    }
    public IProducto darProducto(){
        return this.envase;
    }

   @Override
    public void putRestricciones(String a) {
        this.envase.setRestricciones(a);
    }

    @Override
    public void putUso(String a) {
        this.envase.setUso(a);
    }

    @Override
    public void putNombre(String a) {
        this.envase.setNombre(a);
    }
    public void putEmpresa(String a){
        this.envase.setEmpresa(a);
    }
    public void putCantidad(float a){
        this.envase.setCantidad(a);
    }
}
