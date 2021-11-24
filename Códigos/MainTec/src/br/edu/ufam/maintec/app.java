package br.edu.ufam.maintec;

public class app {

  public static void main(String[] args) {
   
	  int idCliente;
	  int idEspecialista;
	  int idProposta;
	  final int tipoC = 0;
	  final int tipoE = 1;
	  
	  Cliente c = new Cliente();
	  Especialista e = new Especialista();
	  Propostas p = new Propostas();
	  Servico s = new Servico();
	  
	  c.cadastrar();
	  //c.cadastrar();
	  //c.cadastrar();
	  idCliente = c.login();	  
	  c.exibirInfo(idCliente);
	  
	  p.cadastrarProposta(idCliente);
	  //p.cadastrarProposta(idCliente);
	  //p.cadastrarProposta(idCliente);
	  p.exibirProposta(idCliente);
	  
	  c.logout();
	  
	  e.cadastrar();
	  //e.cadastrar();
	  idEspecialista = e.login();	  
	  e.exibirInfo(idEspecialista);
	  
	  idProposta = p.exibirTodasProposta();
	  idCliente = p.retornaIdCliente(idProposta);
	  
	  s.cadastrarServico(idCliente, idEspecialista, idProposta);
	  p.alteraStatus(idProposta,"Em andamento");
	  //s.exibirServico(idEspecialista, tipoE);
	  
	  e.logout();
	  
	  idCliente = c.login();	  
	  c.exibirInfo(idCliente);
	  idProposta = p.selecionarProposta(idCliente);
	  p.alteraStatus(idProposta, "Concluída");
	  p.exibirProposta(idCliente);
	  
	  s.exibirServico(idCliente, tipoC);	  
  }
}
