package dio.introducao.poo.encapsulamento;

public class MSNMessenger {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("ENVIANDO MENSAGEM");
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("RECEBENDO MENSAGEM");
    }

    private void validarConectadoInternet() {
        System.out.println("VALIDANDO SE ESTÁ CONECTADO A INTERNET...");
        System.out.println("USUÁRIO ESTÁ CONECTADO NA INTERNET");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("SALVANDO HISTÓRICO DA MENSAGEM");
    }
}
