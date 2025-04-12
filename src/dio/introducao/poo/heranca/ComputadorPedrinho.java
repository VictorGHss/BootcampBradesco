package dio.introducao.poo.heranca;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        System.out.println("====MSN MESSENGER====");
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        System.out.println("====FACEBOOK MESSENGER====");
        FacebookMessenger fbm = new FacebookMessenger();
        fbm.enviarMensagem();
        fbm.receberMensagem();

        System.out.println("====TELEGRAM====");
        Telegram tg = new Telegram();
        tg.enviarMensagem();
        tg.receberMensagem();
    }
}
