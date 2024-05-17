package school.sptech;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex3ListaFrutas {

    public static void main(String[] args) {
        List listaFrutas = new ArrayList<String>();
        Scanner leitor = new Scanner(System.in);
        int i = 1;

        while (true) {
            System.out.println("Digite o nome da fruta " + i + ":");
            String fruta = leitor.nextLine();

            if (fruta.equals("0")) {
                break;
            }
            listaFrutas.add(fruta);
            i++;
        }

        System.out.println("Digite o nome para pesquisar:");
        String frutaPesquisada = leitor.nextLine();
        Boolean frutaEncontrada = false;

        for (int indice = 0; indice < listaFrutas.size(); indice++) {
            if (listaFrutas.get(indice).equals(frutaPesquisada)) {
                frutaEncontrada = true;
                break;
            }
        }
        if (frutaEncontrada) {
            System.out.println("A fruta " + frutaPesquisada + " existe na lista.");
        } else {
            System.out.println("Não existe a fruta " + frutaPesquisada + " na lista.");
        }

    }
}

