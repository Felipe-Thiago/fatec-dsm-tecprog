
import exercicioAula.ExercicioPilha;
import recursao.Fatorial;
import exercicioAula.PilhaInteger;
import exercicioAula.PilhaString;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Alunos
 */
public class EstruturaDeDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
       Fatorial fatorial = new Fatorial();
       int num = 4;
       
       num = fatorial.fatorialRec(num);
        System.out.println(num);
        */
        /*
        PilhaInteger p = new PilhaInteger();
        p.empilhar(1);
        p.empilhar(2);
        p.empilhar(3);
        
        while(!p.pilhaVazia()){
            System.out.println(p.desempilhar());
        }
        */
        
        PilhaString pString = new PilhaString();
        pString.empilhar("A");
        pString.empilhar("B");
        pString.empilhar("C");
        
        while(!pString.pilhaVazia()){
            System.out.println(pString.desempilhar());
            
        }
        
        System.out.println(ExercicioPilha.palindromo("ana")); //criou uma String palavra
        System.out.println("");
        System.out.println(ExercicioPilha.validaBalanceamento("[({A+B}*C)+F]"));
    }
    
}
