package dio.introducao.poo.pilares_poo;

public abstract class Veiculo {
    private String modelo;
    private String marca;
    private String cor;
    private String placa;
    private String chassi;
    private int ano;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public abstract void ligar();

    public void imprimirDados() {
        System.out.println("===== Informações sobre os Veículos =====");
        System.out.println("MODELO: " + modelo);
        System.out.println("MARCA: " + marca);
        System.out.println("COR: " + cor);
        System.out.println("PLACA: " + placa);
        System.out.println("ANO: " + ano);
    }
}
