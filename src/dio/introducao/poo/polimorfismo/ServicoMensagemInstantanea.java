package dio.introducao.poo.polimorfismo;

public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void validarInternet(){
        System.out.println("--VERIFICANDO SE O USUÁRIO ESTÁ CONECTADO NA INTERNET--");
    }
}
