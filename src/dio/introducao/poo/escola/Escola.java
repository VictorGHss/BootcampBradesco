package dio.introducao.poo.escola;

public class Escola {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Victor");
        aluno1.setIdade(20);
        aluno1.setTelefoneResponsavel(40028922);

        System.out.println("O aluno " + aluno1.getNome() + " tem " + aluno1.getIdade() + " anos.");
        System.out.println("O número do responsavel pelo aluno " + aluno1.getNome() + " é " + aluno1.getTelefoneResponsavel());

    }
}
