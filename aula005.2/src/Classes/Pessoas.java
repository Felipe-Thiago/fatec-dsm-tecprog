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
public class Pessoas {
    //variáveis
    String nome;
    String cpf;
    String telefone;
    String endereco;
    
    
    //métodos setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    //métodos getters
    public String getNome(){
        return this.nome;
    }
    public String getCpf(){
        return this.cpf;
    }
    public String getTelefone(){
        return this.telefone;
    }
    public String getEndereco(){
        return this.endereco;
    }
    
    //Construtores
    public Pessoas(String nome){
        this.nome = nome;
    }
    
    public Pessoas(String nome, String Cpf){
        this(nome);
        this.cpf = cpf;
    }
    
    public Pessoas(String nome, String cpf, String telefone){
        this(nome, cpf);
        this.telefone = telefone;
    }
    
    public Pessoas(String nome, String cpf, String telefone, String endereco){
        this(nome, cpf, telefone);
        this.endereco = endereco;
    }
    
    //demais métodos
    
}
