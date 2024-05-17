package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    private String nomeCliente;
    private List<Produto> produtos;

    public Compra() {
        this.produtos = new ArrayList<>();
    }

    public Compra(String nomeCliente, List<Produto> produtos) {
        this.nomeCliente = nomeCliente;
        this.produtos = new ArrayList<>();
    }


    public void adicionarProduto(Produto produto) {
        Produto produto01 = new Produto();
        if (produto != null) {
            produtos.add(produto);
        } else {
            System.out.println("Erro!");
        }

    }

    public void removerProduto(int indice) {
        if (produtos.contains(indice)) {
            produtos.remove(indice);
        } else if (indice >= produtos.size() || indice <= produtos.size() || indice == produtos.size()) {
            produtos.remove(indice);
        } else if (indice < 0) {
            produtos.remove(indice);
        } else {
            System.out.println("erro");
        }
    }


    public Integer getQuantidadeProdutos() {
        for (Produto produto : produtos) {

        }
        return getQuantidadeProdutos();
    }

    public Integer getQuantidadeProdutosFrageis() {
        return getQuantidadeProdutosFrageis();
    }

    public Produto getProdutoPorNome(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                produtos.add(produto);
            }
        }
        return null;
    }

    public List<Produto> getProdutosPorCategoria(String categoria) {
        List<Produto> listaVazia = new ArrayList<>();
        for (Produto produto : produtos) {
            if (produto.getCategoria().equalsIgnoreCase(categoria)) {
                produtos.add(produto);
            }
        }
        return listaVazia;
    }

    public Double calcularTotalFrete() {
        for (Produto produto : produtos) {
            produto.getPreco();
        }
        return null;
    }

    public Double calcularTotalProdutos() {
        Double total = 0.0;
        for (Produto produto : produtos) {
            total += produtos.size();
        }
        return null;
    }

    public Double calcularTotalCompra() {
        Double total = 0.0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return null;
    }


    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

}