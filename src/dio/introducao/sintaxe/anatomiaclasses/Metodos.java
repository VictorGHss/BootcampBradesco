package dio.introducao.sintaxe.anatomiaclasses;

public class Metodos {

    public static void main(String[] args) {
        String primeiroNome = "Victor";
        String segundoNome = "Gabriel";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado do metodo: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
