/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.lang.Math;

/**
 *
 * @author Felipe Thiago
 */

enum TiposTriangulos{TRIANGULO_RETANGULO, TRIANGULO_OBTUSANGULO, TRIANGULO_ACUTANGULO};
public class Triangulo {
    private double base, altura;
    private double segmentoAB, segmentoAC, angulo;
    private double area, perimetro, segmentoBC;
    public TiposTriangulos tipo;
    private String msg, resultMsg;
    
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
    
    /*public String getMensagem(){
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
*/
    
    public double getArea(){
      if (tipo.toString().equals("TRIANGULO_RETANGULO")){
          area = (base * altura)/2;
      } else{
          area = (segmentoAB*segmentoAC*angulo)/2; 
      }
      return area;
    }
    
    public double getPerimetro(){
        if (tipo.toString().equals("TRIANGULO_RETANGULO")){
            segmentoBC = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
            perimetro = segmentoBC + base + altura;
        } else{
            double cosseno = Math.toRadians(angulo);
            segmentoBC = Math.sqrt(Math.pow(segmentoAB, 2) + Math.pow(segmentoAC, 2)
            - 2 * segmentoAB * segmentoAC * cosseno);
            perimetro = segmentoBC + segmentoAB + segmentoAC;
        }
        
        
        return perimetro;
    }
    
    public String getResultadoString(){
        if(tipo.toString().equals("TRIANGULO_RETANGULO")){
            this.resultMsg = "A área do triângulo retângulo de base " + base +
                    " e altura " + altura + " é de " + getArea() +
                    " com o perímetro de aprox. " + Math.round(getPerimetro()); 
        } else{
            if(tipo.toString().equals("TRIANGULO_ACUTANGULO")){
                this.resultMsg = "A área do triângulo acutângulo com lado "
                        + "A = " + segmentoAB + " e lado B = " + segmentoAC
                        + " e ângulo AB = " + angulo + " é de " + getArea() +
                        " com o perímetro de aprox. " + Math.round(getPerimetro());
            }
            if(tipo.toString().equals("TRIANGULO_OBTUSANGULO")){
                this.resultMsg = "A área do triângulo obtusângulo com lado "
                        + "A = " + segmentoAB + " e lado B = " + segmentoAC
                        + " e ângulo AB = " + angulo + " é de " + getArea() +
                        " com o perímetro de aprox. " + Math.round(getPerimetro());
            }
        }
        return resultMsg;
    }
}
