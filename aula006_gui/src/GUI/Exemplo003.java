/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Alunos
 */
public class Exemplo003 {
    private JFrame janela;
    
    public Exemplo003(){
        janela = new JFrame("Segunda Janela");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Atribui o container de janela à variável c
        Container c = janela.getContentPane();
        JLabel rotulo = new JLabel("Elemento JLabel");
        JButton botao = new JButton("Botão Simples");
        c.setLayout(new FlowLayout());
        c.add(botao);
        c.add(rotulo);
        
        janela.setSize(400, 300);
        janela.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        new Exemplo003();
    }
}
