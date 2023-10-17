/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JFrame;

/**
 *
 * @author Alunos
 */
public class Exemplo002 {
    private JFrame janela;
    
    public Exemplo002(){
        janela = new JFrame("Segunda Janela");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        janela.setSize(400, 300);
        janela.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        new Exemplo002();
    }

    
}
