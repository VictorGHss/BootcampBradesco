package dio.introducao.poo.polimorfismo.apps;

import dio.introducao.poo.polimorfismo.ServicoMensagemInstantanea;

public class MSNMessenger extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        validarInternet();
        System.out.println("--ENVIANDO MENSAGEM PELO MSN MESSENGER--");
    }

    @Override
    public void receberMensagem() {
        System.out.println("--RECEBENDO MENSAGEM PELO MSN MESSENGER--");
    }
}
