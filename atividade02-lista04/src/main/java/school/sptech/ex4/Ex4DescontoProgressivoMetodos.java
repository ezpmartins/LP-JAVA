package school.sptech.ex4;

public class Ex4DescontoProgressivoMetodos {

    // Coloque os métodos aqui

    Double calcularDesconto(Double valor, Integer quantidade) {
        Double desconto;

        if (quantidade == 1) {
            desconto = valor * 0.90;
            return desconto;
        } else if (quantidade == 2) {
            desconto = valor * 0.80;
            return desconto;
        } else {
            desconto = valor * 0.70;
            return desconto;
        }
    }

    void exibirNotaFiscal(Double valor, Integer quantidade, Double valorDesconto) {
        System.out.println("""
                ------------------------------
                Valor do produto: R$%.2f
                Quantidade: %d
                ------------------------------
                Valor com desconto: R$%.2f 
                                
                """.formatted(valor, quantidade, valorDesconto));
    }

}
