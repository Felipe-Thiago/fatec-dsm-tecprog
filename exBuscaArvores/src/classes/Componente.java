
package Classes;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Componente  implements Serializable {
    private String nome,descricao, id;
    private float custo;
    private List listaServicos;
    private List listaComponentes;
    private int contNumPecas;
    
    public Componente(String nome, String id) {
        this.nome=nome;
        this.id = id;
        listaComponentes=new ArrayList<Componente>();
        listaServicos=new ArrayList<EnumServicos>();
        contNumPecas=1;
        custo=0;
    }
    public Componente(String nome, String id, String descricao){
        this(nome, id);
        this.descricao=descricao;
    }
    
    public Componente addComponente(String nome){
        Componente aux=new Componente(nome, id+"."+contNumPecas);
        listaComponentes.add(aux);
        contNumPecas+=1;
        return aux;        
    }
    public Componente addComponente(String nome, String descricao){
        Componente aux= Componente.this.addComponente(nome);
        aux.setDescricao(descricao);
        return aux;
    }
    public void addServico(EnumServicos TIPO, String descricaoServico, float qtdHoras){
        listaServicos.add(new Servicos(TIPO, descricaoServico, qtdHoras));
    }
    
    public Componente buscaComponente(String id){
        /*===================================================================
          ||  Aprimore esse método para permitir que o Componente           || 
          ||  identificado pelo id sejá encontrado, utilize o conceito de   ||
          ||  busca em profundidade em arvores para solucionar esse problema||
          ===================================================================*/
        Componente c;
        for(int i=0;i<listaComponentes.size();i++){ //pega um componente e busca cada item nele
            
            c=(Componente) listaComponentes.get(i); //pega o item atual no componente
            Componente aux = null;
            
            if(c.id.equals(id)){
                return c;
            }//se o item atual tiver id compativel, retorna o próprio componente
            else{ //se o id não for compatível, passar pra frente
                aux = c.buscaComponente(id); //define que um auxiliar seja igual ao filho do componente
                if (aux != null){ //se aux tiver um valor, mesma lógica do if acima
                    return aux;
                }
            }                                    
                
        }
        return null;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getId() {
        return id;
    }

    public float getCusto() {
        return custo;
    }
    

    public List getListaServicos() {
        return listaServicos;
    }

    public List getListaComponentes() {
        return listaComponentes;
    }
    public void calcularCusto(){
        //Soma os custos de todos os componentes que compoem o Equipamento
        //Valores possíveis: a do serviço atual, a dos serviços dos filhos
        //o valor está atribuído ao enum = tipo de serviço
        
        float soma = 0;
        Servicos s;
        Componente c;
        for(int i = 0; i < listaServicos.size(); i++){
           s = (Servicos) listaServicos.get(i);
           
           if(s.getTIPO() != null){
               soma += s.getQtdHoras()*s.getTIPO().getValor();
               
           }
        }
        
        //próximo passo: pegar os serviços dos filhos do componentes em diante
        
        for(int i = 0; i < listaComponentes.size(); i++){
            c = (Componente) listaComponentes.get(i);
            
            c.calcularCusto();
            soma += c.getCusto();
            
        }
        
       custo = soma;
    }
}
