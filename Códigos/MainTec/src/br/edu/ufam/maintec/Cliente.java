package br.edu.ufam.maintec;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {

    //Cliente
    private int idCliente;
    private String nome;
    private String email;
    private String senha;
    //Telefone
    private String numeroTelefone1;
    private String numeroTelefone2;
    //Endere√ßo
    private String bairro;
    private String rua;
    private String numeroCasa;
    private String referencia;
    
    private ArrayList<Cliente> clientesList = new ArrayList<Cliente>();
    private Scanner scan = new Scanner(System.in);
    
    public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNumeroTelefone1() {
		return numeroTelefone1;
	}

	public void setNumeroTelefone1(String numeroTelefone1) {
		this.numeroTelefone1 = numeroTelefone1;
	}

	public String getNumeroTelefone2() {
		return numeroTelefone2;
	}

	public void setNumeroTelefone2(String numeroTelefone2) {
		this.numeroTelefone2 = numeroTelefone2;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumeroCasa() {
		return numeroCasa;
	}

	public void setNumeroCasa(String numeroCasa) {
		this.numeroCasa = numeroCasa;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public int login(){
    	
		int id = -1;
		String checkEmail, checkSenha;
		
		System.out.println("\n\nLogin do Cliente");
		
		System.out.print("Informe seu email: ");
		email = scan.nextLine();
		
		System.out.print("Informe sua senha: ");
		senha = scan.nextLine();			
			
			
		for(int i = 0; i < clientesList.size(); i++) {
			
			checkEmail = clientesList.get(i).getEmail();
			checkSenha = clientesList.get(i).getSenha();	  
			
			if(checkEmail.equals(email) &&
			   checkSenha.equals(senha)) {
				
				id = i;				
			}		
		}		
		return id;		
    }
    
    public void logout(){
    	System.out.println("\n\nCliente deslogado");
    }
    
    
    public void cadastrar(){
    	
    	Cliente clientes = null;	    
	    clientes = new Cliente();
	    
	    System.out.println("\n----------Cliente----------\n");
		
	    System.out.println("\nInformaÁıes de Acesso");
		  
		System.out.print("Informe seu nome completo: ");
		clientes.setNome(scan.nextLine());
		  
		System.out.print("Informe seu email: ");
		clientes.setEmail(scan.nextLine());
		  
		System.out.print("Informe uma senha: ");
		clientes.setSenha(scan.nextLine());
		  
		System.out.println("\nInformaÁıes de Contato");
		  
		System.out.print("Informe o telefone 1: ");
		clientes.setNumeroTelefone1(scan.nextLine());
		
		System.out.print("Informe o telefone 2: ");
		clientes.setNumeroTelefone2(scan.nextLine());
		  
		System.out.println("\nInformaÁıes de EndereÁo");
		  
		System.out.print("Informe seu bairro: ");
		clientes.setBairro(scan.nextLine());
		
		System.out.print("Informe sua rua: ");
		clientes.setRua(scan.nextLine());
		
		System.out.print("Informe o n˙mero da sua casa: ");
		clientes.setNumeroCasa(scan.nextLine());
		  
		System.out.print("Informe uma referÍncia: ");
		clientes.setReferencia(scan.nextLine());
	    
	    clientesList.add(clientes);	    
		
    }
    
    public void exibirInfo(int id){	    	
			
		System.out.println("\nInformaÁıes de Perfil");		  
		System.out.println("Nome: " + clientesList.get(id).getNome());
		System.out.println("Email: " + clientesList.get(id).getEmail());		
		  
		System.out.println("\nInformaÁıes de Contato");		  
		System.out.println("Telefone 1: " + clientesList.get(id).getNumeroTelefone1());		  
		System.out.println("Telefone 2: " + clientesList.get(id).getNumeroTelefone2());
		  
		System.out.println("\nInformaÁıes de EndereÁo");		  
		System.out.println("Bairro: " + clientesList.get(id).getBairro());		      
		System.out.println("Rua: " + clientesList.get(id).getRua());	
		System.out.println("N˙mero da Casa: " + clientesList.get(id).getNumeroCasa());
		System.out.println("ReferÍncia: " + clientesList.get(id).getReferencia());
				
    }
}
