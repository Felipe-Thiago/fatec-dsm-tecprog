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
public class Funcionario extends Pessoa{
    private float salario;
    
    public Funcionario(String nome, String genero, int idade) {
        super(nome, genero, idade);
    }
    public Funcionario(String nome, String genero, int idade, float salario) {
        super(nome, genero, idade);
        this.salario = salario;
    }
    
    public float getSalario(){
        return salario;
    }
    
    public void setSalario(float Salario){
        this.salario = salario;
    }
    
    
    @Override
    public String getNome(){
        return "Sr./Sra " + super.getNome();
    }
    
}
