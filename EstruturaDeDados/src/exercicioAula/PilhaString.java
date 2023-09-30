/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioAula;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alunos
 */
public class PilhaString {
    
    private List<String> pilha = new ArrayList<String>();
    
    public void empilhar(String item){
        pilha.add(item);
    }
    
    public String desempilhar(){
        if(!pilha.isEmpty()){
            return pilha.remove(pilha.size() - 1);
        } else{
            return null;
        }
    }
    
    public String exibirTopo(){
        if(!pilha.isEmpty()){
            return pilha.get(pilha.size() - 1);
        } else{
            return null;
        }
    }
    
    public boolean pilhaVazia(){
        return pilha.isEmpty();
    }
    
}
