/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.lang.Math;

/**
 *
 * @author Alunos
 */
public class Calculadora {
    //Variáveis
    private double valorA, valorB, resultado;
    private String resultMsg;
    
    
    //Métodos públicos
    public void soma(double valorA, double valorB){
        resultado = valorA + valorB;
    }
    
    public void sub(double valorA, double valorB){
        resultado = valorA - valorB;
    }
    
    public void mult(double valorA, double valorB){
        resultado = valorA * valorB;
    }
    
    public void div(double valorA, double valorB){
        resultado = valorA / valorB;
    }
    
    public String getResultadoString(){
        return resultMsg;
    }
    
    public double getResultadoValor(){
        this.resultado = resultado;
        return resultado;
    }
}
