
import recursao.Fatorial;

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
       Fatorial fatorial = new Fatorial();
       int num = 4;
       
       num = fatorial.fatorialRec(num);
        System.out.println(num);
    }
    
}
