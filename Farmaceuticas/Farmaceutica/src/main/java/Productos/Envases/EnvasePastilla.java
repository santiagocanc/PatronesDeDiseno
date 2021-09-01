/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos.Envases;

import Etiqueta.IEtiqueta;

/**
 *
 * @author Weriko
 */
public class EnvasePastilla implements IEnvase{
    private float precio= 0;
    private float volumen = 0;
    private float cantidad = 0; //gm
    private String material = "plastico";
    private IEtiqueta etiqueta;
    private String tipo = "U=100";
    static String tipoUso="PARA SOLIDOS"; 
    private String nombre;
    private String uso;
    private String restricciones;
    private String empresa;

    private boolean dispensador = false;
    private float peso=0;
    public void setDispensador(boolean dispensador) {
        this.dispensador = dispensador;
    }
    public boolean isDispensador(){
        return this.dispensador;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setVolumen(float volumen) {
        this.volumen = volumen;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    

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


    public void setTipo(String tipo) {
        this.tipo = tipo;
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

   
    
    
    public String getMaterial(){
        return this.material;
    }

    @Override
    public String describirProducto() {
        return this.etiqueta+ ". terial: "+this.material+" Precio: "+Float.toString(this.precio)+" PARA PASTILLAS";
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
    public String toString() {
        return "EnvasePastilla{" + "precio=" + precio + ", volumen=" + volumen + ", cantidad=" + cantidad + ", material=" + material + ", etiqueta=" + etiqueta + ", tipo=" + tipo + ", nombre=" + nombre + ", uso=" + uso + ", restricciones=" + restricciones + ", empresa=" + empresa + ", dispensador=" + dispensador + ", peso=" + peso + '}';
    }

    
    public IEtiqueta getEtiqueta() {
        return this.etiqueta;
    }

    @Override
    public float getPeso() {
        return this.peso;
    }


    

 
   
    
}
