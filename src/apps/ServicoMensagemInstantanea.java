package apps;

public abstract class ServicoMensagemInstantanea {
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	
	protected void validarConectando() {
		System.out.println("Validando se esta conectado a internet");
	}
}

	