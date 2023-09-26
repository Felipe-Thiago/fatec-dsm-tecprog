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
public final class Colegial extends Aluno{
    
    public Colegial(String nome, String genero, int idade) {
        super(nome, genero, idade);
    }
    
    public Colegial(String nome, String genero, int idade, String nota) {
        super(nome, genero, idade, nota);
    }
    
    
}
