package dio.introducao.poo.heranca;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        FacebookMessenger fbm = new FacebookMessenger();
        fbm.enviarMensagem();
        fbm.receberMensagem();

        Telegram tg = new Telegram();
        tg.enviarMensagem();
        tg.receberMensagem();
    }
}
