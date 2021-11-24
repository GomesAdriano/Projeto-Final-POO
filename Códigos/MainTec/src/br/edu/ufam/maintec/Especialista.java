package br.edu.ufam.maintec;

import java.util.ArrayList;
import java.util.Scanner;

public class Especialista extends Cliente{
	
    //Especialista
    private int idEspecialista;
    private String especializacao;
    private String email;
    private String senha;
    
    private ArrayList<Especialista> especialistasList = new ArrayList<Especialista>();
    private Scanner scan = new Scanner(System.in);    
    
    public int getIdEspecialista() {
		return idEspecialista;
	}

	public void setIdEspecialista(int idEspecialista) {
		this.idEspecialista = idEspecialista;
	}

	public String getEspecializacao() {
		return especializacao;
	}

	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}
	
	@Override
	public int login(){
    	
		int id = -1;
		String checkEmail, checkSenha;
		
		System.out.println("\n\nLogin do Especialista");
		
		System.out.print("Informe seu email: ");
		email = scan.nextLine();
		
		System.out.print("Informe sua senha: ");
		senha = scan.nextLine();			
			
			
		for(int i = 0; i < especialistasList.size(); i++) {
			
			checkEmail = especialistasList.get(i).getEmail();
			checkSenha = especialistasList.get(i).getSenha();	  
			
			if(checkEmail.equals(email) &&
			   checkSenha.equals(senha)) {
				
				id = i;				
			}		
		}		
		return id;		
    }
	
	@Override
	public void logout(){
		System.out.println("\n\nEspecialista deslogado");
    }

	@Override
	public void cadastrar(){
      
		Categoria c = new Categoria();
		c.cadastrarCategoria();
		
		Especialista especialista = null;	    
		especialista = new Especialista();
		
		System.out.println("\n----------Especialista----------\n");
		
		System.out.println("\nInforma��es de Acesso");
		  
		System.out.print("Informe seu nome completo: ");
		especialista.setNome(scan.nextLine());
		  
		System.out.print("Informe seu email: ");
		especialista.setEmail(scan.nextLine());
		  
		System.out.print("Informe uma senha: ");
		especialista.setSenha(scan.nextLine());
		  
		System.out.println("\nInforma��es de Contato");
		  
		System.out.print("Informe o telefone 1: ");
		especialista.setNumeroTelefone1(scan.nextLine());
		
		System.out.print("Informe o telefone 2: ");
		especialista.setNumeroTelefone2(scan.nextLine());
		  
		System.out.println("\nInforma��es de Endere�o");
		  
		System.out.print("Informe seu bairro: ");
		especialista.setBairro(scan.nextLine());
		
		System.out.print("Informe sua rua: ");
		especialista.setRua(scan.nextLine());
		
		System.out.print("Informe o n�mero da sua casa: ");
		especialista.setNumeroCasa(scan.nextLine());
		  
		System.out.print("Informe uma refer�ncia: ");
		especialista.setReferencia(scan.nextLine());
		
		System.out.println("\nInforma��es de Especializa��o");
		c.exibirLista(); 
		System.out.print("Informe o n� da sua especializa��o: ");
		
		especialista.setEspecializacao(c.categoriaEscolhida(scan.nextLine()));
	    
		especialistasList.add(especialista);		
    }
    
    @Override
    public void exibirInfo(int id){
      
    	System.out.println("\nInforma��es de Perfil");		  
		System.out.println("Nome: " + especialistasList.get(id).getNome());
		System.out.println("Email: " + especialistasList.get(id).getEmail());		
		  
		System.out.println("\nInforma��es de Contato");		  
		System.out.println("Telefone 1: " + especialistasList.get(id).getNumeroTelefone1());		  
		System.out.println("Telefone 2: " + especialistasList.get(id).getNumeroTelefone2());
		  
		System.out.println("\nInforma��es de Endere�o");		  
		System.out.println("Bairro: " + especialistasList.get(id).getBairro());		      
		System.out.println("Rua: " + especialistasList.get(id).getRua());	
		System.out.println("N�mero da Casa: " + especialistasList.get(id).getNumeroCasa());
		System.out.println("Refer�ncia: " + especialistasList.get(id).getReferencia());
		    	
    	System.out.println("\nInforma��es de Especializa��o");		  
		System.out.println("Especializa��o: " + especialistasList.get(id).getEspecializacao());
		
    }

}
