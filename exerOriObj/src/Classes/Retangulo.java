/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Felipe Thiago
 */

enum FormasGeometricas{QUADRADO, RETANGULO} 
public class Retangulo {
    public FormasGeometricas tipo; 
    private double lado, lado2, area, perimetro;
    private String msg;
    
    
    public double getLado(){
        return lado;
    }
    public double getLado2(){
        return lado2;
    }
    
    public double getAreaQ(){
        area = lado * lado;
        return area;
    }
    public double getAreaR(){
        area = lado * lado2;
        return area;
    }
    public double getPerimetroQ(){
        perimetro = lado*4;
        return perimetro;
    }
    public double getPerimetroR(){
        perimetro = lado*2 + lado2*2;
        return perimetro;
    }
    
    
    
    //construtores
    public Retangulo(double lado){
        this.lado = lado;
        
        tipo = FormasGeometricas.QUADRADO; 
    }
    
    public Retangulo(double lado, double lado2){
        this(lado);
        this.lado2 = lado2;

        tipo= FormasGeometricas.RETANGULO; 
    }
    
    public String getMensagem(){
        if (tipo.toString().equals("QUADRADO")){
            this.msg = "Quadrado com " + lado + " de lado,"
                + " perímetro de " + getPerimetroQ() + 
                " e área de " + getAreaQ();
        } 
        if (tipo.toString().equals("RETANGULO")){
            this.msg = "Retangulo com " + lado + " por " + lado2 + " de lado,"
                + " perímetro de " + getPerimetroR() + 
                " e área de " + getAreaR();
        }
        return msg;
    }
    
    
}
