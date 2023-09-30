/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioAula;

/**
 *
 * @author Alunos
 */
public class ExercicioPilha {
    
    public static boolean palindromo(String palavra){ //palavra = "Olá"
        //captar String palavra e percorrer
        //enquanto percorre usar pilha para empilhar outra String
        //devolver outra String invertida
        //comparar String invertida com a String palavra
        
        PilhaString p = new PilhaString();
        String palavraInv = "";
        for(int i = 0; i < palavra.length(); i++){
            p.empilhar(Character.toString(palavra.charAt(i)));
            //formou a pilha " O L A "
            
        }
        while (!p.pilhaVazia()){
            palavraInv = palavraInv + p.desempilhar();
            //formou a String palavraInv " A L O "
        }
        
        if (palavra == palavraInv){
            System.out.println("A palavra " + palavra + " é um palíndromo!");
            return true;
        }
            
        else{
            System.out.println("A palavra " + palavra + " não é um palíndromo...");
            System.out.println("Palavra invertida: " + palavraInv);
            return false;
        }
            
    }
    
    public static boolean validaBalanceamento(String sequencia){
        //Captar String sequencia e percorrer aberturas
        //Enquanto percorre formar pilha com o fechamento
        
        //posso contar o numero de aberturas "(" e comparar com o numero de fechamentos ")"
        PilhaString p2 = new PilhaString();
        
        for(int i = 0; i < sequencia.length(); i++){
            //ver aberturas
            if(Character.toString(sequencia.charAt(i)).equals("(")){
                p2.empilhar(")");
            }
            if(Character.toString(sequencia.charAt(i)).equals("[")){
                p2.empilhar("]");
            }
            if(Character.toString(sequencia.charAt(i)).equals("{")){
                p2.empilhar("}");
            }
            
            //ver fechamentos e comparar com o topo que foi sendo incluido
            if(sequencia.charAt(i) == ')'){
                if(p2.exibirTopo().equals(Character.toString(sequencia.charAt(i)))){
                    p2.desempilhar();
                } else{
                    return false;
                }
            }
            if(sequencia.charAt(i) == ']'){
                if(p2.exibirTopo().equals(Character.toString(sequencia.charAt(i)))){
                    p2.desempilhar();
                } else{
                    return false;
                }
            }
            if(sequencia.charAt(i) == '}'){
                if(p2.exibirTopo().equals(Character.toString(sequencia.charAt(i)))){
                    p2.desempilhar();
                } else{
                    return false;
                }
            }
            /*if(sequencia.charAt(i)==')' ||
                    sequencia.charAt(i)==']' ||
                    sequencia.charAt(i)=='}'){
                if(p2.exibirTopo().equals(sequencia.charAt(i))){
                    p2.desempilhar();
                } else{
                    return false;
                }
            }
            */
        }
        
        if (p2.pilhaVazia()) return true;
        else return false;
        
        
    }
}
