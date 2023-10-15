/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaNos;

/**
 *
 * @author Alunos
 */
public class ListaDuplamenteLigada {
    private NoDuplo primeiroNo;
    private NoDuplo ultimoNo;
    private int qtdNo;
    
    
    public ListaDuplamenteLigada(){
        primeiroNo = null;
        ultimoNo = null;
        qtdNo = 0;  
    }
    
    public void adicionar(Object info){
        NoDuplo novoNo;
        if(primeiroNo == null){
            novoNo = new NoDuplo(info, null, null);
            primeiroNo = ultimoNo = novoNo;
            qtdNo++;
        } else{
            novoNo = new NoDuplo(info, null, null);
            ultimoNo.setProximo(novoNo);
            //ultimoNo.setAnterior(???);
            ultimoNo = novoNo;
            qtdNo++;
        }
    }
    
    public void adicionar(Object info, int indice){
        NoDuplo novoNo;
        if(indice>=0){
            if(indice >= qtdNo){
                adicionar(info);
            } 
            else if(indice == 0){
                novoNo = new NoDuplo(info, primeiroNo, null);
                primeiroNo = novoNo;
                qtdNo++;
            } else{
                NoDuplo aux = percorrerLista(indice-1);
                
                novoNo = new NoDuplo(info, aux.getProxNo(), aux.getAntNo());
                
                aux.setProximo(novoNo);
                //aux.setAnterior(????);
                qtdNo++;
            }
        }
    }
    
    private NoDuplo percorrerLista(int indice){
        if(indice >= 0 && indice < qtdNo){
            NoDuplo aux=primeiroNo;
            for (int i = 0; i < indice; i++){
                aux = aux.getProxNo();
            
            }
            return aux;
        } else{
            return null;
        }
        
    }
    
    public void remover(int indice){
        NoDuplo aux = percorrerLista(indice - 1);
        if (indice == 0){
            // remove da primeira posicao da lista
            primeiroNo = primeiroNo.getProxNo();
            qtdNo--;
        } else if (indice == qtdNo - 1){
            // remove da ultima posicao da lista
            aux = percorrerLista(indice-1);
            aux.setProximo(null);
            aux.setAnterior(null); // <--------------------
            qtdNo--;
        } else{
            // remove de qualquer posicao da lista
            aux = percorrerLista(indice-1);
            aux.setProximo(aux.getProxNo().getProxNo());
            aux.setAnterior(aux.getAntNo().getAntNo()); // <--------------------
            qtdNo--;
        }
    }
    
    public String getLista(int indice){
        return percorrerLista(indice).getInfo().toString();
    }
    
    public int tamanhoLista(int qtdNo){ // <--------------------
        return qtdNo;
    }
    
    public String imprimirLista(){
        // percorre toda a lista retonando uma string com a info de todos os nós
        String retorno = " Lista: ";
        NoDuplo aux = primeiroNo;
        while(aux.getProxNo() != null){
            //concatena a informação dos nós
            retorno += aux.getInfo() + ", ";
            // percorre a lista
            aux = aux.getProxNo();
        }
        retorno+=aux.getInfo();
        return retorno;
    }
}
