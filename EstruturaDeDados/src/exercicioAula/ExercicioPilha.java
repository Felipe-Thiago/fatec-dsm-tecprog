/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioAula;

import java.util.ArrayList;
import java.util.List;

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
        
        //receber pilha
        //criar uma lista de pilhas auxiliares
        //receber o topo da pilha e passar a uma pilha auxiliar
        //fazer novamente, se o numero atual for maior que o topo da pilha auxiliar,
        //criar uma nova pilha auxiliar
        //fazer até esvaziar a pilha principal
        //agora, com as pilhas auxiliares, percorrer todos os topos para pegar
        //o maior número e colocá-lo na pilha de saída
        //fazer novamente até ter a pilha de saída
        
    public static PilhaInteger ordenaPilhaInt(PilhaInteger pilhaEntrada){ //pilhaEntrada = (a, b, c, d, e...)
        List<PilhaInteger> aux = new ArrayList<PilhaInteger>();
        aux.add(new PilhaInteger());
        
        boolean empilhado = false;
        
        int temp = 0;
        int indiceTemp = 0;
        
        PilhaInteger pilhaSaida = new PilhaInteger();
        
        while (!pilhaEntrada.pilhaVazia()){
            if(aux.get(0).pilhaVazia()){ //só funcionam os métodos de uma pilha
                aux.get(0).empilhar(pilhaEntrada.desempilhar());
                //pilhaEntrada teve o topo retirado e colocado na pilhaaux 0
            }
            
            for(int i = 0; i <= aux.size(); i++){
                if (temp <= aux.get(i).exibirTopo()){
                    indiceTemp = i;
                    temp = aux.get(i).exibirTopo();
                }
            
                pilhaSaida.empilhar(aux.get(indiceTemp).desempilhar());
                if (aux.get(indiceTemp).pilhaVazia()){
                    aux.remove(indiceTemp);
                }
            }
            
        }
        
        

        
        return pilhaSaida;
    }
    
}
