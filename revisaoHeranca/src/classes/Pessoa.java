/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Alunos
 */
public abstract class Pessoa {
    private String nome;
    private String genero;
    private int idade;
    
    //construtor
    public Pessoa(String nome, String genero, int idade){
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
    }
    
    public Pessoa(String nome, String genero, String idade){
        
    }
    
    
    //getters
    public String getNome(){
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public int getIdade() {
        return idade;
    }
    
    
    //setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
