/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package launcher;

import Builder.AmpollaBuilder;
import Builder.IBuilder;
import Etiqueta.Covid.EtiquetaCovidAlemania;
import Etiqueta.Covid.ICovid;
import Etiqueta.IEtiqueta;
import Factories.AlemaniaFactory;
import Factories.IFactory;
import Productos.IProducto;

/**
 *
 * @author Weriko
 */
public class Client {
    public static void main(String[] args){
      
        Director d = new Director();
        IProducto pedidoAlemaniaCovid = d.darAmpollaCovidAlemaniaPfizer();
        System.out.println(pedidoAlemaniaCovid);
        
        IProducto pedidoColombiaCovid = d.darAmpollaCovidColombiaPfizer();
        System.out.println(pedidoColombiaCovid);
        
        IProducto pedidoCanadaCovid = d.darAmpollaCovidCanadaPfizer();
        System.out.println(pedidoCanadaCovid);
        
        IProducto pedidoInfluenzaCanada = d.darAmpollaInfluenzaCanadaModerna();
        System.out.println(pedidoInfluenzaCanada);
        
        IProducto pedidoInfluenzaColombia = d.darAmpollaInfluenzaColombiaModerna();
        System.out.println(pedidoInfluenzaColombia);
        
        IProducto pedidoInfluenzaColombia2 = d.darBlisterAcetaminofenColombiaGSK();
        System.out.println(pedidoInfluenzaColombia2);
        
        IProducto pedidoInfluenzaColombia3 = d.darEnvaseLiquidoInfluenzanColombiaGSK();
        System.out.println(pedidoInfluenzaColombia3);
        
        IProducto pedidoInfluenzaColombia4 = d.darJeringaInfluenzanColombiaGSK();
        System.out.println(pedidoInfluenzaColombia4);
        
        IProducto pedidoInfluenzaColombia5 = d.darEnvasePastillasInfluenzanColombiaGSK();
        System.out.println(pedidoInfluenzaColombia5);
        
        
        
    }
    
}
