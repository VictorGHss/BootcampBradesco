package dio.introducao.poo.polimorfismo.apps;

import dio.introducao.poo.polimorfismo.ServicoMensagemInstantanea;

public class FacebookMessenger extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        validarInternet();
        System.out.println("--ENVIANDO MENSAGEM PELO FACEBOOK MESSENGER--");
    }

    @Override
    public void receberMensagem() {
        System.out.println("--RECEBENDO MENSAGENS PELO FACEBOOK MESSENGER--");

    }
}
