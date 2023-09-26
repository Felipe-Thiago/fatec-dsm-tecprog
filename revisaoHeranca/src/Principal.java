   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import classes.*;
import java.util.List;
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
        
        List l;
        //Pessoa p = new Pessoa("Gabriela", "Feminino", 21);
        //p.setNome("Felipe");
        //System.out.println("Meu nome é " + p.getNome());
        
        Funcionario f = new Funcionario("Gabriela", "Feminino", 21, 5000.0f);
        Funcionario f2 = new Funcionario("Heitor", "Masculino", 24);
        
        System.out.println("Meu nome é " + f.getNome());
        
        
        Aluno a1, a2;
        a1 = new Aluno("Carina", "Feminino", 13, 9.5f);
        a2 = new Aluno("Luiz", "Masculino", 15);
        System.out.println("Meu nome é " + a1.getNome());
        
    }
    
}
