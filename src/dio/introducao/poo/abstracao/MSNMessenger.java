package dio.introducao.poo.abstracao;

public class MSNMessenger extends ServicoMensagemInstantanea{
    @Override
    public void enviarMensagem() {
        System.out.println("--ENVIANDO MENSAGEM PELO MSN MESSENGER--");
    }

    @Override
    public void receberMensagem() {
        System.out.println("--RECEBENDO MENSAGEM PELO MSN MESSENGER--");
    }
}
