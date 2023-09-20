/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.lang.Math;
import Classes.*;
/**
 *
 * @author Alunos
 */
public class ExerOriObj {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.soma(10, 5);
        System.out.println(calc.getResultadoString());
        
        System.out.println();
        System.out.println(calc.convertDecToBin(10));
        System.out.println(calc.convertBinToDec("1010"));
        System.out.println();
        
        Retangulo retangulo = new Retangulo(4, 5);
        Retangulo quadrado = new Retangulo(6);
        
        
        System.out.println(quadrado.getMensagem());
        System.out.println(retangulo.getMensagem());
        
        Triangulo triangulo = new Triangulo(10, 20, 100);
        System.out.println(triangulo.getResultadoString());
        
        
    }
    
}
