package school.sptech;

import java.util.Scanner;

public class Ex2Tabuada {

    public static void main(String[] args) {
        System.out.println(String.format("""
                1 - Soma
                2 - Multiplicação
                3 - Divisão
                4 - Subtração
                5 - Potenciação
                6 - Resto da divisão"""));

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o número correspondente a operação desejada:");
        Integer numeroOperacao = leitor.nextInt();

        System.out.println("Digite um número inteiro");
        Integer numero = leitor.nextInt();

        Integer soma;
        Integer multiplicacao;
        Integer divisao;
        Integer subtracao;
        Integer potenciacao;
        Integer resto;

        for (int i = 1; i <= 10; i++) {
            if (numeroOperacao == 1) {
                System.out.println(numero + "+" + i + "=" + (numero + i));
            } else if (numeroOperacao == 2) {
                System.out.println(numero + "X" + i + "=" + (numero * i));
            } else if (numeroOperacao == 3) {
                System.out.println(numero + "/" + i + "=" + ((double) numero / i));
            } else if (numeroOperacao == 4) {
                System.out.println(numero + "-" + i + "=" + (numero - i));
            } else if (numeroOperacao == 5) {
                System.out.println(numero + "^" + i + "=" + (Math.pow(numero, i)));
            } else if (numeroOperacao == 6) {
                System.out.println(numero + "%" + i + "=" + (numero % i));
            } else {
                System.out.println("Opção inválida !");
            }
        }
    }
}
