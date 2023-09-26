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
public final class Fundamental extends Aluno{
    private String notaLetra;
    
    public Fundamental(String nome, String genero, int idade) {
        super(nome, genero, idade);
    }
    
    
    @Override
    public String getNota(){
        if(super.nota >= 9) return "A";
        else if(super.nota >= 7) return "B";
        else if(super.nota >= 5) return "C";
        else return "D";
        
    }
    
}
