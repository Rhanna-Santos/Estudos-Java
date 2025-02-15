package apps;

public class MSNMessenger extends ServicoMensagemInstantanea{
	public void enviarMensagem() {
		validarConectando();
		System.out.println("Enviando mensagem pelo msn");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo msn");
	}
}
