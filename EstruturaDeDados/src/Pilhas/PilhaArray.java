/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alunos
 */
public class PilhaArray {
    private Object[] pilha;
    private int topo = 0;

    public PilhaArray(int tamanho){
        pilha = new Object[tamanho];
    }
    
    public boolean empilhar(Object item){
        if (topo < pilha.length){
            topo++;
            pilha[topo] = item;
            return true;
        } else{
            return false;
        }
        
    }
    public Object desempilhar(){
        if (topo > 0){
            topo--;
            return pilha[topo];
        } else{
            return false;
        }
    }
    
    public boolean pilhaVazia(){
        if(topo == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean pilhaCheia(){
        if(topo == pilha.length - 1){
            return true;
        } else{
            return false;
        }
    }
}
