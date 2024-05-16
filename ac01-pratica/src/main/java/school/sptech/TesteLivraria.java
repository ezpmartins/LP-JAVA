package school.sptech;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class TesteLivraria {

    public static void main(String[] args) {

        GestaoLoja gestaoLoja = new GestaoLoja();

        Scanner leitor = new Scanner(System.in);

        List<Double> vendas = new ArrayList<>();

        System.out.print("Quantas vendas foram realizadas?");
        Integer numVendas = leitor.nextInt();

        for (int i = 0; i < numVendas; i++) {
            System.out.println("Digite o valor da venda " + (i + 1) + ": ");
            Double valorVenda = leitor.nextDouble();
            vendas.add(valorVenda);
        }


        List<String> funcionarios = new ArrayList<>();

        System.out.println("________________________");
        System.out.print("Quantos funcionários trabalham na livraria? ");
        Integer numFuncionarios = leitor.nextInt();
        System.out.println("________________________");

        for (int i = 0; i < numFuncionarios; i++) {
            System.out.print("Digite o nome do funcionário " + (i + 1) + ": ");
            String nomeFuncionario = leitor.nextLine();
            funcionarios.add(nomeFuncionario);
        }


        // ------------------------------
        Double totalCompra = leitor.nextDouble();
        System.out.print("Digite o valor entregue pelo cliente: ");
        Double valorEntregue = leitor.nextDouble();
        Double troco = gestaoLoja.calcularTroco(totalCompra, valorEntregue);
        System.out.println("Troco a ser devolvido: R$" + troco);

        Double totalVendas = gestaoLoja.calcularVendas(vendas);
        System.out.println("Total de vendas: R$" + totalVendas);

        Double menorVenda = gestaoLoja.buscarMenorVenda(vendas);
        System.out.println("Menor venda realizada: R$" + menorVenda);

        System.out.print("Digite o nome do funcionário a ser pesquisado: ");
        String nomeFuncionario = leitor.nextLine();
        Boolean existeFuncionario = gestaoLoja.verificarFuncionario(funcionarios, nomeFuncionario);
        System.out.println("Funcionário " + nomeFuncionario + " existe? " + existeFuncionario);


    }
}


