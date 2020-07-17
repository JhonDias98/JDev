package interfaces;

/*Essa interface será o contrato de autenticação*/
public interface PermitirAcesso {

	/*Na interface cria apenas a declaração do método*/
	public boolean autenticar();
	public boolean autenticar(String login, String senha);
}
