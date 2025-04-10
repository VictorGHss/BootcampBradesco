package dio.introducao.sintaxe.repeticao;

import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");

        do {
            System.out.println("Telefone tocando");
        } while (tocando());
        System.out.println("\uD83D\uDDE3\uFE0F: Fala corno ");
    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;
        return !atendeu;
    }
}
