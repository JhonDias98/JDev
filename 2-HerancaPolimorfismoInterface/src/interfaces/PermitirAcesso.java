package interfaces;

/*Essa interface ser� o contrato de autentica��o*/
public interface PermitirAcesso {

	/*Na interface cria apenas a declara��o do m�todo*/
	public boolean autenticar();
	public boolean autenticar(String login, String senha);
}
