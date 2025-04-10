package dio.introducao.poo.lanchonete.atendimento;

import dio.introducao.poo.lanchonete.area.cliente.Cliente;
import dio.introducao.poo.lanchonete.atendimento.cozinha.Cozinheiro;


public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        Atendente atendente = new Atendente();
        atendente.receberPagamento();
        atendente.servindoMesa();

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();
    }
}
