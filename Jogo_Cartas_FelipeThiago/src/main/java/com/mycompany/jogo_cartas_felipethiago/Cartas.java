/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogo_cartas_felipethiago;

/**
 *
 * @author Felipe Thiago
 */
enum Naipes{PAUS, OUROS, COPAS, ESPADAS}
enum NumerosCartas{AS, DOIS, TRES, QUATRO, CINCO, SEIS, SETE, OITO, NOVE, DEZ, VALETE, DAMA, REI}

public class Cartas {
    
    
    public final Naipes naipe;
    public final NumerosCartas numero;
    public final int valor;
    
    public Cartas(Naipes naipe, NumerosCartas numero, int valor){
        this.naipe = naipe;
        this.numero = numero;
        this.valor = valor;
    }
    
    public String getNome(){
        return "Carta " + numero + naipe;
    }
    
}
