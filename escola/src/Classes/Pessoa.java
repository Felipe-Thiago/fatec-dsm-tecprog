/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Alunos
 */
public abstract class Pessoa {
    protected String nome;
    private String genero;
    private int idade;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public abstract String getNome();
    
    public String getGenero(){
        return genero;
    }
    public int getIdade(){
        return idade;
    }
}
