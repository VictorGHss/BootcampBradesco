package dio.poo.classes_e_encapsulamento.listaexercicios.exercicio01_contabancaria;

public class Usuario {
    private String nome;
    private String cpf;

    public Usuario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + ", CPF: " + cpf;
    }
}
