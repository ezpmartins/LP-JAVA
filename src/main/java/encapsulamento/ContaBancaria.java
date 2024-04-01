public class ContaBancaria {

    // Atributos
    private String nomeTitular;
    private Double saldo;

    private String codigoConta;

    private Integer agencia;

    // Consntrutor:
    // Sempre público
    //Mesmo nome da classe, idêntico
    // Não possuo retorno

    public ContaBancaria(String nomeTitular, String codigoConta, Integer agencia) {
        this.nomeTitular = nomeTitular;
        this.saldo = 0.0;
        this.codigoConta = codigoConta;
        this.agencia = agencia;
    }

    public ContaBancaria() {

    }

    //GET = Retornar um valor
    //SET = Pegar um valor

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public String getCodigoConta() {
        return codigoConta;
    }

    public void setCodigoConta(String codigoConta) {
        this.codigoConta = codigoConta;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void sacar(Double valorSaque) {
        if (valorSaque <= 0 || valorSaque > saldo) {
            System.out.println("Não é possível sacar !");
        } else {
            saldo -= valorSaque;
        }
    }
}
