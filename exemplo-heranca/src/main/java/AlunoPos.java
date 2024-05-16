public class AlunoPos extends Aluno {
    private Double notaTcc;

    public AlunoPos(String nome, Double notaAtividade, Double notaAvaliacao, Double notaTcc) {
        super(nome, notaAtividade, notaAvaliacao);

        this.notaTcc = notaTcc;
    }

    @Override
    public Double calcularNotaFinal() {
        return (this.getNotaAtividade() * 0.2) +
                (this.getNotaAvaliacao() * 0.2) +
                (this.getNotaTcc() * 0.6);
    }

    @Override
    public String toString() {
        return "AlunoPos{" +
                "notaTcc=" + notaTcc +
                "} " + super.toString();
    }

    public Double getNotaTcc() {
        return notaTcc;
    }

    public void setNotaTcc(Double notaTcc) {
        this.notaTcc = notaTcc;
    }
}
