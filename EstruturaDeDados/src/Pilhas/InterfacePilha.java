/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    import java.util.ArrayList;
    import java.util.List;
    
    
/**
 *
 * @author Alunos
 */
public interface InterfacePilha {
    List<Object> pilha = new ArrayList<>();
    
    public void empilhar(Object item);
    public Object desempilhar();
    public boolean pilhaVazia();
}
