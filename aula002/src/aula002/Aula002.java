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
        arvore[2] = new Pessoa("Marcos", 49, new Pessoa("Conceição"), new Pessoa(null));
        arvore[3] = new Pessoa("Luciane", 50, arvore[1], arvore[0]);
        //eu
        arvore[4] = new Pessoa("Felipe", 19, arvore[3], arvore[2]);
        //irmaos
        arvore[5] = new Pessoa("Junior", 31, arvore[3], arvore[2]);
        arvore[6] = new Pessoa("Ariane", 27, arvore[3], arvore[2]);
        arvore[7] = new Pessoa("Adriele", 23, arvore[3], arvore[2]);
        //tios
        arvore[8] = new Pessoa("Rogério", 57, arvore[1], arvore[0]);
        arvore[9] = new Pessoa("Silvana", 58, arvore[1], arvore[0]);
        
        System.out.println(arvore[4].getNome() + 
                " \n=> Mãe: " + arvore[4].getMae().getNome() +
                " \n=> Pai: " + arvore[4].getPai().getNome() +
                " \n=> " + arvore[4].nomeFilhos() +
                " \n=> " + arvore[4].nomeIrmaos()
        );
        System.out.println(arvore[3].getNome() +
                " \n=> Mãe: " + arvore[3].getMae().getNome() +
                " \n=> Pai: " + arvore[3].getPai().getNome() +
                " \n=> " + arvore[3].nomeFilhos() +
                " \n=> " + arvore[3].nomeIrmaos()
        );
    }
    
}
