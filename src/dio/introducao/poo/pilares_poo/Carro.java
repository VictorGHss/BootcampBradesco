package dio.introducao.poo.pilares_poo;

public class Carro extends Veiculo {
    private String modelo;
    private String marca;
    private String cor;
    private String placa;
    private String chassi;
    private int ano;


    public void ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("CARRO LIGADO");
    }

    private void confereCombustivel() {
        System.out.println("CONFERINDO COMBUSTÍVEL");
    }

    private void confereCambio() {
        System.out.println("CONFERINDO CAMBIO EM P");
    }
}
