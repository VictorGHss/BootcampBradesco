package dio.introducao.poo.pilares_poo;

public class Autodromo {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.setModelo("Renegade");
        carro1.setMarca("Jeep");
        carro1.setAno(2021);
        carro1.setCor("Preto");
        carro1.setPlaca("RLLK-1092");
        carro1.setChassi("8971239");

        Moto moto1 = new Moto();
        moto1.setChassi("323891");

        carro1.ligar();
        moto1.ligar();

        Veiculo coringa = carro1;
        coringa.ligar();
    }
}
