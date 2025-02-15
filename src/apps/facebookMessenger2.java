package apps;

public class facebookMessenger2 extends ServicoMensagemInstantanea {
	public void enviarMensagem() {
		validarConectando();
		System.out.println("Enviando mensagem pelo Facebook");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook");
	}
}
