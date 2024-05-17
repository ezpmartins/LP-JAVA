import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro(
                "Enzo",
                "Posrche",
                800.000,
                2024,
                0.6,
                false);

        carro.exibirRelatorioDeRevisao();

        Bicicleta bicicleta = new Bicicleta(
                "Nathan",
                "Caloi",
                1.500,
                2016,
                0.3,
                150.0);

        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(carro);
        veiculos.add(bicicleta);

        for (Veiculo veiculo : veiculos) {
            veiculo.exibirRelatorioDeRevisao();
        }

    }
}
