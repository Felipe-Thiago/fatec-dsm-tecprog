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
public class TesteArvore {
    
    
    public static void criarArvore(){
        ArvoreBinaria arvore;
        arvore = new ArvoreBinaria(100);
        
        arvore.adicionarOrdenado(30);
        arvore.adicionarOrdenado(150);
        arvore.adicionarOrdenado(20);
        arvore.adicionarOrdenado(35);
        arvore.adicionarOrdenado(130);
        arvore.adicionarOrdenado(135);
        
        
    }
    public static void main(String[] args) {
        criarArvore();
    }
}
