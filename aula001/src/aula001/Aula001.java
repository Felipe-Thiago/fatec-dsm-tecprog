/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula001;

/**
 *
 * @author Alunos
 */
public class Aula001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String msg;
        String msg2;
        
        //msg = "Hello, World!";
        //System.out.println(msg);
        
        Pessoa felipe = new Pessoa("Felipe", 19);
        Pessoa creusa = new Pessoa("Creusa", 70);
        Pessoa mauricio;
        mauricio = new Pessoa("Mauricio", 30);
        
        // Filhos
        Pessoa joao, maria, pedro;
        joao = new Pessoa("João", 10);
        pedro = new Pessoa("Pedro", 15);
        
        felipe.mae = creusa;
        felipe.pai = mauricio;
        felipe.filhos.add(joao);
        felipe.filhos.add(pedro);
        
        msg = felipe.mae.nome + " é mãe de " + felipe.nome
                + " e " + felipe.pai.nome + " é o pai.";
        msg2 = "Felipe tem " + felipe.filhos.size() + " filhos."
                + "\n" + felipe.nomeFilhos();
        System.out.println(msg + "\n" + msg2);
    }
    
}
