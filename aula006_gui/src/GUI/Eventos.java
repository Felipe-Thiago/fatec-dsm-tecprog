/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Alunos
 */
public class Eventos implements ActionListener{
    private JFrame janela;
    private JButton jb;
    private JButton jb2;
    
    public Eventos(){
        janela = new JFrame("Janela de Eventos");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(new FlowLayout());
        
        jb = new JButton("OK");
        jb.addActionListener(this);
        
        jb2 = new JButton("Botão 2");
        jb2.addActionListener(this);
        
        Container c = janela.getContentPane();
        c.add(jb);
        c.add(jb2);
        
        janela.setSize(400, 300);
        janela.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        new Eventos();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == jb){
            JOptionPane.showMessageDialog(janela, "Você clicou no botão 1");
        } else if(e.getSource() == jb2){
            JOptionPane.showMessageDialog(janela, "Você clicou no botão 2");
        }
        
    }
}
