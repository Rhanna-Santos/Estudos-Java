package computador;

import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.TelegramMessenger2;
import apps.facebookMessenger2;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		ServicoMensagemInstantanea smi = null;
		
		String appEscolhido = "tlg";
		
		if(appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if(appEscolhido.equals("fbm"))
			smi = new facebookMessenger2();
		else if(appEscolhido.equals("tlg"))
			smi = new TelegramMessenger2();
		
		smi.enviarMensagem();
		smi.receberMensagem();
	}
	
}
