package dio.introducao.excecoes;

public class CepInvalidoException extends Exception {
    public CepInvalidoException() {
        super("CEP inválido");
    }
}