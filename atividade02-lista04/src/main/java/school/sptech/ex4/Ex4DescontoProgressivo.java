package school.sptech.ex4;

import java.util.Scanner;

public class Ex4DescontoProgressivo {

    public static void main(String[] args) {

        Ex4DescontoProgressivoMetodos metodos = new Ex4DescontoProgressivoMetodos();

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor unitário do produto:");
        Double valorUnitarioProduto = leitor.nextDouble();

        System.out.println("Digite a quantidade:");
        Integer quantidadeProduto = leitor.nextInt();

        Double valorDesconto = metodos.calcularDesconto(valorUnitarioProduto,quantidadeProduto);
        metodos.exibirNotaFiscal(valorUnitarioProduto,quantidadeProduto,valorDesconto);

    }
}
