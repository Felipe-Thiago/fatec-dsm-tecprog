/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alunos
 */
public class FilaPrioridade {
    private List<Object> fila;
    boolean foiAdc = false;
    
    public FilaPrioridade(){
        fila = new ArrayList<Object>();
    }
    
    public void adicionar(Object item){
        if (fila.isEmpty()){
            fila.add(item);
        } else{
            for (int i=0; i < fila.size(); i++){
                if (Integer.parseInt(fila.get(i).toString()) > Integer.parseInt(item.toString())){
                    fila.add(i, item);
                    foiAdc = true;
                    break;
                }
                if(foiAdc = false){
                    fila.add(item);
                }
            }
            
        }
        
    }
    
    public Object remover(){
        if(!fila.isEmpty()){
            return fila.remove(0);
        } else{
            return null;
        }
        
    }
    
    public Object exibirInicio(){
        return fila.get(0);
    }
    
    public int tamanho(){
        return fila.size();
    }
}
