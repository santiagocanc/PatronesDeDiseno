/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factories;

import Etiqueta.Covid.EtiquetaCovidAlemania;
import Etiqueta.Covid.ICovid;
import Etiqueta.Influenza.EtiquetaInfluenzaAlemania;
import Etiqueta.Influenza.IInfluenza;

/**
 *
 * @author Weriko
 */
public class AlemaniaFactory implements IFactory {

    @Override
    public ICovid darCovid() {
        return new EtiquetaCovidAlemania();
    }

    @Override
    public IInfluenza darInfluenza() {
        return new EtiquetaInfluenzaAlemania();
    }
    
}
