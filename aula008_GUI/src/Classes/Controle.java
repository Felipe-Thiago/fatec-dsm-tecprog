/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author Alunos
 */
public class Controle {
    
    //Atributos
    
    private java.util.List listaProfessores;
    
    public Controle(){
        listaProfessores = new ArrayList<Professor>();
    }
 
    //Método para criar um novo professor e adicioná-lo à listaProfessores
    public void addProfessor(String nome, EnumGenero genero, int idade){
        //criar o professor
        listaProfessores.add(new Professor(nome, genero, idade));
    }
    
}
