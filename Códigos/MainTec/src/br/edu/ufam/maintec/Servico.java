package br.edu.ufam.maintec;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class Servico {

    //Serviçoo
    private int idServico;
    private int idProposta;
    private int idCliente;
    private int idEspecialista;
    private String dataServico = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
    
    private ArrayList<Servico> servicoList = new ArrayList<Servico>();
         
    public int getIdServico() {
		return idServico;
	}

	public void setIdServico(int idServico) {
		this.idServico = idServico;
	}

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

	public int getIdEspecialista() {
		return idEspecialista;
	}

	public void setIdEspecialista(int idEspecialista) {
		this.idEspecialista = idEspecialista;
	}

	public String getDataServico() {
		return dataServico;
	}

	public void setDataServico(String dataServico) {
		this.dataServico = dataServico;
	}
	
	public void cadastrarServico(int idCliente, int idEspecialista, int idProposta){
		
		Servico servico = null;	    
		servico = new Servico();
	    	
		servico.setIdCliente(idCliente);
		servico.setIdEspecialista(idEspecialista);
	    servico.setIdProposta(idProposta);
	    servico.setDataServico(dataServico);	
	    
	    servicoList.add(servico);	   
    }
    
    public void exibirServico(int id, int tipo){
    	
    	System.out.println("\n----------Serviços----------\n");
    	
    	for(int i = 0; i < servicoList.size(); i++) {
    		
    		if(servicoList.get(i).getIdCliente() == id && tipo == 0) {
    			System.out.println("\nInformações do Serviço");		  
        		System.out.println("Id do serviço: " + servicoList.get(i).getIdServico());
        		System.out.println("Id da proposta: " + servicoList.get(i).getIdProposta());		
        		System.out.println("Id do cliente: " + servicoList.get(i).getIdCliente());		  
        		System.out.println("Id do especialista: " + servicoList.get(i).getIdEspecialista());
        		System.out.println("Data do serviço: " + servicoList.get(i).getDataServico());		      	
        	}
    		
    		if(servicoList.get(i).getIdEspecialista() == id && tipo == 1) {
    			System.out.println("\nInformações do Serviço");		  
        		System.out.println("Id do serviço: " + servicoList.get(i).getIdServico());
        		System.out.println("Id da proposta: " + servicoList.get(i).getIdProposta());		
        		System.out.println("Id do cliente: " + servicoList.get(i).getIdCliente());		  
        		System.out.println("Id do especialista: " + servicoList.get(i).getIdEspecialista());
        		System.out.println("Data do serviço: " + servicoList.get(i).getDataServico());		      	
        	}
    				
		} 
    }

}
