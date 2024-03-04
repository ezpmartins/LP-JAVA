package metodos;

import java.util.List;

public class Utilitaria {
    void exibirLista(List<String> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }

    Boolean existeNaLista(List<String> lista, String pesquisa) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals(pesquisa)) {
                return true;
            }
        }
        return false;
    }

    void exibirMensagemDaLista(Boolean existe, String tipo) {
        if (existe) {
            System.out.println(tipo + " está na lista");
        } else {
            System.out.println(tipo + " não existe na lista");
        }
    }
}


