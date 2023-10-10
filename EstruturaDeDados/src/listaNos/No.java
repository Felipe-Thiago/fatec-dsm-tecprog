/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaNos;

/**
 *
 * @author Alunos
 */
public class No {
    private Object info;
    private No proximo;
    
    public void setInfo(Object info){
        this.info = info;
    }
    
    public void setProximo(No proximo){
        this.proximo = proximo;
    }
    
    public Object getInfo(){
        return info;
    }
    
    public No getProxNo(){
        return proximo;
    }
    
    
    public No(Object info, No proximo){
        this.info = info;
        this.proximo = proximo;
    }
}
