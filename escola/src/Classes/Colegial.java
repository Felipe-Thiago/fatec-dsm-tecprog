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
public final class Colegial extends Aluno {
    
    
    public float getNota(){
        return nota;
    }
    
    @Override
    public String exibirNotas(){
        if(nota >= 0 && nota <= 10){
            super.nota //continuando o raciocinio, deve ***gravar*** na classe Aluno com o super
        }
        return nota;
    }
    
}
