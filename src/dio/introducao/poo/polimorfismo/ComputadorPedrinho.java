package dio.introducao.poo.polimorfismo;

import dio.introducao.poo.polimorfismo.apps.FacebookMessenger;
import dio.introducao.poo.polimorfismo.apps.MSNMessenger;
import dio.introducao.poo.polimorfismo.apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;
        /*
        NÃO SABE QUAL APP VAI USAR
        MAS QUALQUER UM DEVE ENVIAR E RECEBER MENSAGEM
         */

        String appEscolhido = "tg";
        if (appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if (appEscolhido.equals("fbm"))
            smi = new FacebookMessenger();
        else if (appEscolhido.equals("tg"))
            smi = new Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();

    }
}