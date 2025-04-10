package dio.introducao.sintaxe.metodos;

public class SmartTv {
    boolean ligada = false;
    double canal = 1;
    int volume = 12;

    public void aumentarVolume() {
        System.out.println("Aumentando volume para: " + volume);
        volume++;
    }

    public void diminuirVolume() {
        System.out.println("Diminuindo volume para: " + volume);
        volume--;
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void mudarCanal(double novoCanal) {
        canal = novoCanal;
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }


}
