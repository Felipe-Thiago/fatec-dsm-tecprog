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
        
        
        System.out.println(lista.exibirLista());
        System.out.println(lista2.exibirLista());
        
        System.out.println(lista.getListaPos(9));
        //retorno = 3
    }
}
