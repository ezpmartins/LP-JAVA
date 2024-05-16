public class Teste {
    public static void main(String[] args) {

        Contato contato01 = new Contato("Enzo", "11 8483502");
        Contato contato02 = new Contato("Bob", "55334343");
        Contato contato03 = new Contato("Goku", "2322132");

        Grupo grupo01 = new Grupo("Trabalho");
        Grupo grupo02 = new Grupo("Amigos");

        grupo01.adicionar(contato01);
        grupo01.adicionar(contato02);

        grupo02.adicionar(contato03);
        grupo02.adicionar(contato01);

//        System.out.println(grupo01);
//        System.out.println(grupo02);

        grupo01.exibirContatos();

        System.out.println(grupo01.existePorNome("Enzo"));

//        grupo01.remover(contato02);


    }

}
