package dio.introducao.sintaxe.debugging;

/*
Em um sistema de média de notas, o certo é usar o tipo primitivo "double"
para que os números quebrados funcionem.
 */

import java.util.Scanner;

public class CalculadoraDeMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

        //int media = calculaMediaDaTurma(alunos, sc);
        double media = calculaMediaDaTurma(alunos, sc);
        System.out.printf("Média da turma %.2f ", media);
    }

    //public static int calculaMediaDaTurma(String[] alunos, Scanner sc) {
    public static double calculaMediaDaTurma(String[] alunos, Scanner sc) {
        //int soma = 0;
        double soma = 0;
        for (String aluno : alunos) {
            System.out.printf("Nota do aluno %s: ", aluno);
            //int nota = sc.nextInt();
            double nota = sc.nextDouble();
            soma += nota;
        }
        return soma / alunos.length;
    }
}
