/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.lang.Math;
 
import java.util.*;
import java.lang.*;
import java.io.*;

/**
 *
 * @author Alunos
 */
public class Calculadora {
    //Variáveis
    private double valorA, valorB, resultado;
    private String resultMsg;
    private char sinal;
    
    
    
    //Métodos públicos
    public void soma(double valorA, double valorB){
        this.valorA = valorA;
        this.valorB = valorB;
        resultado = valorA + valorB;
        sinal = '+';
    }
    
    public void sub(double valorA, double valorB){
        resultado = valorA - valorB;
        sinal = '-';
    }
    
    public void mult(double valorA, double valorB){
        resultado = valorA * valorB;
        sinal = '*';
    }
    
    public void div(double valorA, double valorB){
        resultado = valorA / valorB;
        sinal = '/';
    }
    
    
    
    
    
    public double getResultadoValor(){
        return resultado;
    }
    
    
    public String getResultadoString(){
        resultMsg = valorA + " " + sinal + " " + valorB + " = " + resultado;
        return resultMsg;
    }
    
    
    
    public String convertDecToBin(int numDec){
        int resto;
        String numBin = "";
        while (numDec > 0){
            resto = numDec % 2;
            numDec = numDec / 2;
            numBin = resto + numBin; 
            //nota: resto antes do + pra não precisar inverter a string toda
        }
        
        
        return numBin;
    }
    
    public double convertBinToDec(String numBin){
        String binario = (new StringBuilder(numBin).reverse().toString()); //Inverte o número binário para o cálculo
        int tamanho = binario.length(); //Resgata o tamanho do número para usar de limite mais tarde 
        int soma = 0;
        
        //para binario2 = 000101, que vem de binario = 101000
        //i = 0, exp = 2^0 = 1, num = 1 * 0 = 0
        //i = 1, exp = 2^1 = 2, num = 2 * 0 = 0
        //i = 2, exp = 2^2 = 4, num = 4 * 0 = 0
        //i = 3, exp = 2^3 = 8, num = 8 * 1 = 8
        //i = 4, exp = 2^4 = 16, num = 16 * 0 = 0
        //i = 5, exp = 2^5 = 32, num = 32 * 1 = 32
        //0 + 0 + 0 + 8 + 0 + 32 = 40 = 101000
        
        for (int i = 0; i < tamanho; i++){ 
            double exp = Math.pow(2, i);
            int num = (int)exp * Character.getNumericValue(binario.charAt(i));
            
            soma = soma + num;
        }
        
        String msg = numBin + " é igual a " + soma + " em decimal";
        
        return soma;
    }
    
   
    
}
