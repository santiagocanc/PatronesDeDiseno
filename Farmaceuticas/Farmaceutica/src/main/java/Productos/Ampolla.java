/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos;
import Etiqueta.*;
        /*
/**
 *
 * @author Weriko
 */
public class Ampolla implements IProducto {
    private float precio= 0;
    private float volumen = 0;
    private float cantidad = 0; //ml
    private String material = "vidrio";
    private IEtiqueta etiqueta;
    private String nombre;
    private String uso;
    private String restricciones;
    private String empresa;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public String getRestricciones() {
        return restricciones;
    }

    public void setRestricciones(String restricciones) {
        this.restricciones = restricciones;
    }
    
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setVolumen(float volumen) {
        this.volumen = volumen;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setEtiqueta(IEtiqueta etiqueta) {
        this.etiqueta = etiqueta;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Ampolla{" + "precio=" + precio + ", volumen=" + volumen + ", cantidad=" + cantidad + ", material=" + material + ", etiqueta=" + etiqueta + ", nombre=" + nombre + ", uso=" + uso + ", restricciones=" + restricciones + ", empresa=" + empresa + '}';
    }

  
    
   
    
    
    public String getMaterial(){
        return this.material;
    }

    @Override
    public String describirProducto() {
        return this.etiqueta+ ". terial: "+this.material+" Precio: "+Float.toString(this.precio);
    }

    @Override
    public float getPrecio() {
        return this.precio;
    }


    @Override
    public float getVolumen() {
        return this.volumen;
    }

    @Override
    public IEtiqueta getEtiqueta() {
        return this.etiqueta;
    }
    
    
}
