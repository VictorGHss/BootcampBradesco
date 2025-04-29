package dio.poo.classes_e_encapsulamento.listaexercicios.exercicio01_contabancaria;

public class ContaBancaria {
    private Usuario usuario;
    private double saldo;
    private double chequeEspecial;
    private double usadoChequeEspecial;

    public ContaBancaria(Usuario usuario, double depositoInicial) {
        this.usuario = usuario;
        this.saldo = depositoInicial;
        this.chequeEspecial = (depositoInicial <= 500.0) ? 50.0 : depositoInicial * 0.5;
        this.usadoChequeEspecial = 0.0;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public double consultarChequeEspecial() {
        return chequeEspecial;
    }

    public boolean estaUsandoChequeEspecial() {
        return saldo < 0;
    }

    public void depositar(double valor) {
        System.out.println("\nDepositando R$" + valor + "...");
        if (estaUsandoChequeEspecial()) {
            double taxa = usadoChequeEspecial * 0.2;
            double totalDivida = usadoChequeEspecial + taxa;
            if (valor >= totalDivida) {
                valor -= totalDivida;
                usadoChequeEspecial = 0;
                saldo = valor;
                System.out.println("Cheque especial quitado com taxa de R$" + taxa);
            } else {
                usadoChequeEspecial = totalDivida - valor;
                saldo = -usadoChequeEspecial;
                System.out.println("Parcial do cheque especial quitada. Restante: R$" + usadoChequeEspecial);
            }
        } else {
            saldo += valor;
            System.out.println("Depósito feito com sucesso.");
        }
    }

    public boolean sacar(double valor) {
        System.out.println("\nSacando R$" + valor + "...");
        if (valor <= (saldo + chequeEspecial)) {
            saldo -= valor;
            if (saldo < 0) {
                usadoChequeEspecial = Math.abs(saldo);
            }
            System.out.println("Saque realizado.");
            return true;
        } else {
            System.out.println("Saque negado. Limite insuficiente.");
            return false;
        }
    }

    public boolean pagarBoleto(double valor) {
        System.out.println("\nPagando boleto de R$" + valor + "...");
        return sacar(valor);
    }

    public void exibirInformacoes() {
        System.out.println("\n--- INFORMAÇÕES DA CONTA ---");
        System.out.println(usuario.toString());
        System.out.println("Saldo: R$" + saldo);
        System.out.println("Cheque Especial: R$" + chequeEspecial);
        System.out.println("Usado do Cheque Especial: R$" + usadoChequeEspecial);
        System.out.println("Usando Cheque Especial? " + (estaUsandoChequeEspecial() ? "Sim" : "Não"));
    }
}

