package school.sptech.ex5;

import java.util.Scanner;

public class Ex5CalculoNutricao {

  public static void main(String[] args) {

    Ex5CalculoNutricaoMetodos metodos = new Ex5CalculoNutricaoMetodos();
    Scanner leitor = new Scanner(System.in);

    System.out.println("Digite o peso: ");
    Double peso = leitor.nextDouble();

    System.out.println("Digite a altura: ");
    Double altura = leitor.nextDouble();

    metodos.calculaIMC(peso,altura);
  }
}
