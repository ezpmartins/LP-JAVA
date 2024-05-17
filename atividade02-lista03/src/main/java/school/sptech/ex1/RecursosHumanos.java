package school.sptech.ex1;

public class RecursosHumanos {

    // Atributos
    private Integer totalPromovidos;
    private Integer totalReajustados;

    // Construtores

    public RecursosHumanos(Integer totalPromovidos, Integer totalReajustados) {
        this.totalPromovidos = totalPromovidos;
        this.totalReajustados = totalReajustados;
    }

    public RecursosHumanos() {
        // Construtor vazio
    }

    // Métodos
    public void reajustarSalario(Colaborador colaborador, Double percentual) {
        Double novoSalario = colaborador.getSalario() * (1 + percentual / 100);
        colaborador.setSalario(novoSalario);
        totalReajustados++;
    }

    public void promover(Colaborador colaborador, String novoCargo, Double novoSalario) {
        if (novoSalario >= colaborador.getSalario()) {
            colaborador.setCargo(novoCargo);
            colaborador.setSalario(novoSalario);
            totalPromovidos++;
        } else {
            System.out.println("Você não pode ser promovido,devido ao seu salário atual !");
        }
    }

    // Getters

    public Integer getTotalPromovidos() {
        return totalPromovidos;
    }

    public Integer getTotalReajustados() {
        return totalReajustados;
    }
}
