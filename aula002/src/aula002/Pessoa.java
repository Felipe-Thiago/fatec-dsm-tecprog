/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula002; 

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Felipe
 */
public class Pessoa {
    //variáveis
    private String nome;
    private int idade;
    private Pessoa mae, pai;

    private List<Pessoa> filhos = new ArrayList<>();
    private List<Pessoa> irmaos = new ArrayList<>();
    //<<<<<>>>>>>
    
    
    //<<<<<<>>>>>>
    
    //setters
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public void setMae(Pessoa mae){
        this.mae = mae;
    }
    
    public void setPai(Pessoa pai){
        this.pai = pai;
    }
    

    public void setFilho(List<Pessoa> filhos){
        this.filhos = filhos;
    }
    
    public void setIrmaos(List<Pessoa> irmaos){
        this.irmaos = irmaos;
    }

    //<<<<<<<<<>>>>>>>>>>
    
    //getters
    public String getNome(){
        return this.nome;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public Pessoa getMae(){
        return this.mae;
    }
    
    public Pessoa getPai(){
        return this.pai;
    }
    
    public List<Pessoa> getFilhos(){
        return this.filhos;
    }
    
    public List<Pessoa> getIrmaos(){
        return this.irmaos;
    }
    
    //<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>
    
    //Construtores
    //sempre publico, sempre possui o nome da classe a que pertence, não possui retorno (void etc)
    public Pessoa(String nome){
        this.nome = nome;
    }
    //construtor da aula passada
    public Pessoa(String nome, int idade) {
        this(nome); //através da recursão ele chama o construtor passado
        this.idade = idade;
    }
    public Pessoa(String nome, int idade, Pessoa mae){
        this(nome, idade);

        this.mae = mae;
        

        setMaternidade(mae);

    }
    public Pessoa(String nome, int idade, Pessoa mae, Pessoa pai){
        this(nome, idade, mae);
        this.pai = pai;
        
    }
    

    public Pessoa(String nome, int idade, Pessoa mae, Pessoa pai, List<Pessoa> irmaos){
        this(nome, idade, mae, pai);
        this.irmaos = irmaos;
        
    }
    
 

    
    //<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>
    
   

    


    //Demais funções
    private void setMaternidade(Pessoa mae){
        this.mae = mae;
        mae.addFilho(this);
        
        //for each, para cada irmao 1 filho incrementado da lista de filhos
        for (Pessoa irmao : mae.filhos){
            if (irmao == this){
                continue;
            }
            irmao.addIrmao(this);
            this.addIrmao(irmao);
        }
        
        //para cada pessoa com a mesma mãe em comum
        //é adicionado a essa mãe essa pessoa como filho
        //preciso que, para cada pessoa com a mesma mãe em comum
        //é adicionado o filho dessa mãe como irmão
        //ao mesmo tempo que a maternidade é setada, a irmandade também
    }
    
    private void addFilho(Pessoa filho){
        filhos.add(filho);        
    }
    
    private void addIrmao(Pessoa irmao){
        irmaos.add(irmao);
    }
   
    
    

    public String nomeFilhos(){
        String mensagem = "Filhos: ";
        int i;
        if (filhos.size() == 0){
            mensagem += "-";
        }
        for(i=0; i<filhos.size(); i++){
            mensagem += filhos.get(i).nome;
            if (i < filhos.size() - 1){
                mensagem += ", ";
            }
        }
        
        
        return mensagem;
    }
    
    public int qtdFilhos(){
        return this.filhos.size();
    }
    
    
    
    
    public String nomeIrmaos(){
        String mensagem = "Irmãos: ";
        int i;
        if (irmaos.size() == 0){
            mensagem += "-";
        }
        for(i=0; i<irmaos.size(); i++){
            // adicionado para o exercicio <<<<>>>>>
           
            // <<<<<<>>>>>>>>
            mensagem += irmaos.get(i).nome;
            if (i < irmaos.size() - 1){
                mensagem += ", ";
            }
        }
        
        return mensagem;
    }
    
    public int qtdIrmaos(){
        return this.irmaos.size();
    }
    
}
