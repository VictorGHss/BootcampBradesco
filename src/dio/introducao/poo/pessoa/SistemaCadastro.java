package dio.introducao.poo.pessoa;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Victor", "138.210.259-30");

        pessoa1.setEndereco("RUA DA ÁGUA");

        System.out.println(pessoa1.getNome() + " - " + pessoa1.getCpf());
    }
}
