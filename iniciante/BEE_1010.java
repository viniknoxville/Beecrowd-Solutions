package academy.marcos.beecrowd.iniciante;

/*
 QUESTÃO
 Neste problema, deve-se ler o código de uma peça 1, o número de peças 1,
 o valor unitário de cada peça 1, o código de uma peça 2, o número de
 peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o
 valor a ser pago.

 ENTRADA
 O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3
 valores, respectivamente dois inteiros e um valor com 2 casas decimais.

 SAÍDA
 A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo,
 lembrando de deixar um espaço após os dois pontos e um espaço após
 o "R$". O valor deverá ser apresentado com 2 casas após o ponto.
*/

import java.io.IOException;
import java.util.Scanner;

public class BEE_1010 {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int codPeca01 = leitor.nextInt();
        int quantidadePecas01 = leitor.nextInt();;
        double valorPeca01 = leitor.nextDouble();

        int codPeca02 = leitor.nextInt();
        int quantidadePecas02 = leitor.nextInt();;
        double valorPeca02 = leitor.nextDouble();

        double valorPagar = ((quantidadePecas01*valorPeca01) + (quantidadePecas02*valorPeca02));

        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", valorPagar));

    }
}
