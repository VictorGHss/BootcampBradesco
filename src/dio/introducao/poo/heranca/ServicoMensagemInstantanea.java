package dio.introducao.poo.heranca;

public class  ServicoMensagemInstantanea {
        public void enviarMensagem() {
            validarConectadoInternet();
            System.out.println("ENVIANDO MENSAGEM");
            salvarHistoricoMensagem();
        }

        public void receberMensagem() {
            System.out.println("RECEBENDO MENSAGENS");
        }

        private void validarConectadoInternet(){
            System.out.println("VALIDANDO SE O USUÁRIO ESTÁ CONECTADO NA INTERNET");
        }
        private void salvarHistoricoMensagem(){
            System.out.println("SALVANDO HISTÓRICO DA MENSAGEM");
        }
    }