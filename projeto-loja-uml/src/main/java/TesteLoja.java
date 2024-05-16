public class TesteLoja {
    public static void main(String[] args) {

        Loja loja = new Loja("Fofuxinhos", 11);

        loja.realizarVenda(50.0);
        loja.realizarVenda(50.0, 0.10);
        System.out.println(loja);

        loja.verificarMeta();


    }
}
