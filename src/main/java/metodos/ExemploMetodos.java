package metodos;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ExemploMetodos {
    public static void main(String[] args) {

        Utilitaria utilitaria = new Utilitaria();

        List<String> frutas = new ArrayList<>();
        frutas.add("Laranja");
        frutas.add("Carambola");
        frutas.add("Goiaaba");
        frutas.add("Kiwi");

        System.out.println("Frutas:");
        utilitaria.exibirLista(frutas);

        System.out.println("--------------------------------------");

        String frutaPesquisa = "Goiaba";
        Boolean existeFruta = utilitaria.existeNaLista(frutas, frutaPesquisa);
        utilitaria.exibirMensagemDaLista(existeFruta,"A Fruta");

        System.out.println("--------------------------------------");


        List<String> nomes = new ArrayList<>();
        nomes.add("Enzo");
        nomes.add("Amanda");
        nomes.add("Rafael");
        nomes.add("José");

        System.out.println("Nomes:");
        utilitaria.exibirLista(nomes);

        System.out.println("--------------------------------------");

        String nomesPesquisa = "Enzo";
        Boolean existeNome = utilitaria.existeNaLista(nomes, nomesPesquisa);
        utilitaria.exibirMensagemDaLista(existeNome,"O Nome");

        System.out.println("--------------------------------------");

    }
}
