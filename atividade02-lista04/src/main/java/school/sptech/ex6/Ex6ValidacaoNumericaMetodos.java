package school.sptech.ex6;

public class Ex6ValidacaoNumericaMetodos {

    // Coloque os métodos aqui
    void verificarPrimo(Integer numero) {
        if (numero < 2) {
            System.out.println("Não é primo");
            return;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                System.out.println("Não é primo");
                return;
            }
        }
        System.out.println("É primo");
    }
}
