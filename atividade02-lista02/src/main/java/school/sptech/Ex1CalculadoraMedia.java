package school.sptech;

import java.util.Scanner;

public class Ex1CalculadoraMedia {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        Double primeiraNota = leitor.nextDouble();

        System.out.println("Digite a segunda nota:");
        Double segundaNota = leitor.nextDouble();

        Double media = (primeiraNota * 0.4) + (segundaNota * 0.6);
        System.out.println(String.format("""
                Média: %.1f""", media));
    }
}
