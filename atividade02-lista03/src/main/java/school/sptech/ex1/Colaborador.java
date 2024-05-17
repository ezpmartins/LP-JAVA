package school.sptech.ex1;

public class Colaborador {
    // Atributos
    private String nome;
    private String cargo;
    private Double salario;

    // Construtores
    public Colaborador(String nome, String cargo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Colaborador() {
        // Construtor vazio
    }

    // Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {

        return cargo;
    }

    public void setCargo(String cargo) {

        this.cargo = cargo;
    }

    public Double getSalario() {

        return salario;
    }

    public void setSalario(Double salario) {

        this.salario = salario;
    }

}
