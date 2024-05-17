package school.sptech.ex2;

import java.util.Scanner;

public class Ex2CalculoAluno {

  public static void main(String[] args) {

    Ex2CalculoAlunoMetodos metodos = new Ex2CalculoAlunoMetodos();

    Scanner leitor = new Scanner(System.in);

    System.out.println("Digite a nota 1:");
    Double primeiraNota = leitor.nextDouble();

    System.out.println("Digte a nota 2:");
    Double segundaNota = leitor.nextDouble();

    Double media = metodos.calcularMedia(primeiraNota,segundaNota);

    System.out.println("Média: %.1f".formatted(media));
  }
}
