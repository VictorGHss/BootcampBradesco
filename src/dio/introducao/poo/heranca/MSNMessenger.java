package dio.introducao.poo.heranca;

public class MSNMessenger {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("ENVIANDO MENSAGEM PELO MSN MESSENGER");
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("RECEBENDO MENSAGEM PELO MSN MESSENGER");
    }

    private void validarConectadoInternet() {
        System.out.println("VALIDANDO SE ESTÁ CONECTADO A INTERNET...");
        System.out.println("USUÁRIO ESTÁ CONECTADO NA INTERNET");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("SALVANDO HISTÓRICO DA MENSAGEM");
    }
}
