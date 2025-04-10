package dio.introducao.sintaxe.excecoes;

public class CepInvalidoException extends Exception {
    public CepInvalidoException() {
        super("CEP inválido");
    }
}