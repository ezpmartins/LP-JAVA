package desafios;

import java.util.ArrayList;
import java.util.List;

public class DesafioListas {

    public static void main(String[] args) {

        List<Integer> listaNumeros = new ArrayList<>();
        Integer soma = 0;
        listaNumeros.add(10);
        listaNumeros.add(23);
        listaNumeros.add(17);
        listaNumeros.add(60);
        listaNumeros.add(301);
        listaNumeros.add(100);
        listaNumeros.add(200);

        for (int i = 0; i < listaNumeros.size(); i++) {
            soma += listaNumeros.get(i);

            if (listaNumeros.get(i) % 2 == 0) {
                listaNumeros.remove(i);
            }
        }
        System.out.println(listaNumeros);

        System.out.println(soma);

//       System.out.println(listaNumeros);


    }
}
