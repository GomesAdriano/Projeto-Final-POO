package br.edu.ufam.maintec;

import java.util.ArrayList;
import java.util.Collection;

public class Categoria {

    private Collection<String> categoriaList = new ArrayList<>();
    
    public Collection<String> getLista() {
		return categoriaList;
	}
    
    public void adicionarLista(String categoria) {
		getLista().add(categoria);
	}
    
    public void cadastrarCategoria(){
      
    	adicionarLista("1 - Manutenção de Eletrodomésticos");
    	adicionarLista("2 - Manutenção de Computadores");
    	adicionarLista("3 - Manutenção de Ar-Condicionado");
    	
    }
    
    public void exibirLista() {  
    	
    	for(int i = 0; i < getLista().size(); i++) {
    		System.out.println(getLista().toArray()[i]);
    	}    	
  		
  	}
    
    public String categoriaEscolhida(String op) {  
    	
    	int opcao = Integer.parseInt(op);
    	String categoria = (String) getLista().toArray()[opcao-1];
    	return categoria;
  		
  	}

}
