/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvoreBinaria;

/**
 *
 * @author Alunos
 */
public class NoBinario {
    private Integer info;
    private NoBinario esquerda, direita;
    
    //construtor
    public NoBinario(Integer info, NoBinario esquerda, NoBinario direita){
        this.info = info;
        this.esquerda = esquerda;
        this.direita = direita;
    }

    //Métodos setters e getters
     public void setInfo(Integer info) {
        this.info = info;
    }

    public void setEsquerda(NoBinario esquerda) {
        this.esquerda = esquerda;
    }

    public void setDireita(NoBinario direita) {
        this.direita = direita;
    }
    
    public Integer getInfo() {
        return info;
    }

    public NoBinario getEsquerda() {
        return esquerda;
    }

    public NoBinario getDireita() {
        return direita;
    }
}
