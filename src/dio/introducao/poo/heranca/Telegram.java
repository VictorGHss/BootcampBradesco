package dio.introducao.poo.heranca;

public class Telegram {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("ENVIANDO MENSAGEM PELO TELEGRAM");
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("RECEBENDO MENSAGEM PELO TELEGRAM");
    }

    private void validarConectadoInternet() {
        System.out.println("VALIDANDO SE ESTÁ CONECTADO A INTERNET...");
        System.out.println("USUÁRIO ESTÁ CONECTADO NA INTERNET");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("SALVANDO HISTÓRICO DA MENSAGEM");
    }
}
