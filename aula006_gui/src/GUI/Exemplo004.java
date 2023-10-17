/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

/**
 *
 * @author Alunos
 */
public class Exemplo004 {
    private JFrame janela;
    
    public Exemplo004(){
        janela = new JFrame("Quarta Janela");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        
        JLabel label = new JLabel("Label");
        JButton botao = new JButton("Botao 1");
        JButton botao2 = new JButton("Botao 2");
        JButton botao3 = new JButton("Botao 3");
        
        p1.setBackground(Color.yellow);
        p1.setLayout(new FlowLayout(FlowLayout.LEFT));
        p1.add(label);
        
        p2.setBackground(Color.blue);
        p2.add(botao);
        
        p3.setBackground(Color.green);
        p3.setLayout(new GridLayout(2,1));
        p3.add(botao2);
        p3.add(botao3);
        
        Container c = janela.getContentPane();
        c.add(p1, BorderLayout.NORTH);
        c.add(p2, BorderLayout.SOUTH);
        c.add(p3, BorderLayout.EAST);
        
        janela.setSize(400, 300);
        janela.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        new Exemplo004();
    }
}
