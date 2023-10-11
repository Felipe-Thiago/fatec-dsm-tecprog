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


public class ListaLigada {
    private No primeiroNo;
    private No ultimoNo;
    private int qtdNo;
    
    
    
    public ListaLigada(){
        primeiroNo = null;
        ultimoNo = null;
        qtdNo = 0; //faz a referência do tamanho da lista   
    }
    
    public void adicionarNo(Object info){
        No novoNo;
        if(primeiroNo == null){
            //Inicia a lista
            novoNo = new No(info, null);
            primeiroNo = ultimoNo = novoNo;
            qtdNo++;
        } else{
            //Adiciona o nó no final da lista
            novoNo = new No(info, null);
            ultimoNo.setProximo(novoNo);
            ultimoNo = novoNo;
            qtdNo++;
        }
    }
    
    public void adicionarNo(Object info, int indice){
        // adiciona um novo nó na posição definida pelo indice
        // se o indice for > que qtdNo, adiciona o nó na ultima posição
        // se o indice for < 0, não faz nada
        No novoNo;
        if(indice>=0){
            if(indice >= qtdNo){
                adicionarNo(info);
            } 
            else if(indice == 0){
                // para adicionar o nó na primeira posição
                // o novo nó precisa apontar para o primeiro nó,
                // e a referencia para o primeiro nó precisa ser atualizada
                
                novoNo = new No(info, primeiroNo);
                primeiroNo = novoNo;
                qtdNo++;
            } else{
                // todos os casos onde será adicionado no meio da lista
                //aux recebe ref para o nó de indice -1
                No aux = percorrerLista(indice-1);
                //novoNo é cirado com a ref para o proximo nó como aux=>proximoNo
                novoNo = new No(info, aux.getProxNo());
                //aux atualiza a ref para o próximo nó, atribuindo o novoNo
                aux.setProximo(novoNo);
                qtdNo++;
            }
        }
    }

    private No percorrerLista(int indice){
        if(indice >= 0 && indice < qtdNo){
            No aux=primeiroNo;
            for (int i = 0; i < indice; i++){
                aux = aux.getProxNo();
            
            }
            return aux;
        } else{
            return null;
        }
        
    }
    
    public String exibirLista(){
        // percorre toda a lista retonando uma string com a info de todos os nós
        String retorno = " Lista: ";
        No aux = primeiroNo;
        while(aux.getProxNo() != null){
            //concatena a informação dos nós
            retorno += aux.getInfo() + ", ";
            // percorre a lista
            aux = aux.getProxNo();
        }
        retorno+=aux.getInfo();
        return retorno;
    }
    
    public String getLista(int indice){
        return percorrerLista(indice).getInfo().toString();
    }
    
    
    
    public void remover(int indice){
        No aux = percorrerLista(indice - 1);
        if (indice == 0){
            // remove da primeira posicao da lista
            primeiroNo = primeiroNo.getProxNo();
            qtdNo--;
        } else if (indice == qtdNo - 1){
            // remove da ultima posicao da lista
            aux = percorrerLista(indice-1);
            aux.setProximo(null);
            qtdNo--;
        } else{
            // remove de qualquer posicao da lista
            aux = percorrerLista(indice-1);
            aux.setProximo(aux.getProxNo().getProxNo());
            qtdNo--;
        }
    }
    
    
    //exercícios
    /* a) deverá receber valores numéricos e adicionar os valores
     * à lista ligada de forma ordenada (crescente ou decrescente),
     * dependendo do tipo de ordenação escolhido. Utilize o conceito de
     * enum para escolher o tipo de ordenação.
    */
    
    public void adicionar(int valor, TipoOrdenacao tipo){
        
        if (tipo == TipoOrdenacao.CRESCENTE){
            
            if (qtdNo == 0){
                adicionarNo(valor);
            } else{
                //ver se o novo nó é maior que o último nó e adicionar
                if (valor > (int) ultimoNo.getInfo()){
                    adicionarNo(valor);
                } else{
                    // se não, correr a lista e pegar a info do prox nó para isso
                    for (int i = 0; i < qtdNo; i++){
                        if (valor < Integer.parseInt(getLista(i))){
                            adicionarNo(valor, i);
                            break;
                        }
                    }           
                }
            }
            
        } else {
            if(tipo == TipoOrdenacao.DECRESCENTE){
            //ver se o novo nó é menor que o último nó
                if (qtdNo == 0){
                    adicionarNo(valor);
                } else{
                    if (valor < (int) ultimoNo.getInfo()){
                        adicionarNo(valor);
                    } else{
                        for (int i = 0; i < qtdNo; i++){
                            if (valor > Integer.parseInt(getLista(i))){
                                adicionarNo(valor, i);
                                break;
                            }
                        }
                    }
                }
            }
        }
            
    }
    
    /* b) Deverá receber um objeto, pesquisar na lista, retornando
     * o índice do objeto na lista ou -1 se o objeto não existir na lista
    */
    
    public int getListaPos(Object item){
        int aux = -1;
        for (int i = 0; i < qtdNo; i++){
            if (item == percorrerLista(i).getInfo()){
                aux = i;
            }
        }
        return aux;
    }
    
    /* c) deverá receber um objeto e removê-lo da lista retornando True,
     * se o objeto não existir retorne falso.
     *
    */
    public boolean remover(Object item){
        for (int i = 0; i < qtdNo; i++){
            if (item == getLista(i)){
                
            }
        }
        
    }
    
    /* d) Deverá concatenar uma lista2 recebendo como parâmetro o final da lista atual
    */
    public void concatenar(ListaLigada lista){
        
    }
    
    /* e) deverá criar uma cópia da lista atual na memória,
     * retornando à referência da lista copiada
    */
    
    public ListaLigada copiar(ListaLigada lista){
        
    }
}
