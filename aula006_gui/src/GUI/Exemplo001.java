package GUI;

import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alunos
 */
public class Exemplo001 {
    private JFrame janela;
    
    public Exemplo001(){
        janela = new JFrame("Primeira Janela");
        
        janela.setSize(400, 300);
        janela.setVisible(true);
    }
    
    public static void main(String[] args) {
        Exemplo001 p = new Exemplo001();
    }
}
