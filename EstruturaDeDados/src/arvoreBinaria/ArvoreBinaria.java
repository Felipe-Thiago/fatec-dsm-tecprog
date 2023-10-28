/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvoreBinaria;

/**
 *
 * @author Alunos
 */
public class ArvoreBinaria {
    NoBinario raiz;
    
    
    public ArvoreBinaria(Integer info){
        raiz = new NoBinario(info, null, null);
    }
    
    //Método para adicionar de forma ordenada valor 
    public void adicionarOrdenado(Integer valor){
        //Se o valor for maior que info, adiciona no nó da direita
        //Se o valor for menor que info, adiciona no nó da esquerda
        /*
        if (valor > raiz.getInfo()){ //info da raíz (primeiro nó filho)
            if(raiz.getDireita() == null){ //se estiver vazio, adiciona o valor nessa posição
                raiz.setDireita(new NoBinario(valor, null, null));
            } else{ //se estiver preenchido, passar nó filho como ref. e fazer verificacao
                adicionarFilhos(raiz.getDireita(), valor);
            }
        } else{
            if(raiz.getEsquerda() == null){
                raiz.setEsquerda(new NoBinario(valor, null, null));
            } else{
                adicionarFilhos(raiz.getEsquerda(), valor);
            }
        }
        pela recursão, é só chamar o adicionarFilhos com raiz como parametro*/
        adicionarFilhos(raiz, valor);
    }
    private void adicionarFilhos(NoBinario no, Integer valor){
        if (valor > no.getInfo()){
            if(no.getDireita() == null){
                no.setDireita(new NoBinario(valor, null, null));
            } else{ 
                adicionarFilhos(no.getDireita(), valor);
            }
        } else{
            if(no.getEsquerda() == null){
                no.setEsquerda(new NoBinario(valor, null, null));
            } else{
                adicionarFilhos(no.getEsquerda(), valor);
            }
        }
    }
    
    //Crie um método que busca um determinado nó na árvore retornando a 
    //profundidade do nó ou -1 se o nó procurado não existir
    public void getProfundidade(NoBinario no, int valor, int profundidade){
        //é passado: nó desejado, valor desse nó, profundidade esperada
        
    }
    
    
    public int getProfundidade(int valor, NoBinario no){ //nó raiz
        int profundidade = 0;
        
        if(no.getInfo() == null){
            //verifica se o nó passado existe, se não, retorna inexistente
            return -1;
        } else {
            if (no.getDireita() == null){
                //se o nó da direita for nulo = folha
                //agora verificar esquerda
                getProfundidade(valor, no.getEsquerda());
            } else{
                //se o da direita possuir info, prosseguir com a profundidade
                if (no.getInfo() == valor){
                    profundidade =+ 1;
                } else{
                    getProfundidade(valor, no.getDireita());
                    //nesse ponto, se a direita da direita não for compatível, prosseguir
                }
            }
            if (no.getEsquerda() == null){
                //direita foi verificado, então se aqui também for nulo
                //a profundidade acaba aqui
                
                return profundidade;
            } else{
                //ver se o da direita tem conteúdo
                if (no.getInfo() == valor){
                    profundidade =+ 1;
                } else{
                    getProfundidade(valor, no.getDireita());
                }
            }
        }
        return profundidade;
    }
}
