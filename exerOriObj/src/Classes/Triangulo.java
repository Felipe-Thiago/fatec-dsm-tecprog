/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Felipe Thiago
 */

enum TiposTriangulos{TRIANGULO_RETANGULO, TRIANGULO_OBTUSANGULO, TRIANGULO_ACUTANGULO};
public class Triangulo {
    private double base, altura;
    private double segmentoAB, segmentoAC, angulo;
    public TiposTriangulos tipo;
    private String msg;
    
    //construtores
    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
        tipo = TiposTriangulos.TRIANGULO_RETANGULO;
        angulo = 90;
    }
    
    public Triangulo(double segmentoAB, double segmentoAC, double angulo){
        this.segmentoAB = segmentoAB;
        this.segmentoAC = segmentoAC;
        this.angulo = angulo;
        
        if(angulo <= 0) angulo = 90;
        if(0 < angulo && angulo < 90){
            tipo = TiposTriangulos.TRIANGULO_ACUTANGULO;
        }
        if(angulo > 90){
            tipo = TiposTriangulos.TRIANGULO_OBTUSANGULO;
        }
    }
    
    public String getMensagem(){
        if (tipo.toString().equals("TRIANGULO_RETANGULO")){
            this.msg = "Triângulo RETÂNGULO com " + base + " de base," +
            altura + " de altura e " + angulo + "º de ângulo.";
        }
        if (tipo.toString().equals("TRIANGULO_ACUTANGULO")){
            this.msg = "Triângulo ACUTÂNGULO com " + segmentoAB + " de A a B," +
            segmentoAC + " de A a C e " + angulo + "º de ângulo.";
        }
        if (tipo.toString().equals("TRIANGULO_OBTUSANGULO")){
            this.msg = "Triângulo OBTUSÂNGULO com " + segmentoAB + " de A a B," +
            segmentoAC + " de A a C e " + angulo + "º de ângulo.";
        }
        return msg;
    }
    
    /*private double getArea(){
      continuar  
    }
    */
}
