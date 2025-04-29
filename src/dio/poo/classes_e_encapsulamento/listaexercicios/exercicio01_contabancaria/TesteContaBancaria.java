package dio.poo.classes_e_encapsulamento.listaexercicios.exercicio01_contabancaria;

public class TesteContaBancaria {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Jose Pinto Silva", "123.456.789-00");
        ContaBancaria conta1 = new ContaBancaria(usuario1, 600.0);

        conta1.exibirInformacoes();

        conta1.sacar(900.0);
        conta1.exibirInformacoes();

        conta1.depositar(100.0);
        conta1.exibirInformacoes();

        conta1.depositar(500.0);
        conta1.exibirInformacoes();

        conta1.pagarBoleto(200.0);
        conta1.exibirInformacoes();
    }
}
