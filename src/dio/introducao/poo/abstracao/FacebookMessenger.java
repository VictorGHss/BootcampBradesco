package dio.introducao.poo.abstracao;

public class FacebookMessenger extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        System.out.println("--ENVIANDO MENSAGEM PELO FACEBOOK MESSENGER--");
    }

    @Override
    public void receberMensagem() {
        System.out.println("--RECEBENDO MENSAGENS PELO FACEBOOK MESSENGER--");

    }
}
