package dio.introducao.excecoes;

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite seu nome: ");
        String nome = sc.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = sc.next();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();

        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Tenho " + altura + " cm de altura");


        /*
        Java.lang.NullPointerException: Quando tentamos obter alguma informação de uma variável nula
        Java.lang.ArithmeticException: Quando tentamos dividir um valor por zero
        Java.sql.SQLException: Quando existe um erro relacionado a interação com um banco de dados
        Java.io.FileNotFoundException: Quando tentamos ler ou escrever um arquivo que não existe
         */

        /*
         **Tratamento de Exceções**
         * A instrução TRY permite definir um bloco de código para ser testado quanto a erros enquanto está sendo executado.
         * A instrução CATCH permite definir um bloco de código a ser executado, caso ocorra um erro no bloco TRY
         * A instrução FINALLY permite definir um bloco de código a ser executado, independente de ocorrer um erro ou não.
         * As palavras-chave TRY e CATCH vêm em pares:
         */
    }
}
