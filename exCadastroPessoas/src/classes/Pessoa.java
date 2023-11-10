
package Classes;

import java.io.Serializable;
import javax.swing.JOptionPane;

public abstract class Pessoa implements Serializable {
    
    protected String nome;
    private EnumGenero genero;
    private int idade;
    private String id;
    
    public Pessoa(String nome, EnumGenero genero, int idade) throws Exception{
        this.nome=nome;
        this.genero=genero;
        
        //this.idade = idade;
        setIdade(idade);
    }
    
    /* ==== Métodos abstratos ==== */
     public abstract String getNome();
     
    /*===== Getters e Setters =====*/
    public EnumGenero getGenero() {
        return genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(EnumGenero genero) {
        this.genero = genero;
    }

    public void setIdade(int idade) throws Exception { //gerar exceção e tratar idade <= 0, tratar no cadastro
        this.idade = idade;
       
    }
    
    
    
    
}
