/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package launcher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Weriko
 */
public class Connection {
    
    private static Connection c;
    
    private Map<Integer, ArrayList<Client>> salas = new HashMap<Integer, ArrayList<Client>>();
    
    
    
    private Connection(){
        System.out.println("Creaste instancia");
    }
    public static Connection getConnection(){
        if(c==null){
            c=new Connection();
        }
        return c;
    }
    
    public void addClient(Client c, int a){
       
        if (getSala(a)==null){
            addSala(a);    
        }
        getSala(a).add(c);
        
    }
    private void addSala(int a){
        this.salas.put(a, new ArrayList());
    }
    
    public Map getSalas(){
        return this.salas;
    }
    private ArrayList<Client> getSala(int a){
        return this.salas.get(a);
          
    }
    
    private Client findClient(String c,int a){
        ArrayList<Client> sala = this.getSala(a);
        for(int i=0;i<sala.size();i++){
            if(sala.get(i).nombre==c){
                return sala.get(i);
            }
        }
        return null;
        
    }
    
    public void delClient(String c, int a){
        if (this.getSala(a)==null){
            System.out.println("No");
        }
        else{
            Client cc = this.findClient(c, a);
            this.salas.get(a).remove(cc);

            if (this.getSala(a).isEmpty()){
                this.salas.remove(a);
            }
        }
        
    }
    
    
    
}

    

