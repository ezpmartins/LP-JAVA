package school.sptech.ex5;

public class Ex5CalculoNutricaoMetodos {

    // Coloque os métodos aqui
    void calculaIMC(Double peso, Double altura) {

        Double imc = peso / (altura * altura);
        System.out.println("O IMC é %.2f".formatted(imc));
    }
}
