package school.sptech;
import java.util.List;
import java.util.Scanner;
public class GestaoLoja {

    Double calcularTroco(Double totalCompra, Double valorEntregue) {
        return valorEntregue - totalCompra;
    }
     Double calcularVendas(List<Double> vendas) {
        Double totalVendas = 0.0;
        for (Double venda : vendas) {
            totalVendas += venda;
        }
        return totalVendas;
    }

    Double buscarMenorVenda(List<Double> vendas) {
        if (vendas.isEmpty()) {
            return 0.0;
        }
        Double menorVenda = vendas.get(0);
        for (Double venda : vendas) {
            if (venda < menorVenda) {
                menorVenda = venda;
            }
        }
        return menorVenda;
    }

     Boolean verificarFuncionario(List<String> funcionarios, String nomeFuncionario) {
        for (String funcionario : funcionarios) {
            if (funcionario.equalsIgnoreCase(nomeFuncionario)) {
                return true;
            }
        }
        return false;
    }
}


