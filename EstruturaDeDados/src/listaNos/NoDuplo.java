/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaNos;

/**
 *
 * @author Alunos
 */
public class NoDuplo {
    private Object info;
    private NoDuplo proximo, anterior;
    
    public void setInfo(Object info){
        this.info = info;
    }
    
    public void setProximo(NoDuplo proximo){
        this.proximo = proximo;
    }
    
    public void setAnterior(NoDuplo anterior){
        this.anterior = anterior;
    }
    
    public Object getInfo(){
        return info;
    }
    
    public NoDuplo getProxNo(){
        return proximo;
    }
    
    public NoDuplo getAntNo(){
        return anterior;
    }
    
    
    public NoDuplo(Object info, NoDuplo proximo, NoDuplo anterior){
        this.info = info;
        this.proximo = proximo;
        this.anterior = anterior;
    }
}
