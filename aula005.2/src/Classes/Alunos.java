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
public class Alunos extends Pessoas{
    int ra;
    Pessoas responsavel;
    double mediaFinal;
    
    public Alunos(String nome){
        super(nome);
    }
    public Alunos(String nome, int ra){
        super(nome);
        this.ra = ra;
    }
    public Alunos(String nome, int ra, double mediaFinal){
        super(nome);
        this.mediaFinal = mediaFinal;
    }
    
    @Override
    public String getNome(){
        return super.nome;
    }
    
    @Override
    public String toString(){
        return "meu nome é " + super.nome;
    }
}