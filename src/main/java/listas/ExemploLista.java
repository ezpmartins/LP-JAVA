package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExemploLista {

    public static void main(String[] args) {

        List listaMaluca = new ArrayList();
        listaMaluca.add("Manoel Gomes");
        listaMaluca.add(8);
        listaMaluca.add("true");
        listaMaluca.add(1.75);

        System.out.println(listaMaluca);


        listaMaluca.add(0, "Diego");
        System.out.println(listaMaluca);

        listaMaluca.set(1, "Manoel Almeida");
        System.out.println(listaMaluca);

        Integer valor = 8;
        listaMaluca.remove(valor);


        List<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(8);
        listaNumeros.add(50);
        listaNumeros.add(10);
        listaNumeros.add(2);

        System.out.println(listaNumeros);

        System.out.println("Tamanho da Lista");
        System.out.println(listaNumeros.size());

        for (int i = 0; i < listaNumeros.size(); i++) {
            System.out.println(listaNumeros.get(i));
        }

        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos valores deseja digitar?");
        Integer qtdValores = leitor.nextInt();

        for (int i = 0; i < qtdValores; i++) {
            System.out.println(String.format("Informe o %d  valor:", i + 1));
            Integer valorDigitado = leitor.nextInt();
            listaNumeros.add(valorDigitado);
        }

        System.out.println(listaNumeros);

    }
}
