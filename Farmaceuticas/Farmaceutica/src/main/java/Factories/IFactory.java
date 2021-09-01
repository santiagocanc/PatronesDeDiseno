/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factories;
import Etiqueta.*;
import Etiqueta.Covid.ICovid;
import Etiqueta.Influenza.IInfluenza;
/**
 *
 * @author Weriko
 */
public interface IFactory {
    public ICovid darCovid();
    public IInfluenza darInfluenza();
    
}
