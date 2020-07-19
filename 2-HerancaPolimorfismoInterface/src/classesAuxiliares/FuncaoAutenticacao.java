package classesAuxiliares;

import interfaces.PermitirAcesso;

/*Somente receber alguém que tenha o contrato da interface de PermitirAcesso e chamar o autenticado*/
public class FuncaoAutenticacao {
	
	private PermitirAcesso permitirAcesso;
	
	public boolean autenticar(String login, String senha) {
		return permitirAcesso.autenticar(login, senha);
	}
	
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}
}
