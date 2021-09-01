/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package launcher;

import Builder.AmpollaBuilder;
import Builder.BlisterBuilder;
import Builder.EnvaseBuilder;
import Builder.JeringaBuilder;
import Etiqueta.IEtiqueta;
import Factories.AlemaniaFactory;
import Factories.IFactory;
import Factories.PaisFactory;
import Productos.IProducto;

/**
 *
 * @author Weriko
 */
public class Director {
    
    public IProducto darAmpollaCovidAlemaniaPfizer(){
        AmpollaBuilder ab = new AmpollaBuilder();
        ab.reset();
        ab.putPrecio(32); //EUR
        ab.putMaterial("Vidrio");
        ab.putEmpresa("Pfizer");
        ab.putNombre("Comirnaty");
        ab.putVolumen(20);
        ab.putCantidad(5);
        
        ab.putUso("Inyectar 2 veces");
        ab.putRestricciones("Guardar a -100c");
        PaisFactory ff = new PaisFactory(); //HACER UNA FACTORY FACTORY FACTORY
        IFactory f = ff.darFactory("alemania");
        IEtiqueta et = f.darCovid();
        ab.putEtiqueta(et);
        IProducto p = ab.darProducto();
        return p;
        
    }
    public IProducto darAmpollaCovidAlemaniaModerna(){
        AmpollaBuilder ab = new AmpollaBuilder();
        ab.reset();
        ab.putPrecio(53); //EUR
        ab.putMaterial("Vidrio");
        ab.putEmpresa("Moderna");
        ab.putNombre("mRNA-1273");
        ab.putUso("Inyectar 2 veces");
        ab.putRestricciones("Guardar a -40c");
        PaisFactory ff = new PaisFactory(); //HACER UNA FACTORY FACTORY FACTORY
        IFactory f = ff.darFactory("alemania");
        IEtiqueta et = f.darCovid();
        ab.putEtiqueta(et);
        IProducto p = ab.darProducto();
        return p;
        
    }
    public IProducto darAmpollaCovidAlemaniaAstrazeneca(){
        AmpollaBuilder ab = new AmpollaBuilder();
        ab.reset();
        ab.putPrecio(70); //EUR
        ab.putMaterial("Vidrio");
        ab.putEmpresa("Astrazeneca");
        ab.putNombre("Vaxzevria");
        ab.putUso("Inyectar 2 veces");
        ab.putRestricciones("Guardar a -90c");
        PaisFactory ff = new PaisFactory(); //HACER UNA FACTORY FACTORY FACTORY
        IFactory f = ff.darFactory("alemania");
        IEtiqueta et = f.darCovid();
        ab.putEtiqueta(et);
        IProducto p = ab.darProducto();
        return p;
        
    }
    public IProducto darAmpollaCovidColombiaAstrazeneca(){
        AmpollaBuilder ab = new AmpollaBuilder();
        ab.reset();
        ab.putPrecio(34); //EUR
        ab.putMaterial("Vidrio");
        ab.putEmpresa("Astrazeneca");
        ab.putNombre("Vaxzevria");
        ab.putUso("Inyectar 2 veces");
        ab.putRestricciones("Guardar a -90c");
        PaisFactory ff = new PaisFactory(); //HACER UNA FACTORY FACTORY FACTORY
        IFactory f = ff.darFactory("colombia");
        IEtiqueta et = f.darCovid();
        ab.putEtiqueta(et);
        IProducto p = ab.darProducto();
        return p;
        
    }
    
    public IProducto darAmpollaCovidColombiaPfizer(){
        AmpollaBuilder ab = new AmpollaBuilder();
        ab.reset();
        ab.putPrecio(12); //EUR
        ab.putMaterial("Vidrio");
        ab.putEmpresa("Pfizer");
        ab.putNombre("Comirnaty");
        ab.putUso("Inyectar 2 veces");
        ab.putRestricciones("Guardar a -100c");
        PaisFactory ff = new PaisFactory(); //HACER UNA FACTORY FACTORY FACTORY
        IFactory f = ff.darFactory("colombia");
        IEtiqueta et = f.darCovid();
        ab.putEtiqueta(et);
        IProducto p = ab.darProducto();
        return p;
        
    }
    public IProducto darAmpollaCovidColombiaModerna(){
        AmpollaBuilder ab = new AmpollaBuilder();
        ab.reset();
        ab.putPrecio(40); //EUR
        ab.putMaterial("Vidrio");
        ab.putEmpresa("Moderna");
        ab.putNombre("mRNA-1273");
        ab.putUso("Inyectar 2 veces");
        ab.putRestricciones("Guardar a -40c");
        PaisFactory ff = new PaisFactory(); //HACER UNA FACTORY FACTORY FACTORY
        IFactory f = ff.darFactory("colombia");
        IEtiqueta et = f.darCovid();
        ab.putEtiqueta(et);
        IProducto p = ab.darProducto();
        return p;
        
    }
    
