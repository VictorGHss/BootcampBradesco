package dio.introducao.poo.polimorfismo.apps;

import dio.introducao.poo.polimorfismo.ServicoMensagemInstantanea;

public class Telegram extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        validarInternet();
        System.out.println("--ENVIANDO MENSAGEM PELO TELEGRAM--");
    }

    @Override
    public void receberMensagem() {
        System.out.println("--RECEBENDO MENSAGEM PELO TELEGRAM--");
    }
}
