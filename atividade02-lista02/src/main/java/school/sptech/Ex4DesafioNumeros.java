package school.sptech;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex4DesafioNumeros {

    public static void main(String[] args) {

        List<Integer> listaNumeros = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);
        int contador = 1;

        while (true) {
            System.out.println("Digite o " + contador + "° número:");
            Integer numeros = leitor.nextInt();

            if (numeros == 0) {
                break;
            }
            listaNumeros.add(numeros);
            contador++;
        }

        Integer numero = 0;
        System.out.print("Pares: ");
        Boolean primeiroPar = true;

        for (int i = 0; i < listaNumeros.size(); i++) {
            numero = listaNumeros.get(i);
            if (numero % 2 == 0) {
                if (!primeiroPar) {
                    System.out.print(", ");
                } else {
                    primeiroPar = false;
                }
                System.out.printf("%d", numero);
            }
        }

        System.out.println();

        System.out.print("Ímpares: ");
        Boolean primeroImpar = true;
        for (int i = 0; i < listaNumeros.size(); i++) {
            numero = listaNumeros.get(i);
            if (numero % 2 != 0) {
                if (!primeroImpar) {
                    System.out.print(", ");
                } else {
                    primeroImpar = false;
                }
                System.out.printf("%d", numero);

            }
        }

        System.out.println();

        Integer soma = 0;
        Integer menor = listaNumeros.get(0);
        Integer maior = listaNumeros.get(0);

        for (int i = 0; i < listaNumeros.size(); i++) {
            numero = listaNumeros.get(i);
            soma += numero;
            if (numero < menor) {
                menor = numero;
            }
            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println(String.format("""
                Soma: %d
                Menor número: %d
                Maior número:%d """, soma, menor, maior));
    }
}
