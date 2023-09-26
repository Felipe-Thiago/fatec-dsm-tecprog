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
public final class Professor extends Funcionario{
    private float salarioHora, qtdHoras;
    
    public Professor(String nome, String genero, int idade) {
        super(nome, genero, idade);
    }
    
    public Professor(String nome, String genero, int idade, float salarioHora){
        super(nome, genero, idade);
        this.salarioHora = salarioHora;
    }
    
    @Override
    public String getNome(){
        return "Prof. " + super.getNome();
    }



    public float getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(float qtdHoras) {
        this.qtdHoras = qtdHoras;
    }
    
    
    
    
    
    
}
