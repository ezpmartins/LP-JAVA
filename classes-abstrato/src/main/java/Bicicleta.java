public class Bicicleta extends Veiculo {
    private Double nivelCalibragemPneu;
    private Double pesoMaximo;

    public Bicicleta(String proprietario, String fabricante, Double valor, Integer anoFabricacao, Double nivelCalibragemPneu, Double pesoMaximo) {
        super(proprietario, fabricante, valor, anoFabricacao);
        this.nivelCalibragemPneu = nivelCalibragemPneu;
        this.pesoMaximo = pesoMaximo;
    }

    @Override
    public void exibirRelatorioDeRevisao() {
        if (nivelCalibragemPneu < 0.8) {
            System.out.println("Precisa calibrar o pneu");
        } else {
            System.out.println("Pneu OK");
        }
    }

    public Double getNivelCalibragemPneu() {
        return nivelCalibragemPneu;
    }

    public void setNivelCalibragemPneu(Double nivelCalibragemPneu) {
        this.nivelCalibragemPneu = nivelCalibragemPneu;
    }

    public Double getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(Double pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }
}
