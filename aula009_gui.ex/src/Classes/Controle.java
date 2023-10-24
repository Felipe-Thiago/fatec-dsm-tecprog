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
    
    private java.util.List listaPessoas;
    
    public Controle(){
        listaProfessores = new ArrayList<Professor>();
    }
 
    //Método para criar um novo professor e adicioná-lo à listaProfessores
    public void addProfessor(String nome, EnumGenero genero, int idade){
        //criar o professor
        listaPessoas.add(new Professor(nome, genero, idade));
    }
    
    public void addAdministrativo(String nome, EnumGenero genero, int idade){
        listaPessoas.add(new Administrativo(nome, genero, idade));
    }
    
    public void addColegial(String nome, EnumGenero genero, int idade){
        listaPessoas.add(new Colegial(nome, genero, idade));
    }
    
    public void addFundamental(String nome, EnumGenero genero, int idade){
        listaPessoas.add(new Fundamental(nome, genero, idade));
    }
    /*
    public void addPessoa(String nome, EnumGenero genero, int idade){
        listaPessoas.add(new Pessoa(nome, genero, idade) {
            @Override
            public String getNome() {
                if(super.getGenero().equals(EnumGenero.MASCULINO)) 
                    return "Sr. "+ super.nome;
                else 
                    return "Sra. "+ super.nome; 
                }
            });
    }
    */
}
