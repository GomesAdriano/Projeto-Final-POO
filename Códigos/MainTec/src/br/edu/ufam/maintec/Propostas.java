package br.edu.ufam.maintec;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Propostas {

    //Propostas
    private int idProposta;
    private int idCliente;
    private String nomeServico;
    private String descricao;
    private String categoria;
    private String dataProposta = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
    private String status;
    
    private ArrayList<Propostas> propostaList = new ArrayList<Propostas>();
    private Scanner scan = new Scanner(System.in);
    
    public int getIdProposta() {
		return idProposta;
	}

	public void setIdProposta(int idProposta) {
		this.idProposta = idProposta;
	}
	
	 public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNomeServico() {
		return nomeServico;
	}

	public void setNomeServico(String nomeServico) {
		this.nomeServico = nomeServico;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDataProposta() {
		return dataProposta;
	}

	public void setDataProposta(String dataProposta) {
		this.dataProposta = dataProposta;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	
	public void cadastrarProposta(int id){
		
		Categoria c = new Categoria();
		c.cadastrarCategoria();
		
		Propostas proposta = null;	    
		proposta = new Propostas();
	    
	    System.out.println("\n----------Proposta----------\n");
		
	    System.out.println("\nInforma��es da Proposta");
		
	    proposta.setIdCliente(id);
	    
		System.out.print("Informe o nome do servi�o: ");
		proposta.setNomeServico(scan.nextLine());
		  
		System.out.print("Informe a descri��o do servi�o: ");
		proposta.setDescricao(scan.nextLine());
		  
		System.out.println("Lista de Categorias");	
		c.exibirLista(); 
		System.out.print("Informe o n� da categoria: ");		
		proposta.setCategoria(c.categoriaEscolhida(scan.nextLine()));
	      
		proposta.setDataProposta(dataProposta);
		proposta.setStatus("Dispon�vel");		
	    
		propostaList.add(proposta);	   
    }
    
    public void exibirProposta(int id){      	
    	
    	System.out.println("\nInforma��es das Propostas");
    	
    	for(int i = 0, j = 1; i < propostaList.size(); i++, j++) {
    		
    		if(propostaList.get(i).getIdCliente() == id) {
    			System.out.println("\n" + j + " - Proposta");
        		System.out.println("Nome do servi�o: " + propostaList.get(i).getNomeServico());
        		System.out.println("Descri��o do servi�o: " + propostaList.get(i).getDescricao());		
        		System.out.println("Categoria: " + propostaList.get(i).getCategoria());		  
        		System.out.println("Data do servi�o: " + propostaList.get(i).getDataProposta());
        		System.out.println("Status do servi�o: " + propostaList.get(i).getStatus());		      
        		System.out.println("---------------------------------------------------------");		      
        		
        	}
    				
		}  		
		   	
    }
    
    public int selecionarProposta(int id){      	
    	
    	String opcao;
    	
    	System.out.println("\nInforma��es das Propostas");	
    	
    	for(int i = 0, j = 1; i < propostaList.size(); i++, j++) {
    		
    		if(propostaList.get(i).getIdCliente() == id) {
    			System.out.println("\n" + j + " - Proposta");
        		System.out.println("Nome do servi�o: " + propostaList.get(i).getNomeServico());
        		System.out.println("Descri��o do servi�o: " + propostaList.get(i).getDescricao());		
        		System.out.println("Categoria: " + propostaList.get(i).getCategoria());		  
        		System.out.println("Data do servi�o: " + propostaList.get(i).getDataProposta());
        		System.out.println("Status do servi�o: " + propostaList.get(i).getStatus());		      
        		System.out.println("---------------------------------------------------------");		      
        		
        	}
    				
		}
    	
    	System.out.print("Informe o n� da proposta: ");
		opcao = scan.nextLine();	
		
		int idp = Integer.parseInt(opcao);
			
		return idp-1;	
		   	
    }
    
    public int exibirTodasProposta(){
    	
    	String opcao;
    	
    	System.out.println("\nInforma��es das Propostas");	
    	
    	for(int i = 0, j = 1; i < propostaList.size(); i++) {    		
    		
    		System.out.println("\n" + j + " - Proposta");
    		System.out.println("Nome do servi�o: " + propostaList.get(i).getNomeServico());
    		System.out.println("Descri��o do servi�o: " + propostaList.get(i).getDescricao());		
    		System.out.println("Categoria: " + propostaList.get(i).getCategoria());		  
    		System.out.println("Data do servi�o: " + propostaList.get(i).getDataProposta());
    		System.out.println("Status do servi�o: " + propostaList.get(i).getStatus());		      
    		System.out.println("---------------------------------------------------------");		      
    				
		}   
    			
		System.out.print("Informe o n� da proposta: ");
		opcao = scan.nextLine();	
		
		int idp = Integer.parseInt(opcao);
			
		return idp-1;	
    }
    
    public int retornaIdCliente(int idProposta){
    	
    	int idc;
    	
		idc = propostaList.get(idProposta).getIdCliente();
    		
		return idc;	
    }
    
    public void alteraStatus(int idProposta, String status){
    	
    	propostaList.get(idProposta).setStatus(status);
    
    }
}
