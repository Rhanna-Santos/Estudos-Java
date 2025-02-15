package apps;

public class TelegramMessenger2 extends ServicoMensagemInstantanea{
	public void enviarMensagem() {
		validarConectando();
		System.out.println("Enviando mensagem pelo Telegram");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Telegram");
	}
}
