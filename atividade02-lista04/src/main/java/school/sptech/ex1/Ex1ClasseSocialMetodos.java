package school.sptech.ex1;

public class Ex1ClasseSocialMetodos {

    // Coloque os métodos aqui
    Double calcularQtdSalariosMinimos(Double rendaFamiliar) {
        Double salarioMinino = 1045.0;
        return rendaFamiliar / salarioMinino;
    }

    String classeSocial(Double qtdSalariosMininos) {
        if (qtdSalariosMininos > 20) {
            return "A";
        } else if (qtdSalariosMininos > 10) {
            return "B";
        } else if (qtdSalariosMininos > 4) {
            return "C";
        } else if (qtdSalariosMininos > 2) {
            return "D";
        } else {
            return "E";
        }
    }
}
