/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursao;

/**
 *
 * @author Alunos
 */
public class Fatorial {
    public int fatorialRec(int num){
        if (num == 0){
            return 1;
        }
        
        num = num * fatorialRec(num - 1);
        return num;
    }
    
    public static void main(String[] args) {
       Fatorial fatorial = new Fatorial();
       int num = 6;
       int num2 = num;
       
       num = fatorial.fatorialRec(num);
        System.out.println("O fatorial de " + num2 + " é " + num);
    }
}
