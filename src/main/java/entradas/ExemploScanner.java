package entradas;

import java.util.Scanner;

public class ExemploScanner {

    public static void main(String[] args) {

        Scanner leitorNumeros = new Scanner(System.in);
        Scanner leitorLetras = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        Integer numeroDigitado = leitorNumeros.nextInt();

        System.out.println(String.format("O número digitado foi %d", numeroDigitado));


        System.out.println("Digite um número real:");
        Double numeroRealDigitado = leitorNumeros.nextDouble();

        System.out.println(String.format("O número real digitado foi %2f", numeroRealDigitado));

        System.out.println("Digite seu nome:");
        String nomeDigitado = leitorLetras.nextLine();

        System.out.println(String.format("O nome digitado foi %s",nomeDigitado));


    }
}