    public IProducto darAmpollaCovidCanadaAstrazeneca(){
        AmpollaBuilder ab = new AmpollaBuilder();
        ab.reset();
        ab.putPrecio(43); //EUR
        ab.putMaterial("Vidrio");
        ab.putEmpresa("Astrazeneca");
        ab.putNombre("Vaxzevria");
        ab.putUso("Inyectar 2 veces");
        ab.putRestricciones("Guardar a -90c");
        PaisFactory ff = new PaisFactory(); //HACER UNA FACTORY FACTORY FACTORY
        IFactory f = ff.darFactory("canada");
        IEtiqueta et = f.darCovid();
        ab.putEtiqueta(et);
        IProducto p = ab.darProducto();
        return p;
        
    }
    
    public IProducto darAmpollaCovidCanadaPfizer(){
        AmpollaBuilder ab = new AmpollaBuilder();
        ab.reset();
        ab.putPrecio(20); //EUR
        ab.putMaterial("Vidrio");
        ab.putEmpresa("Pfizer");
        ab.putNombre("Comirnaty");
        ab.putUso("Inyectar 2 veces");
        ab.putRestricciones("Guardar a -100c");
        PaisFactory ff = new PaisFactory(); //HACER UNA FACTORY FACTORY FACTORY
        IFactory f = ff.darFactory("canada");
        IEtiqueta et = f.darCovid();
        ab.putEtiqueta(et);
        IProducto p = ab.darProducto();
        return p;
        
    }
    public IProducto darAmpollaCovidCanadaModerna(){
        AmpollaBuilder ab = new AmpollaBuilder();
        ab.reset();
        ab.putPrecio(75); //EUR
        ab.putMaterial("Vidrio");
        ab.putEmpresa("Moderna");
        ab.putNombre("mRNA-1273");
        ab.putUso("Inyectar 2 veces");
        ab.putRestricciones("Guardar a -40c");
        PaisFactory ff = new PaisFactory(); //HACER UNA FACTORY FACTORY FACTORY
        IFactory f = ff.darFactory("canada");
        IEtiqueta et = f.darCovid();
        ab.putEtiqueta(et);
        IProducto p = ab.darProducto();
        return p;
        
    }
    
    
    public IProducto darAmpollaInfluenzaAlemaniaModerna(){
        AmpollaBuilder ab = new AmpollaBuilder();
        ab.reset();
        ab.putPrecio(64); //EUR
        ab.putMaterial("Vidrio");
        ab.putEmpresa("Moderna");
        ab.putNombre("mRNA-1010");
        ab.putUso("Inyectar 1 vez");
        ab.putRestricciones("Guardar a -3c");
        PaisFactory ff = new PaisFactory(); //HACER UNA FACTORY FACTORY FACTORY
        IFactory f = ff.darFactory("alemania");
        IEtiqueta et = f.darInfluenza();
        ab.putEtiqueta(et);
        IProducto p = ab.darProducto();
        return p;
        
    }
    
    public IProducto darAmpollaInfluenzaAlemaniaJohnson(){
        AmpollaBuilder ab = new AmpollaBuilder();
        ab.reset();
        ab.putPrecio(23); //EUR
        ab.putMaterial("Vidrio");
        ab.putEmpresa("Jhonson");
        ab.putNombre("sydney h3n2");
        ab.putUso("Inyectar 1 vez");
        ab.putRestricciones("Guardar a -3c");
        PaisFactory ff = new PaisFactory(); //HACER UNA FACTORY FACTORY FACTORY
        IFactory f = ff.darFactory("alemania");
        IEtiqueta et = f.darInfluenza();
        ab.putEtiqueta(et);
        IProducto p = ab.darProducto();
        return p;
        
    }
    
    public IProducto darAmpollaInfluenzaColombiaModerna(){
        AmpollaBuilder ab = new AmpollaBuilder();
        ab.reset();
        ab.putPrecio(64); //EUR
        ab.putMaterial("Vidrio");
        ab.putEmpresa("Moderna");
        ab.putNombre("mRNA-1010");
        ab.putUso("Inyectar 1 vez");
        ab.putRestricciones("Guardar a -3c");
        PaisFactory ff = new PaisFactory(); //HACER UNA FACTORY FACTORY FACTORY
        IFactory f = ff.darFactory("colombia");
        IEtiqueta et = f.darInfluenza();
        ab.putEtiqueta(et);
        IProducto p = ab.darProducto();
        return p;
        
    }
    
    public IProducto darAmpollaInfluenzaColombiaJohnson(){
        AmpollaBuilder ab = new AmpollaBuilder();
        ab.reset();
        ab.putPrecio(35); //EUR
        ab.putMaterial("Vidrio");
        ab.putEmpresa("Jhonson");
        ab.putNombre("sydney h3n2");
        ab.putUso("Inyectar 1 vez");
        ab.putRestricciones("Guardar a -3c");
        PaisFactory ff = new PaisFactory(); //HACER UNA FACTORY FACTORY FACTORY
        IFactory f = ff.darFactory("colombia");
        IEtiqueta et = f.darInfluenza();
        ab.putEtiqueta(et);
        IProducto p = ab.darProducto();
        return p;
        
    }
    
