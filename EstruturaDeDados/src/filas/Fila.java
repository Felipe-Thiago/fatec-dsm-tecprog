/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filas;

import java.util.*;

/**
 *
 * @author Alunos
 */
public class Fila {
    private List<Object> fila;
    
    public Fila(){
        fila = new ArrayList<Object>();
    }
    
    public void adicionar(Object item){
        fila.add(item);
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
