package school.sptech.ex3;

import java.util.Scanner;

public class Ex3Idade {

    public static void main(String[] args) {

        Ex3IdadeMetodos metodos = new Ex3IdadeMetodos();
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        Integer idade = leitor.nextInt();
        metodos.classificaIdade(idade);
    }
}
