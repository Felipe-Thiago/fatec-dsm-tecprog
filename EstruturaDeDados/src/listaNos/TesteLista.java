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
        lista.adicionarNo(1); //indice 0
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
    }
}
