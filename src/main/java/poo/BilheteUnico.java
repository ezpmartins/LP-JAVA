public class BilheteUnico {
    // Atributos = Caracteristicas

    String nomeTitular;
    Double saldo;
    String codigo;

    // Métodos = Comportaments

    void carregar(Double valorRecarga) {
        if (valorRecarga <= 0) {
            System.out.println("Valor Inválido!");
        } else {
            saldo += valorRecarga;
            System.out.println("Recarga efetuada !");
        }
    }
}
