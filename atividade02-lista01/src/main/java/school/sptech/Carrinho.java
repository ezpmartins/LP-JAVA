package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private String cliente;
    private List<Produto> produtos;


    public Carrinho(String cliente) {
        this.cliente = cliente;
        produtos = new ArrayList<>();
    }

    public Carrinho() {

    }

    public Integer getQuantidade() {
        return produtos.size();
    }

    public void adicionar(Produto p) {
        produtos.add(p);
    }

    public Boolean existsPorNome(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return true;
            }
        }
        return false;
    }

    public Integer getQuantidadePorCategoria(String nome) {
        Integer qtdProdutosCategoria = 0;
        for (Produto produto : produtos) {
            if (produto.getCategoria().equals(nome)) {
                qtdProdutosCategoria++;
            }
        }
        return qtdProdutosCategoria;
    }

    public void limpar() {
        produtos.clear();
    }

    public void removerPorNome(String nome) {
        for (int i = 0; i < produtos.size(); i++) {
            Produto produto = produtos.get(i);
            if (produto.getNome().equalsIgnoreCase(nome)) {
                produtos.remove(i);
                i--;
            }
        }
    }

    public Produto getPorNome(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null;
    }

    public Double getValorTotal() {
        Double total = 0.0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }

}