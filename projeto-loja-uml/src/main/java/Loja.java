public class Loja {
    // Atributos

    private String nomeLoja;
    private Integer qtdVendas;
    private Integer qtdMetaVendas;
    private Double valorTotalVendas;

    //Contrutores

    public Loja(String nomeLoja, Integer qtdMetaVendas) {

        this.nomeLoja = nomeLoja;
        this.qtdVendas = 0;
        this.qtdMetaVendas = qtdMetaVendas;
        this.valorTotalVendas = 0.0;
    }

    public Loja() {
        // Construtor vazio !
    }

    //Métodos

    public void realizarVenda(Double valorVenda) {
        valorTotalVendas += valorVenda;
        qtdVendas++;
        qtdMetaVendas++;
    }

    public void realizarVenda(Double valorVenda, Double valorDesconto) {
        valorTotalVendas += valorVenda - (valorVenda * valorDesconto);
        qtdVendas++;
        qtdMetaVendas++;
    }

    public Boolean verificarMeta() {
        Boolean venda = false;

        if (qtdVendas >= qtdMetaVendas) {
            System.out.println("Foi realizado uma venda !");
        } else {
            System.out.println("Não foi realizado uma venda !");
        }
        return venda;
    }

    @Override
    public String toString() {
        return "Loja{" +
                "nomeLoja='" + nomeLoja + '\'' +
                ", qtdVendas=" + qtdVendas +
                ", qtdMetaVendas=" + qtdMetaVendas +
                ", valorTotalVendas=" + valorTotalVendas +
                '}';
    }


    // Getters & Setters

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public java.lang.Integer getQtdVendas() {
        return qtdVendas;
    }

    public void setQtdVendas(java.lang.Integer qtdVendas) {
        this.qtdVendas = qtdVendas;
    }

    public java.lang.Integer getQtdMetaVendas() {
        return qtdMetaVendas;
    }

    public void setQtdMetaVendas(java.lang.Integer qtdMetaVendas) {
        this.qtdMetaVendas = qtdMetaVendas;
    }

    public java.lang.Double getValorTotalVendas() {
        return valorTotalVendas;
    }

    public void setValorTotalVendas(java.lang.Double valorTotalVendas) {
        this.valorTotalVendas = valorTotalVendas;
    }

}
