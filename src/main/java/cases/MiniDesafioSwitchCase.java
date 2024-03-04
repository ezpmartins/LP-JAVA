package cases;

import java.util.Scanner;

public class MiniDesafioSwitchCase {
    public static void main(String[] args) {

        System.out.println(String.format("""
                1 - Somar
                2 - Subtrair
                3 - Multiplicar"""));

        System.out.println("Digite um número para realizar a operação desejada:");
        Scanner leitor = new Scanner(System.in);
        Integer operacao = leitor.nextInt();

        while (operacao != 1 && operacao != 2 && operacao != 3) {

            String mensagem = "Digite um número para realizar a operação desejada:";
            System.out.println(mensagem);
            operacao = leitor.nextInt();

        }

        System.out.println("Digite o primeiro número:");
        Integer nota01 = leitor.nextInt();
        System.out.println("Digite o segundo npúmero:");
        Integer nota02 = leitor.nextInt();

        switch (operacao) {
            case 1:
                operacao = nota01 + nota02;
                System.out.println("O resultado da operação desejada é: " + operacao);
                break;
            case 2:
                operacao = nota01 - nota02;
                System.out.println("O resultado da operação desejada é: " + operacao);
                break;
            case 3:
                operacao = nota01 * nota02;
                System.out.println("O resultado da operação desejada é: " + operacao);
        }
    }
}