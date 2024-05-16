import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private String nome;
    private List<Contato> contatos;

    public Grupo(String nome) {
        this.nome = nome;
        this.contatos = new ArrayList<>();
    }

    public Grupo() {

    }

    public void adicionar(Contato c) {
        contatos.add(c);
    }

//    public void remover(Contato c) {
//        contatos.remove(c);
//    }

    public void exibirContatos() {
        System.out.println("Contatos:");
        for (Contato contatoDaVez : contatos) {
            System.out.println(contatoDaVez);
        }
    }

    public Boolean existePorNome(String pesquisa) {
        for (Contato contato : contatos) {
            if (contato.getNome().equals(pesquisa)) {
                return true;
            }
        }
        return false;
    }

    public Contato buscarPeloNome(String pesquisa) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(pesquisa)) {
                return contato;
            }
        }
    }


    @Override
    public String toString() {
        return """              
                Nome do grupo: %s
                Lista de Contatos: %s
                                
                """.formatted(nome, contatos);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }
}
