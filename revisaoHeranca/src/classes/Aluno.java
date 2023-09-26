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
public abstract class Aluno extends Pessoa{
    protected float nota;
    
    public Aluno(String nome, String genero, int idade) {
        super(nome, genero, idade);
    }
    
    public Aluno(String nome, String genero, int idade, float nota){
        super(nome, genero, idade);
        this.nota = nota;
    }
    
    public float getNota(){
        return nota;
    }
    
    public void setNota(float Nota){
        this.nota = nota;
    }
    
    @Override
    public String getNome(){
        return super.getNome() + " e eu sou um aluno";
    }
    
}
