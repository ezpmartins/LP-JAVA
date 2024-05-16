public class TesteLivro {
    public static void main(String[] args) {
        Livro livro01 = new Livro(
                1,
                "O sol da Meia Noite",
                "Enzo Martins",
                25.50,
                2,
                20);

        System.out.println(livro01);

        livro01.venderLivro();
        livro01.venderLivro();
        livro01.venderLivro();

        System.out.println(livro01.venderLivro(16));
        System.out.println(livro01.calcularTotalVendas());
        System.out.println(livro01.aumentarEstoque(20));

    }
}
