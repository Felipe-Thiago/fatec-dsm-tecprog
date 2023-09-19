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
public final class Professor extends Funcionario{
    private float salarioHora, qtdHoras;
    
    @Override
    public double calculaSalario(){
        return super.salarioBase + (salarioHora * qtdHoras);
    }
    @Override
    public String getNome(){
        if(super.getGenero().equals("masculino")){
            return "Professor" + super.nome;
        } else{
            return "Professora" + super.nome;
        }
    }
}
