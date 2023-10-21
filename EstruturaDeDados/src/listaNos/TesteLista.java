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
public class TesteLista {
    public static void adicionarLista(){
        listaNos.ListaLigada lista = new ListaLigada();
        /*lista.adicionarNo(1); //indice 0
        lista.adicionarNo(2); // 1
        lista.adicionarNo(3); // 2
        System.out.println(lista.getLista(0));
        lista.adicionarNo("x", 2);
        System.out.println(lista.getLista(1));
        System.out.println(lista.getLista(2));
        System.out.println(lista.getLista(3));
        System.out.println(lista.exibirLista());
        lista.remover(2);
        System.out.println(lista.exibirLista());
        lista.remover(2);
        System.out.println(lista.exibirLista());
        */
        
        
        //exercício 1 a) ----------------------
        //criando duas listas "1" - crescente e "2" - decrescente
        lista.adicionar(0, TipoOrdenacao.CRESCENTE);
        lista.adicionar(1, TipoOrdenacao.CRESCENTE);
        lista.adicionar(5, TipoOrdenacao.CRESCENTE);
        lista.adicionar(3, TipoOrdenacao.CRESCENTE);
        lista.adicionar(9, TipoOrdenacao.CRESCENTE);
        lista.adicionar(8, TipoOrdenacao.CRESCENTE);
        
        listaNos.ListaLigada lista2 = new ListaLigada();
        
        lista2.adicionar(-4, TipoOrdenacao.DECRESCENTE);
        lista2.adicionar(3, TipoOrdenacao.DECRESCENTE);
        lista2.adicionar(4, TipoOrdenacao.DECRESCENTE);
        lista2.adicionar(7, TipoOrdenacao.DECRESCENTE);
        lista2.adicionar(11, TipoOrdenacao.DECRESCENTE);
        
        //exibindo as duas listas ordenadas
        System.out.println("1ª" + lista.exibirLista());
        System.out.println("2ª" + lista2.exibirLista());
        System.out.println();
        //fim exercicio a) ---------------------
        

        //exercicio b) -------------------------
        //exibindo a posição do item 5 da lista 1
        System.out.println(lista.getListaPos(5));
        //fim exercicio b) ---------------------
        
        
        //exercicio c) -------------------------
        //removendo a mesma posição do item 5 da lista 1
        lista.removerPos(5);
        System.out.println(lista.getListaPos(5)); 
        System.out.println();
        //agora removido, a posição retornada é -1
        //fim exercicio c) ---------------------
        
        
        //exercicio d) -------------------------
        //concatenando a lista 2 na lista 1
        lista.concatenar(lista2);
        System.out.println("Concatenação da" + lista.exibirLista());
        //fim exercicio d) ---------------------
        
        //exercicio e) -------------------------
        //observando o hash de objeto de cada lista
        System.out.println(lista);
        listaNos.ListaLigada copia = new ListaLigada();
        copia.copiar(lista);
        System.out.println(copia);
        //sendo códigos diferentes e portanto únicos, exibir o conteúdo da lista cópia
        System.out.println("Cópia da" + copia.exibirLista());
        
        
        ListaDuplamenteLigada ListaDupla = new ListaDuplamenteLigada();
    }
}
