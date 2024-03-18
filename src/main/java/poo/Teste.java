public class xTeste {
    public static void main(String[] args) {

        //Instaciando um Objeto = Criando um objeto
        // Usamos o "new" para criar o objeto.

        BilheteUnico bilhete01 = new BilheteUnico();
        bilhete01.nomeTitular = "Enzo Martins";
        bilhete01.saldo = 0.0;
        bilhete01.codigo = "B001";

        BilheteUnico bilhete02= new BilheteUnico();
        bilhete02.nomeTitular = "Bob da Silva";
        bilhete02.saldo = 0.0;
        bilhete02.codigo = "B002";

        bilhete01.carregar(42.0);
        System.out.println("Saldo atual:" + bilhete01.saldo);

        bilhete02.carregar(34.0);
        System.out.println("Saldo atual:" + bilhete02.saldo);

    }
}