    public IProducto darAmpollaInfluenzaCanadaModerna(){
        AmpollaBuilder ab = new AmpollaBuilder();
        ab.reset();
        ab.putPrecio(30); //EUR
        ab.putMaterial("Vidrio");
        ab.putEmpresa("Moderna");
        ab.putNombre("mRNA-1010");
        ab.putUso("Inyectar 1 vez");
        ab.putRestricciones("Guardar a -3c");
        PaisFactory ff = new PaisFactory(); //HACER UNA FACTORY FACTORY FACTORY
        IFactory f = ff.darFactory("canada");
        IEtiqueta et = f.darInfluenza();
        ab.putEtiqueta(et);
        IProducto p = ab.darProducto();
        return p;
        
    }
    
    public IProducto darAmpollaInfluenzaCanadaJohnson(){
        AmpollaBuilder ab = new AmpollaBuilder();
        ab.reset();
        ab.putPrecio(20); //EUR
        ab.putMaterial("Vidrio");
        ab.putEmpresa("Jhonson");
        ab.putNombre("sydney h3n2");
        ab.putUso("Inyectar 1 vez");
        ab.putRestricciones("Guardar a -3c");
        PaisFactory ff = new PaisFactory(); //HACER UNA FACTORY FACTORY FACTORY
        IFactory f = ff.darFactory("canada");
        IEtiqueta et = f.darInfluenza();
        ab.putEtiqueta(et);
        IProducto p = ab.darProducto();
        return p;
        
    }
    
    
    public IProducto darBlisterAcetaminofenColombiaGSK(){
        BlisterBuilder ab = new BlisterBuilder();
        ab.reset();
        ab.putPrecio(5); //EUR
        ab.putMaterial("Papel");
        ab.putEmpresa("GSK");
        ab.putNombre("Dolex");
        ab.putUso("Tomar 500mg cada 8horas");
        ab.putRestricciones("Guardar lejos de menores de 4 anios");
        PaisFactory ff = new PaisFactory(); //HACER UNA FACTORY FACTORY FACTORY
        IFactory f = ff.darFactory("colombia");
        IEtiqueta et = f.darInfluenza();
        ab.putEtiqueta(et);
        IProducto p = ab.darProducto();
        return p;
        
    }
    
    public IProducto darJeringaInfluenzanColombiaGSK(){
        JeringaBuilder ab = new JeringaBuilder();
        ab.reset();
        ab.putPrecio(5); //EUR
        ab.putMaterial("Papel");
        ab.putEmpresa("GSK");
        ab.putNombre("Influenza3000");
        ab.putUso("inyectar 500mg");
        ab.putRestricciones("Guardar lejos de menores de 10 anios");
        PaisFactory ff = new PaisFactory(); //HACER UNA FACTORY FACTORY FACTORY
        IFactory f = ff.darFactory("colombia");
        IEtiqueta et = f.darInfluenza();
        ab.putEtiqueta(et);
        IProducto p = ab.darProducto();
        return p;
        
    }
    
    public IProducto darEnvaseLiquidoInfluenzanColombiaGSK(){
        EnvaseBuilder ab = new EnvaseBuilder();
        ab.reset(0);
        ab.putPrecio(5); //EUR
        ab.putMaterial("Plastico");
        ab.putEmpresa("GSK");
        ab.putNombre("Dolex");
        ab.putUso("tomar 500ml cada 8horas");
        ab.putRestricciones("Guardar lejos de menores de 2 anios");
        PaisFactory ff = new PaisFactory(); //HACER UNA FACTORY FACTORY FACTORY
        IFactory f = ff.darFactory("colombia");
        IEtiqueta et = f.darInfluenza();
        ab.putEtiqueta(et);
        IProducto p = ab.darProducto();
        return p;
        
    }
    
    public IProducto darEnvasePastillasInfluenzanColombiaGSK(){
        EnvaseBuilder ab = new EnvaseBuilder();
        ab.reset(1);
        ab.putPrecio(5); //EUR
        ab.putMaterial("Plastico");
        ab.putEmpresa("GSK");
        ab.putNombre("Dolex");
        ab.putUso("Ingerir 500ml cada 8horas");
        ab.putRestricciones("Guardar lejos de menores de 2 anios");
        PaisFactory ff = new PaisFactory(); //HACER UNA FACTORY FACTORY FACTORY
        IFactory f = ff.darFactory("colombia");
        IEtiqueta et = f.darInfluenza();
        ab.putEtiqueta(et);
        IProducto p = ab.darProducto();
        return p;
        
    }
    
    
    
    
    
    
    
    
    
    
}
