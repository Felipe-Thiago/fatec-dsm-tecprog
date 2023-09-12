
import Classes.Alunos;
import Classes.Pessoas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alunos
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoas p1 = new Pessoas("João");
        Alunos a1 = new Alunos("Maria");
        
        System.out.println(p1.getNome());
        System.out.println(a1.getNome());
    }
    
}
