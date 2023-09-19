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
public final class Fundamental extends Aluno{
    private String notaAlf;
    
    public void setNota(String notaAlf){
        this.notaAlf = Float.toString(nota);
        
    }
    
    public float getNota(){
        return nota;
    }
    
    @Override
    public String getNome(){
        return super.nome;
    }
    
    @Override
    public String exibirNotas(){
        if (nota <= 6){
            notaAlf = "D";
        } else{
            if (nota > 6 && nota <= 8){
                notaAlf = "C";
                
            } else{
                if (nota > 8 && nota <= 9){
                notaAlf = "B";
                } else{
                    if (nota > 9){
                        notaAlf = "A";
                    }
                }
            }
        }
        return notaAlf;
    }

    
}
