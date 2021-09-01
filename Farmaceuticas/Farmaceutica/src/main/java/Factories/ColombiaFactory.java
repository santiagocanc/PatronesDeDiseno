/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factories;

import Etiqueta.Covid.EtiquetaCovidAlemania;
import Etiqueta.Covid.EtiquetaCovidColombia;
import Etiqueta.Covid.ICovid;
import Etiqueta.Influenza.EtiquetaInfluenzaAlemania;
import Etiqueta.Influenza.EtiquetaInfluenzaColombia;
import Etiqueta.Influenza.IInfluenza;

/**
 *
 * @author Weriko
 */
public class ColombiaFactory implements IFactory {
    
    @Override
    public ICovid darCovid() {
        return new EtiquetaCovidColombia();
    }

    @Override
    public IInfluenza darInfluenza() {
        return new EtiquetaInfluenzaColombia();
    }
    
    
}
