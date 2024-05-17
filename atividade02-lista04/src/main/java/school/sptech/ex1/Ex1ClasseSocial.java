package school.sptech.ex1;

import jdk.jshell.execution.Util;

import java.util.Scanner;

public class Ex1ClasseSocial {

  public static void main(String[] args) {

      Ex1ClasseSocialMetodos metodos = new Ex1ClasseSocialMetodos();

      Scanner leitor = new Scanner(System.in);

      System.out.println("Digite sua renda:");
      Double renda = leitor.nextDouble();

      Double qtdSalariosMininos = metodos.calcularQtdSalariosMinimos(renda);
      String classeSocial = metodos.classeSocial(qtdSalariosMininos);

      System.out.println("""
              Você recebe aproximadamente %.1f salários-mínimos.
              Você pertence a classe social: %s.
              
              """.formatted(qtdSalariosMininos,classeSocial));

  }
}
