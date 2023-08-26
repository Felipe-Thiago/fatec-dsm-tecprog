/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula002;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Felipe
 */
public class Aula002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //List<Pessoa> arvoreG = new ArrayList<>();
        
        Pessoa[] arvore = new Pessoa[10];
        //avós
        arvore[0] = new Pessoa("Arlindo");
        arvore[1] = new Pessoa("Leonilda");
        //pais
        arvore[2] = new Pessoa("Marcos", 49);
        arvore[3] = new Pessoa("Luciane", 50);
        //eu
        arvore[4] = new Pessoa("Felipe", 19, arvore[3]);
        //irmao
        arvore[5] = new Pessoa("Junior", 31, arvore[3]);
        
        System.out.println(arvore[4].getNome() + " => Mãe: " + arvore[4].getMae().getNome());
    }
    
}
